package ProductsService;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import ProductsController.HibernateUtil;
import ProductsModel.Order;

public class OrderService {
	public static List<Order> getOrdersForUser(int userId) {
		Session session = null;
		try {
			session = HibernateUtil.getSession();
			String sql = "SELECT * FROM slam_Orders WHERE ordr_cust_id = :userId";
			NativeQuery<Order> query = session.createNativeQuery(sql, Order.class);
			query.setParameter("userId", userId);
			return query.list();
		} finally {
			HibernateUtil.closeSession(session);
		}
	}
}
