package com.test.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.test.entities.User;
import com.test.repositories.UserRepositories;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepositories userRepositories;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepositories.findByEmail(email);
//		System.out.println(user.getEmail());
//		System.out.println(user.getPassword());
//		System.out.println(user.getUserName());
//		System.out.println(user.getRoles());
		
		if(user == null) {
			System.out.println("User not found for email ");
			throw new UsernameNotFoundException("User not found for email "+email);}
		
		
		return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(), (Collection<? extends GrantedAuthority>) user.getRoles());
	}

}
