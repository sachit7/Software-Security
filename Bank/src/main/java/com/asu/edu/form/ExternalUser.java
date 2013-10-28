package com.asu.edu.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "externaluser")
public class ExternalUser {

	@Id 
	@Column(name="UserId")
	@GeneratedValue private long userId;
	
	@Column(name="CustomerID")
	private String customerId;
	
	@Column(name="AccountNo")
	private String accountNo;
	
	@Column(name="RoleId")
	private String roleId;

	@Column(name="IsLocked")
	private boolean isLocked;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public boolean isLocked() {
		return isLocked;
	}

	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}


}
