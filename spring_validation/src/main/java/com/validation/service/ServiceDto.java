package com.validation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.validation.Dto.LoginDto;
import com.validation.entity.Login;
import com.validation.repository.LoginRepository;

@Service
public class ServiceDto {
	
	@Autowired
	private LoginRepository loginRepo;
	
	public Login findByOne(String userName) {
		Login findOne = loginRepo.findOne(userName);
		return findOne;
	}
}
