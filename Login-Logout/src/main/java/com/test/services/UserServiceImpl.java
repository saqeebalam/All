package com.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entities.User;
import com.test.repositories.UserRepositories;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepositories userRepo;
	
	@Override
	public void saveUser(User user) {
		userRepo.save(user);
	}

	@Override
	public User findOne(String email) {
		User user = userRepo.findByEmail(email);
//		System.out.println("User from databases email="+user.getEmail());
//		System.out.println("User from databases password="+user.getPassword());
//		System.out.println("User from databases UserName="+user.getUserName());
//		System.out.println("User from databases User Id="+user.getId());
//		System.out.println("User from databases UserRole="+user.getRoles());
		return user;
	}
	
}


