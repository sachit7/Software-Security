package com.asu.edu.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accountdtls")
public class AccountDtls {
	@Id 
	@Column(name="AccountNo")
	@GeneratedValue private long accntNo;
	@Column(name="Balance")
	private String balance;
	@Column(name="DateOfCreation")
	private String dateOfCreation;
	
	public long getAccntNo() {
		return accntNo;
	}
	public void setAccntNo(long accntNo) {
		this.accntNo = accntNo;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(String dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

}
