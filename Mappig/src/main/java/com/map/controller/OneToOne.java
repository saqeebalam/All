package com.map.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.map.service.ServiceLayer;

@RestController
public class OneToOne {
	@Autowired
	private ServiceLayer service;

	@RequestMapping("/create")
	public String mapping()
	{
		service.call();
		return "Please Wait!!";
	}
	
}
