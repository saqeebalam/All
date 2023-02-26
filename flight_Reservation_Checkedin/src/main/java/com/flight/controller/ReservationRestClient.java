package com.flight.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.flight.dto.CheckedIDto;
import com.flight.dto.ReservationDto;

@RestController
@Component
public class ReservationRestClient {

	public ReservationDto getLeadById(long id) {
		RestTemplate restTemplet = new RestTemplate();
		ReservationDto reservationDto = restTemplet.getForObject("http://localhost:8080/flights/reservation/"+id, ReservationDto.class);
		return reservationDto;						
	}
	
	//@ResponseBody
	//@RequestMapping("/sendDataApi")
	public ReservationDto sendDataApi(CheckedIDto checkedIDto) {
		RestTemplate restTemplet = new RestTemplate();
		ReservationDto reservationDto = restTemplet.postForObject("http://localhost:8080/flights/reservation/update",checkedIDto , ReservationDto.class);
		return reservationDto;
	}
}
