package com.bankapp.web.controller.formbeans;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserFormBean {
	
    private String name;
    @Column(unique=true)
	private String email;
	private String password;
	private String cpassword;
	private String phone;
	private String address;
	
	public UserFormBean(String name, String email, String password, String cpassword, String phone, String address) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.cpassword = cpassword;
		this.phone = phone;
		this.address = address;
	}
	
	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	public UserFormBean() {}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserFormBean [name=" + name + ", email=" + email + ", password=" + password + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
	
	

}
