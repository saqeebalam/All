package com.flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flight.dto.CheckedIDto;
import com.flight.dto.ReservationDto;


@Controller
public class ReservationController {
	boolean checkedin;
	int numberOfPassenger;
	@Autowired
	private ReservationRestClient restReservClient;
	
	@RequestMapping("/search")
	public String viewSearchLeadPage() {
		return "search_Lead";
	}

	@RequestMapping("/searchbyid")
	public String searchById(@RequestParam("id") long id,Model model) {
		ReservationDto  lead = restReservClient.getLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}	

	@RequestMapping("/saveData")
	public String saveData(@RequestParam("id") long id,@RequestParam("numberOfBags") int numberOfBags) {
		CheckedIDto checkedIDto =new CheckedIDto();
		checkedIDto.setId(id);
		checkedIDto.setNumberOfBags(numberOfBags);
		checkedIDto.setCheckedIn(true);
		 restReservClient.sendDataApi(checkedIDto);
		return "search_Lead";
	}
	
}
