package com.bankapp.model.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="transaction_log_table")
public class TransactionLog {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private LocalDateTime timeStamp;
	private Long fromAccount;
	private Long toAccount;
	private double txAmount;
	private String authorityName;
	private String txType;
	private String status;
	public TransactionLog() {}
	public TransactionLog(LocalDateTime timeStamp, Long fromAccount, Long toAccount, double txAmount,
			String authorityName, String txType, String status) {
		super();
		this.timeStamp = timeStamp;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.txAmount = txAmount;
		this.authorityName = authorityName;
		this.txType = txType;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
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
	public double getTxAmount() {
		return txAmount;
	}
	public void setTxAmount(double txAmount) {
		this.txAmount = txAmount;
	}
	public String getAuthorityName() {
		return authorityName;
	}
	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}
	public String getTxType() {
		return txType;
	}
	public void setTxType(String txType) {
		this.txType = txType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "TransactionLog [id=" + id + ", timeStamp=" + timeStamp + ", fromAccount=" + fromAccount + ", toAccount="
				+ toAccount + ", txAmount=" + txAmount + ", authorityName=" + authorityName + ", txType=" + txType
				+ ", status=" + status + "]";
	}
	
	
	
	

}
