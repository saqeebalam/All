package com.validation.Dto;

import javax.validation.constraints.NotBlank;

public class LoginPageDto {
	
	//@NotBlank(message = "UserName is not be empty")
	private String userName;
	//@NotBlank(message = "Password is not be empty")
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginPageDto [userName=" + userName + ", password=" + password + "]";
	}
	
}
