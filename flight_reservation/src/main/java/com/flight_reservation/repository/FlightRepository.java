package com.flight_reservation.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flight_reservation.entities.Flight;


public interface FlightRepository extends JpaRepository<Flight, Long> {
	//Annotation to declare finder queries directly on repository methods aur when multiple value is passing for search then it is use
	
	@Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture ")
	List<Flight> findFlights(@Param("departureCity") String from,@Param("arrivalCity") String to,@Param("dateOfDeparture") Date departureDate);

}
