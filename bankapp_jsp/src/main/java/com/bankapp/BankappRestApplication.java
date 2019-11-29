package com.bankapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.AppUser;
import com.bankapp.model.entities.Customer;
import com.bankapp.model.repo.AccountRepository;
import com.bankapp.model.repo.AccountTransactionRepository;
import com.bankapp.model.repo.AppUserRepository;
import com.bankapp.model.repo.CustomerRepository;
import com.bankapp.model.repo.TransactionLogRepository;
import com.bankapp.model.service.AccountService;
import com.bankapp.model.service.UserService;

@EnableTransactionManagement
@SpringBootApplication
public class BankappRestApplication implements CommandLineRunner {
	
	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private AccountTransactionRepository accountTransactionRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private AppUserRepository appUserRepository;

	@Autowired
	private TransactionLogRepository transactionLogRepository;

	public static void main(String[] args) {
		SpringApplication.run(BankappRestApplication.class, args);
		
		
		
	}
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private UserService userService; 


	@Override
	public void run(String... args) throws Exception {
		
		
		/*Customer customer1=new  Customer("maha", "m@gmail.com", "madurai", "9875644312", "TN", "India");
		Customer customer2=new  Customer("mirac", "mirac@gmail.com", "chennai", "9875876312", "TN", "India");
		Customer customer3=new  Customer("aysu", "aysu@gmail.com", "bnagalore", "789654312", "KARNATAKA", "India");
		
		Account account1=new Account("maha", 1000.0, false);
		Account account2=new Account("mirac", 2000.0, false);
		Account account3=new Account("aysu", 3000.0, false);
		
		customer1.setAccount(account1);
		customer2.setAccount(account2);
		customer3.setAccount(account3);
		
		account1.setCustomer(customer1);
		account2.setCustomer(customer2);
		account3.setCustomer(customer3);
		
		
		accountRepository.save(account1);
		accountRepository.save(account2);
		accountRepository.save(account3);
		
		AppUser user1=new AppUser("boni", "boni@gmail.com", "boni11", "986542162", "bangalore", 
				new String[]{"ROLE_ADMIN","ROLE_MGR","ROLE_CLERK"}, true);
		AppUser user2=new AppUser("kala", "kala@gmail.com", "kala22", "986554362", "madurai", 
				new String[]{"ROLE_MGR","ROLE_CLERK"}, true);
		AppUser user3=new AppUser("aswini", "ash@gmail.com", "ash33", "896442162", "chennai", 
				new String[]{"ROLE_CLERK"}, true);
		AppUser user4=new AppUser("prabha", "prabha@gmail.com", "prabha44", "9564342162", "madurai", 
				new String[]{"ROLE_CLERK"}, true);
		
		appUserRepository.save(user1);
		appUserRepository.save(user2);
		appUserRepository.save(user3);
		appUserRepository.save(user4);*/
		
	}

   
		
		
	
		
	

}
