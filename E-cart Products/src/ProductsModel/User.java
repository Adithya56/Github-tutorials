package ProductsModel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Slam_Customers")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Cust_id")
	private int id;

	@Column(name = "cust_name")
	private String name;

	@Column(name = "cust_mobile")
	private String mobile;

	@Column(name = "cust_regdate")
	private Date registrationDate;

	@Column(name = "cust_location")
	private String location;

	@Column(name = "cust_email")
	private String email;

	@Column(name = "cust_address")
	private String address;

	@Column(name = "cust_pincode")
	private String pincode;

	@Column(name = "cust_saddress")
	private String secondaryAddress;

	@Column(name = "cust_spincode")
	private String secondaryPincode;

	@Column(name = "cust_status")
	private String status;

	@Column(name = "cust_lastlogindate")
	private Date lastLoginDate;

	@Column(name = "cust_password")
	private String password;

	// Constructors, getters, and setters

	public User() {
	}

	public User(String name, String mobile, Date registrationDate, String location, String email, String address,
			String pincode, String secondaryAddress, String secondaryPincode, String status, Date lastLoginDate,
			String password) {
		this.name = name;
		this.mobile = mobile;
		this.registrationDate = registrationDate;
		this.location = location;
		this.email = email;
		this.address = address;
		this.pincode = pincode;
		this.secondaryAddress = secondaryAddress;
		this.secondaryPincode = secondaryPincode;
		this.status = status;
		this.lastLoginDate = lastLoginDate;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getSecondaryAddress() {
		return secondaryAddress;
	}

	public void setSecondaryAddress(String secondaryAddress) {
		this.secondaryAddress = secondaryAddress;
	}

	public String getSecondaryPincode() {
		return secondaryPincode;
	}

	public void setSecondaryPincode(String secondaryPincode) {
		this.secondaryPincode = secondaryPincode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// Getters and setters (omitted for brevity)
}
