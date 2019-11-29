package com.bankapp.web.controller.formbeans;

public class TransactionBean {
	private Long fromAccount;
	private double amount;
	
	public TransactionBean() {}

	public TransactionBean(Long fromAccount, double amount) {
		super();
		this.fromAccount = fromAccount;
		this.amount = amount;
	}

	public Long getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(Long fromAccount) {
		this.fromAccount = fromAccount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	


}
