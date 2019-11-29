package com.bankapp.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.model.entities.Customer;
import com.bankapp.model.repo.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private CustomerRepository custRepo;
	

	@Override
	public List<Customer> getAllCustomers() {
		
		return custRepo.findAll();
	}

	@Override
	public Customer findByEmail(String email) {
		
		return custRepo.findByEmail(email);
	}
	
	@Override
	public Customer getCustomerById(Long id) {
		
		return custRepo.findById(id).orElseThrow(RuntimeException:: new);
	}

	@Override
	public void addCustomer(Customer customer) {
		custRepo.save(customer);
		
	}

	@Override
	public void update(Customer customer) {
		
		custRepo.save(customer);
		
		
		
		
		
	}

	@Override
	public void delete(Long id) {
		custRepo.deleteById(id);
		
		
	}

	

}
