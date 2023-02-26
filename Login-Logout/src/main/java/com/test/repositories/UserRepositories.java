package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entities.User;

public interface UserRepositories extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
