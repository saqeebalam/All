package com.validation.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.validation.Dto.LoginDto;
import com.validation.Dto.LoginPageDto;
import com.validation.entity.Login;
import com.validation.repository.LoginRepository;
import com.validation.service.ServiceDto;

@Controller
public class FormController {
	
	@Autowired
	private ServiceDto service;
	
	@Autowired
	LoginRepository loginRepo;
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	@GetMapping("/login")
	public String formPage() {
		return "Test";
	}
	
	@PostMapping("/form")
	public String saveDataFromPage(@Valid @ModelAttribute("loginDto") LoginDto loginDto,BindingResult result,Model model) {
		
		String encode = encoder.encode(loginDto.getUserName());
		encoder.matches("Status="+loginDto.getUserName(), encode);
		System.out.println("UserName Encode="+encode);
		if(result.hasErrors()) {
			//System.out.println(result);
			model.addAttribute("result", result);
			return "Test";
		}
	//7	System.out.println(loginDto.toString());
		//String encode = passwordEncoder.encode(loginDto.getUserName());
		Login login=new Login();
		login.setEmail(loginDto.getEmail());
		login.setUserName(loginDto.getUserName());
		login.setPassword(encoder.encode(loginDto.getPassword()));
		loginRepo.save(login);
		model.addAttribute("loginDto", loginDto);
		return "Success"; 

	}
	@GetMapping("/loginPage")
	public String loginPage() {
		return "Login";
	}
	@PostMapping("saveLoginPage")
	public String loginPageDataSave(@Valid @ModelAttribute("loginDto") LoginPageDto loginPageDto) {
		Login findByOne = service.findByOne(loginPageDto.getUserName());
		System.out.println("password="+findByOne.getPassword());
		System.out.println("username="+findByOne.getEmail());
		//LoginPageDto findOne = loginRepo.findOne(loginPageDto.getUserName());
		//LoginDto findOne = loginRepo.findOne(loginPageDto.getUserName());
		//boolean matches = encoder.matches(loginPageDto.getPassword(),findOne.getPassword());
		//System.out.println("Matcher= "+matches);
		return "Success";
	}
}
