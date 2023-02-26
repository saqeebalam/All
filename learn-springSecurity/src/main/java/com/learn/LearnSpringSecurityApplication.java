package com.learn;

import com.learn.model.User;
import com.learn.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class LearnSpringSecurityApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(LearnSpringSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user=new User();
		user.setEmail("saqeeb@gmail.com");
		user.setUsername("saqeeb");
		user.setPassword(this.bCryptPasswordEncoder.encode("test"));
		user.setRole("ROLE_NORMAL");
		this.userRepo.save(user);
		User user1=new User();
		user1.setEmail("zaira@gmail.com");
		user1.setUsername("zaira");
		user1.setPassword(this.bCryptPasswordEncoder.encode("test"));
		user1.setRole("ROLE_ADMIN");
		this.userRepo.save(user1);
	}
}
