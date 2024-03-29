package com.bankapp.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.model.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	public Customer findByAccountAccountNumber(Long accountNumber);

	public Customer findByEmail(String email);
}
