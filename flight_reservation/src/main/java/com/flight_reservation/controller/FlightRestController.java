package com.flight_reservation.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight_reservation.dto.ReservationRequestUpdate;
import com.flight_reservation.entities.Reservation;
import com.flight_reservation.repository.ReservationRepository;

@RestController
public class FlightRestController {
	
	@Autowired
	ReservationRepository reservationRepo;
	
	@GetMapping("/reservation/{id}")
	public Reservation getFlightDetails(@PathVariable("id") long id) {
		Optional<Reservation> findById = reservationRepo.findById(id);
		Reservation reservation = findById.get();
		return reservation;
	}
	
	@RequestMapping("/reservation/update")
	public Reservation updateResservation(@RequestBody ReservationRequestUpdate request) {
//		System.out.println(request.getId());
//		System.out.println(request.getNumberOfBags());
//		System.out.println(request.isCheckedIn());
		Optional<Reservation> findById = reservationRepo.findById(request.getId());
		Reservation reservation = findById.get();
		reservation.setId(request.getId());
		reservation.setCheckedIn(request.isCheckedIn());
		reservation.setNumberOfBags(request.getNumberOfBags());
		return reservationRepo.save(reservation);
		
	}
}

