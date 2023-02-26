package com.searchLead.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.searchLead.dto.Lead;

@Component
public class LeadRestClient {

	public Lead getLeadById(long id) {
		RestTemplate restTemplet = new RestTemplate();
		Lead lead = restTemplet.getForObject("http://localhost:8080/api/leads/leadinfo/"+id, Lead.class);
		return lead;						
	}
}
