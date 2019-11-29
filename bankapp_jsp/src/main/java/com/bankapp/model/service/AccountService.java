package com.bankapp.model.service;

import java.util.List;

import com.bankapp.model.entities.Account;

public interface AccountService {
	
	public List<Account> getAllAccounts();
    public Account addAccount(Account account );
    public void deposit(Long accountNumber, double amount);
    public void withdraw(Long accountNumber, double amount);
    public void transfer(Long fromAccountNo, Long toAccountNo, double amount);
    public void blockAccount(Long accountNumber);

}
