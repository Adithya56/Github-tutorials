package ProductsModel;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "slam_Orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Ordr_id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "ordr_cust_id")
	private User customer;

	@Column(name = "ordr_billno")
	private int billNumber;

	@Column(name = "ordr_odate")
	private Date orderDate;

	@Column(name = "ordr_total")
	private BigDecimal total;

	@Column(name = "ordr_gst")
	private BigDecimal gst;

	@Column(name = "ordr_payreference")
	private int paymentReference;

	@Column(name = "ordr_paymode")
	private String paymentMode;

	@Column(name = "ordr_paystatus")
	private String paymentStatus;

	@Column(name = "ordr_saddress")
	private String shippingAddress;

	@Column(name = "ordr_sPincode")
	private int shippingPincode;

	@Column(name = "ordr_shipment_status")
	private String shipmentStatus;

	@Column(name = "ordr_shipment_date")
	private Date shipmentDate;

	@ManyToOne
	@JoinColumn(name = "ordr_processedby")
	private AdminUser processedBy;

	// Constructors, getters, and setters

	public Order() {
	}

	public Order(User customer, int billNumber, Date orderDate, BigDecimal total, BigDecimal gst, int paymentReference,
			String paymentMode, String paymentStatus, String shippingAddress, int shippingPincode,
			String shipmentStatus, Date shipmentDate, AdminUser processedBy) {
		this.customer = customer;
		this.billNumber = billNumber;
		this.orderDate = orderDate;
		this.total = total;
		this.gst = gst;
		this.paymentReference = paymentReference;
		this.paymentMode = paymentMode;
		this.paymentStatus = paymentStatus;
		this.shippingAddress = shippingAddress;
		this.shippingPincode = shippingPincode;
		this.shipmentStatus = shipmentStatus;
		this.shipmentDate = shipmentDate;
		this.processedBy = processedBy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}

	public int getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getGst() {
		return gst;
	}

	public void setGst(BigDecimal gst) {
		this.gst = gst;
	}

	public int getPaymentReference() {
		return paymentReference;
	}

	public void setPaymentReference(int paymentReference) {
		this.paymentReference = paymentReference;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public int getShippingPincode() {
		return shippingPincode;
	}

	public void setShippingPincode(int shippingPincode) {
		this.shippingPincode = shippingPincode;
	}

	public String getShipmentStatus() {
		return shipmentStatus;
	}

	public void setShipmentStatus(String shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}

	public Date getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(Date shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public AdminUser getProcessedBy() {
		return processedBy;
	}

	public void setProcessedBy(AdminUser processedBy) {
		this.processedBy = processedBy;
	}

	// Getters and setters (omitted for brevity)
}
