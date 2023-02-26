package com.search.DAO;

public class User {
	private String firstname;
	private String lastname;
	private Long mobile;
	private Integer age;
	private String email;
	private String password;
	private Address address;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", mobile=" + mobile + ", age=" + age
				+ ", email=" + email + ", password=" + password + ", address=" + address + "]";
	}
	
	
}
