package com.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.validation.entity.Login;

public interface LoginRepository extends JpaRepository<Login,Long> {

	Login findOne(String userName);


}
