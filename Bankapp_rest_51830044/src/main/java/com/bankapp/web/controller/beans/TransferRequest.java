package com.bankapp.web.controller.beans;

public class TransferRequest {
	private Long toaccount;
	private Long fromaccount;
	private Double amount;

	public Long getToaccount() {
		return toaccount;
	}

	public void setToaccount(Long toaccount) {
		this.toaccount = toaccount;
	}

	public Long getFromaccount() {
		return fromaccount;
	}

	public void setFromaccount(Long fromaccount) {
		this.fromaccount = fromaccount;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public TransferRequest(Long toaccount, Long fromaccount, Double amount) {
		super();
		this.toaccount = toaccount;
		this.fromaccount = fromaccount;
		this.amount = amount;
	}

	public TransferRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

}
