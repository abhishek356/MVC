package com.spring.model;

public class User {

	
	
	
	
	private String email;
	private String UserName;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", UserName=" + UserName + ", password=" + password + "]";
	}
	
	
}
