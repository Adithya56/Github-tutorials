package ProductsModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "slam_AdminUsers")
public class AdminUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ausr_id")
	private int id;

	@Column(name = "ausr_title")
	private String title;

	@Column(name = "ausr_desg")
	private String designation;

	@Column(name = "ausr_email")
	private String email;

	@Column(name = "ausr_pwd")
	private String password;

	// Constructors, getters, and setters

	public AdminUser() {
	}

	public AdminUser(String title, String designation, String email, String password) {
		this.title = title;
		this.designation = designation;
		this.email = email;
		this.password = password;
	}

	// Getters and setters for all fields

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
