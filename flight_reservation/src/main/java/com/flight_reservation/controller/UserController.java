package com.flight_reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_reservation.entities.User;
import com.flight_reservation.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/showReg")
	public String showReg() {
		return "login/showReg";
	}
	
	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute("user") User user) {
		userRepository.save(user);
		return "login/login";
	}
	
	@RequestMapping("/loginPage")
	public String loginPage() {
		return "login/login";
	}
	
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("email") String email,@RequestParam("password") String password,Model model) {
		User user = userRepository.findByEmail(email);
		if(password.equals(user.getPassword())) {
			return "findFlight";
		}
		model.addAttribute("msg", "Invalid User Details");
		return "login/login";
	}
	
}
