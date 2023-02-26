package com.flight_reservation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flight_reservation.dto.ReservationRequest;
import com.flight_reservation.entities.Flight;
import com.flight_reservation.entities.Reservation;
import com.flight_reservation.repository.FlightRepository;
import com.flight_reservation.service.ReservationService;
import com.flight_reservation.utilities.PdfGenerator;

@Controller
public class ReservationController {
	private static String filePath="C:\\Users\\91985\\Desktop\\SpringBoot\\Springboot olderversion project\\flight_reservation\\src\\ticket";
	
	@Autowired
	ReservationService reservationService;
	
	@Autowired
	FlightRepository flightRepo;
	
	@RequestMapping("/completeReservation")
	public String completeReservation(ReservationRequest reservation , ModelMap modelMap) {
		Reservation reservationId= reservationService.bookFlight(reservation);
		Optional<Flight> findById = flightRepo.findById(reservation.getFlightid());
		Flight flight = findById.get();
		modelMap.addAttribute("reservationId", reservationId.getId());
		PdfGenerator pdf = new PdfGenerator();
		pdf.generatePDF(filePath+reservation.getFlightid()+".pdf", reservation.getFirstName(), reservation.getEmail(), reservation.getPhone(), flight.getOperatingAirlines(), flight.getDateOfDeparture(), flight.getDepartureCity(), flight.getArrivalCity());
//		EmailUtil util = new EmailUtil();
//		String attachment = filePath+reservation.getId()+".pdf";
//		emailUtil.sendItinerary(request.getEmail(), attachment);
		return "confermationReservation";
	}
}
