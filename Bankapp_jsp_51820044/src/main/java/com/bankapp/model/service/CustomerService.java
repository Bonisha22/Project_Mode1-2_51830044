package com.bankapp.model.service;

import java.util.List;

import com.bankapp.model.entities.Customer;

public interface CustomerService {
	
	public List<Customer> getAllCustomers();
	public Customer findByEmail(String email);
	public Customer getCustomerById(Long id);
	public void addCustomer(Customer customer);
	public void update(Customer customer);
	public void delete(Long id);

}
