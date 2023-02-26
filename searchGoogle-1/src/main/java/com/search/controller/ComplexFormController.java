package com.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.search.DAO.User;

@Controller
public class ComplexFormController {

	@RequestMapping("/complex")
	public String form()
	{
		return "ComplexForm";
	}
	
	@RequestMapping("/processForm")
	public String processFormData(@ModelAttribute("user") User user)
	{
		System.out.println(user);
		System.out.println(user.getAddress());
		//model.addAttribute("user", "user");
		return "SaveFormData";
	}
}
