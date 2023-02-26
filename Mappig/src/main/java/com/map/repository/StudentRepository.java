package com.map.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.map.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
