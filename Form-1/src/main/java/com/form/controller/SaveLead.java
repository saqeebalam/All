package com.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.form.entities.LeadEntity;
import com.form.service.LeadService;

@Controller
//@RequestMapping("/lead")
public class SaveLead {
	
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/lead")
	public String callLoginPage() {
		//System.out.println("callLoginPageCall");
		return "UserRegistration";
	}
	
	
	@RequestMapping("/saveLead")
	public String saveLead(LeadEntity leadEntity) {
		//System.out.println(leadEntity.getFirstName());
		leadService.saveLead(leadEntity); 
		return null;
	}

}
