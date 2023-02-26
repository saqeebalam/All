package com.form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/users")
public class UserController {
	
	
	@GetMapping("/login")
	public String loginUser() 
	{
		System.out.println("Login User modular method call");
		return "loginUser";
	}
	
	@PostMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("username") String username,@RequestParam("password") String password) 
	{
		System.out.println("verifyLogin method call"+username+" "+password);
		return "loginUser";
	}
}
