package com.bankapp.web.controller.formbeans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AccountTransferBean {
	@NotEmpty(message="fromAccount can not be left blank!")
	private Long fromAccount;
	@NotEmpty(message="toAccount can not be left blank!")
	private Long toAccount;
	@NotNull(message="amount can not be null")
	@Min(value=10, message="min price should be more then 100")
	@Max(value=10000, message="max price should be less then 100000")
	private double amount;
	
	
	public AccountTransferBean() {}
	
	
	public AccountTransferBean( Long fromAccount,Long toAccount, double amount) {
		super();
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
	}


	public Long getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(Long fromAccount) {
		this.fromAccount = fromAccount;
	}
	public Long getToAccount() {
		return toAccount;
	}
	public void setToAccount(Long toAccount) {
		this.toAccount = toAccount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	


}
