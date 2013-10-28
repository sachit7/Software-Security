package com.asu.edu.form;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "userdtls")
public class UserDtls {
	@Id
	@Column(name="UserId")
    @GeneratedValue(strategy= GenerationType.AUTO)
	private Integer UserId;
	
	@Column(name="FullName")
    private String fullName;
    
	@Column(name="Phone")
    private String phone;
	@Column(name="SSN")
    private String ssn;
	@Column(name="EmailId")
    private String emailId;
    
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}