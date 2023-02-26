package com.map.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	//@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int sid;
	private String name;
	private int age;
	@OneToOne
	private Course course;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course cours) {
		this.course = cours;
	}
	public Student() {
		super();
	}
	
	
}
