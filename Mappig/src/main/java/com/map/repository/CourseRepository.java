package com.map.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.map.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
