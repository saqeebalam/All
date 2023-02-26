package com.map.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.map.entity.Course;
import com.map.entity.Student;
import com.map.repository.CourseRepository;
import com.map.repository.StudentRepository;

@Service
public class ServiceLayer {
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private CourseRepository courseRepo;
	
	public void call() 
	{
//		Student s1=new Student();
//		s1.setSid(1);
//		s1.setName("Carl");
//		s1.setAge(23);
//		Course c1=new Course();
//		c1.setCid(21);
//		c1.setCourseName("Java Developer");
//		c1.setDuration("6 Months");
//		c1.setStudent(s1);
//		s1.setCourse(c1);
//		
//		Student s2=new Student();
//		s2.setSid(2);
//		s2.setName("Smith");
//		s2.setAge(25);
////		Course c2=new Course();
////		c2.setCid(212);
////		c2.setCourseName("Python Developer");
////		c2.setDuration("6 Months");
////		c2.setStudent(s2);
////		s2.setCourse(c2);
//		courseRepo.save(c1);
//		studentRepo.save(s1);
//		courseRepo.save(c1);
//		studentRepo.save(s2);
////		courseRepo.save(c2);
	}

	
}
