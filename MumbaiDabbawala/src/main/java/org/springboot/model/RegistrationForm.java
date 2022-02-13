package org.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Registration")
public class RegistrationForm {
	
	//Registration info ----> userId,first name,last name,gender,email,contact no, 
	//To make a primary key we will use @Id
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//	@Column(name="UserId")
	private long userId;
	@Column(name="First_Name")
	private String firstname;
	@Column(name="Last_Name")
	private String lastname;
	@Column(name="Email")
	private String email;
	@Column(name="Contact_No")
	private String contactno;
	@Column(name="Password")
	private String password;

	//Parameterized constructors to store the data
	public RegistrationForm(long userId, String firstname, String lastname, String email,
			String contactno, String password) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.contactno = contactno;
		this.password = password;
	}
	
	//Default constructor
	public RegistrationForm() {
		super();
	}
	
	//Getter and Setter Methods to set the data and get the data
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
