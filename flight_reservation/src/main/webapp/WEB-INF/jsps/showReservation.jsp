<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Reservation</title>
</head>
<body>
	<h2 align="center">Reservation Details </h2>
	Flight Number=${flight.flightNumber}<br>
	Operating AirLines=${flight.operatingAirlines}<br>
	Departure City=${flight.departureCity}<br>
	Arrival City=${flight.arrivalCity}<br>
	Departure Date=${flight.dateOfDeparture}<br>
	<h3 align="center">Enter Passenger Details</h3>
	<form action="completeReservation" method="post">
	  <pre>
		First Name<input type="text" name="firstName"/>	<br>
		Last Name<input type="text" name="lastName"/>	<br>
		Middle Name<input type="text" name="middleName"/><br>	
		Email<input type="email" name="email"/>	<br>
		phone<input type="number" name="phone"/>	<br>
		<input type="hidden" name="flightid" value="${flight.id}">
		<input type="submit" value="Complete Reservation">
	  
	  </pre>
	</form>
</body>
</html>