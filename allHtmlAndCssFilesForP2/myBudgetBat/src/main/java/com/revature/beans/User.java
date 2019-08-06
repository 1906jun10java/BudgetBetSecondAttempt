package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER_TABLE")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="userSequence")
	@SequenceGenerator(allocationSize=1, name="userSequence", sequenceName="SQ_USER_PK")
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="FIRSTNAME")
	private String firstName;
	@Column(name="LASTNAME")
	private String lastName;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="EMAIL")
	private String email;
	@Column(name="INCOME")
	private int income;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String password, String email) {
		super();
		this.password = password;
		this.email = email;
	}

	public User(int userId, String firstName, String lastName, String password, String email, int income) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.income = income;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", email=" + email +", income=" + income + "]";
	}
	
	

}
