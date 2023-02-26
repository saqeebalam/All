package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.entities.User;
import com.test.services.UserDetailsServiceImpl;
import com.test.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	UserDetailsServiceImpl 	userDetailsServiceImpl;
	
	@RequestMapping("/")
	public String viewHomePage() {
		return "home";
	}
	
	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		return "login/registerUser";
	}
	
	@RequestMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));//it encode password
		userService.saveUser(user);
		return "login/registerUser";
	}
	
	@RequestMapping("/showLogin")
	public String showLoginPage() {
		return "login/login";
	}
	
	@RequestMapping("login")
	public String verifyLogin(@RequestParam("userName") String email,@RequestParam("password") String password, Model model) {
//this line verify from service 
		//		System.out.println("userName= "+email);
//		System.out.println("Password= "+password);
//		User findOne = userService.findOne(email);
//		boolean matches = passwordEncoder.matches(password, findOne.getPassword());
//		System.out.println("Verify Or Not="+matches);
//		this line is verify user from userDetailsServiceImpl method.
		UserDetails loadUserByUsername = userDetailsServiceImpl.loadUserByUsername(email);
//		System.out.println(loadUserByUsername.getUsername());
//		System.out.println(loadUserByUsername.getUsername());
//		System.out.println(loadUserByUsername.getAuthorities());
		boolean matches = passwordEncoder.matches(password, loadUserByUsername.getPassword());
		System.out.println(matches);
		if(matches==true) {
			return "addFlight";
		}
		model.addAttribute("error", "Invalid UserName and Password");
		return "login/login";
	}
	
}
