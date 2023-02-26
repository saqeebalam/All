package com.searchLead.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.searchLead.dto.Lead;

	@Controller
	public class LeadController {
		
		@Autowired
		private LeadRestClient leadrestclient;
		
		@RequestMapping("/search")
		public String viewSearchLeadPage() {
			return "search_Lead";
		}
	
	@RequestMapping("/searchbyid")
	public String searchById(@RequestParam("id") long id,Model model) {
		Lead lead = leadrestclient.getLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}	
	
}
