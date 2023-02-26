package com.validation.Dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class LoginDto {
	
	@NotBlank(message = "UserName is Not be Null")
	@Size(min = 3,max = 10,message = "Size in between 3 to 10")
	private String userName;
	@NotBlank(message = "Email is Not be Null")
	@Email(message = "Invalid email id")
	private String email;
	@NotBlank(message = "Password is Not be Null")
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginDto [userName=" + userName + ", email=" + email + ", password=" + password + "]";
	}
	
	

}
