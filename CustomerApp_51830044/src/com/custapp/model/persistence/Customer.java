package com.custapp.model.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "customer_table_1")
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	@NotEmpty
	private String name;

	@Email
	@NotEmpty
	private String email;
	@NotEmpty
	private String phone;
	@NotEmpty
	private String place;

	public Customer(int id, String name, String email, String phone, String place) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.place = place;
	}

	public Customer() {
		super();

	}

	public Customer(String name, String email, String phone, String place) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.place = place;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", place=" + place
				+ "]";
	}

}
