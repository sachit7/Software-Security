package com.asu.edu.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userauthentication")
public class UserAuthentication {

	@Id
	@Column(name="UserId")
    @GeneratedValue(strategy= GenerationType.AUTO)
	private Integer UserId;
	

	@Column(name="UserName")
    private String UserName;
    @Column(name="Passwd")
    private String Passwd;

    
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPasswd() {
		return Passwd;
	}
	public void setPasswd(String passwd) {
		Passwd = passwd;
	}
	
}
