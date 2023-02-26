package com.validation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "login")
public class Login {
	
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;

	@Id
	@Column(name = "user_name",length =10 )
	private String userName;
	@Column(name = "email",nullable = false)
	private String email;
	@Column(name="password",nullable = false)
	private String password;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	
	
	
}
