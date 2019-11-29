package com.bankapp.model.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.AccountTransaction;
import com.bankapp.model.entities.TransactionLog;
import com.bankapp.model.repo.AccountRepository;
import com.bankapp.model.repo.AccountTransactionRepository;
import com.bankapp.model.repo.CustomerRepository;
import com.bankapp.model.repo.TransactionLogRepository;
import com.bankapp.model.service.exception.AccountNotFoundException;
import com.bankapp.model.service.exception.NotSufficientFundException;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private AccountTransactionRepository accountTransactionRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private TransactionLogRepository transactionLogRepository;

	@Override
	public Account addAccount(Account account) {
		accountRepository.save(account);
		customerRepository.save(account.getCustomer());
		return account;
		
		
	}

	@Override
	public void deposit(Long accountNumber, double amount) {
		Account account=accountRepository.findById(accountNumber).orElseThrow(AccountNotFoundException::new);
		account.setBalance(account.getBalance()+amount);
		AccountTransaction accountTransaction=new AccountTransaction(LocalDate.now(), "deposit", amount);
		account.addAccountTransaction(accountTransaction);
		accountRepository.save(account);
		
		TransactionLog log=new TransactionLog(LocalDateTime.now(),
				accountNumber, null, amount, "kala", "deposit","done" );
				transactionLogRepository.save(log);
		
		
		
	}

	@Override
	public void withdraw(Long accountNumber, double amount) {
		
		Account account=accountRepository.findById(accountNumber)
				.orElseThrow(AccountNotFoundException::new);
		if(account.getBalance()-amount<1000)
			throw new NotSufficientFundException();
		account.setBalance(account.getBalance()-amount);
		
		
		AccountTransaction accountTransaction=new AccountTransaction(LocalDate.now(), "withdraw", amount);
		account.addAccountTransaction(accountTransaction);
		accountRepository.save(account);
		
		TransactionLog log=new TransactionLog(LocalDateTime.now(),
				accountNumber, null, amount, "boni", "withdraw","done" );
				transactionLogRepository.save(log);
		
		
	}

	@Override
	public void transfer(Long fromAccountNo, Long toAccountNo, double amount) {
		Account fromAcc=accountRepository.findById(fromAccountNo)
				.orElseThrow(AccountNotFoundException::new);
		if(fromAcc.getBalance()-amount<1000)
			throw new NotSufficientFundException();
		
		fromAcc.setBalance(fromAcc.getBalance()-amount);
		Account toAcc=accountRepository.findById(toAccountNo).orElseThrow(AccountNotFoundException::new);
		toAcc.setBalance(toAcc.getBalance()+amount);
		
		/*AccountTransaction accountTransaction=new AccountTransaction(LocalDate.now(), "transfer", amount);
		account.addAccountTransaction(accountTransaction);
		accountRepository.save(account);*/
		
	
		
	}

	@Override
	public void blockAccount(Long accountNumber) {
	
		
	}

	@Override
	public List<Account> getAllAccounts() {
		
		return accountRepository.findAll();
	}

}
