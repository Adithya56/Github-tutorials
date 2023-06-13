package ProductsController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ProductsModel.Order;
import ProductsModel.User;
import ProductsService.OrderService;

@Controller
@RequestMapping("/")
public class OrderTrackingController {
	ProductsModel.User user;

	@RequestMapping("/track/{userId}")
	public void trackOrdersByUserId(@PathVariable int userId) {
		// Get the user data from the database
		ProductsModel.User user = getUserFromDatabase(userId);

		if (user != null) {
			// Get the orders for the user
			List<Order> orders = OrderService.getOrdersForUser(user.getId());

			for (Order order : orders) {
				// Track each order using the API
				trackOrder(order.getId());
			}
		}
	}

	private User getUserFromDatabase(int userId) {
		Session session = null;
		ProductsModel.User user = null;
		try {
			session = HibernateUtil.getSession();
			// Retrieve the user from the database by userId
			user = session.get(ProductsModel.User.class, userId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}
		return user;
	}

	@PostMapping("/trackOrder")
	public void trackOrder(@RequestParam("orderId") int orderId) {
		// Make a request to the Shippo API to track the order
		String apiUrl = "https://shippostefan-skliarovv1.p.rapidapi.com/getSingleManifest";
		String apiKey = "8f316b6a40mshd2625b34ca6af6dp16be95jsn38d35837a6da";

		try {
			URL url = new URL(apiUrl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("X-RapidAPI-Key", apiKey);
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			conn.setDoOutput(true);

			String data = "manifestId=" + orderId;
			conn.getOutputStream().write(data.getBytes());

			int responseCode = conn.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String inputLine;
				StringBuilder response = new StringBuilder();
				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();

				// Process the response
				System.out.println(response.toString());
			} else {
				System.out.println("Error: " + responseCode);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
