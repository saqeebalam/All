package com.flight_reservation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight_reservation.dto.ReservationRequest;
import com.flight_reservation.entities.Flight;
import com.flight_reservation.entities.Passenger;
import com.flight_reservation.entities.Reservation;
import com.flight_reservation.repository.FlightRepository;
import com.flight_reservation.repository.PassengerRepositotory;
import com.flight_reservation.repository.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	PassengerRepositotory passengerRepo;
	
	@Autowired
	FlightRepository flightRepo;
	
	@Autowired
	ReservationRepository reservationRepo;
	
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		String firstName = request.getFirstName();
		String lastName = request.getLastName();
		String middleName = request.getMiddleName();
		String email = request.getEmail();
		String phone = request.getPhone();
		
		Passenger passenger=new Passenger();
		passenger.setFirstName(firstName);
		passenger.setLastName(lastName);
		passenger.setMiddleName(middleName);
		passenger.setEmail(email);
		passenger.setPhone(phone);
		passengerRepo.save(passenger);
		long flightid = request.getFlightid();
		Optional<Flight> findById = flightRepo.findById(flightid);
		Flight flight = findById.get();
		
		Reservation reservation=new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(passenger);
		reservation.setCheckedIn(false);
		reservation.setNumberOfBags(0);
		reservationRepo.save(reservation);
		return reservation;
	}

}
