package com.asu.edu.POJO;

public class Login {
    String userName;
    String passwd;
    String userTyp;
    
    String captcha;
    
	public String getCaptcha() {
		return captcha;
	}
	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}
	public String getUserTyp() {
		return userTyp;
	}
	public void setUserTyp(String userTyp) {
		this.userTyp = userTyp;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
    
 
}
