package com.map.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Course {

	@Id
	private int cid;
	private String courseName;
	private String duration;
	@OneToOne
	private Student student;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course() {
		super();
	}
	public Course(int cid, String courseName, String duration, Student student) {
		super();
		this.cid = cid;
		this.courseName = courseName;
		this.duration = duration;
		this.student = student;
	}
	
	
}
