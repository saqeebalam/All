package com.test.services;

import com.test.entities.User;

public interface UserService {
	public void saveUser(User user);
	User findOne(String email);
}
