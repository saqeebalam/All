<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
	<h2>Lead Info </h2>
	<h3>Passenger Details</h3>
    <form action="saveData" method="post"> 
		Lead Id:${lead.id}<br/>
		First Name:${lead.getPassenger().firstName} <br/>
		Middle Name:${lead.getPassenger().middleName}<br/>
		Last Name:${lead.getPassenger().lastName}<br/>
		Email:${lead.getPassenger().email}<br/>
		Mobile:${lead.getPassenger().phone}<br/> 
	<h3>Flight Details</h3>
	   Flight Number:${lead.getFlight().flightNumber}<br/> 
	   Operating Airlines:${lead.getFlight().operatingAirlines}<br/> 
	   Departure City:${lead.getFlight().departureCity}<br/>
	   Arrival City:${lead.getFlight().arrivalCity}<br/>
	   Date Of Departure:${lead.getFlight().dateOfDeparture}<br/>
	   Estimated Departure Time:${lead.getFlight().estimatedDepartureTime}<br/>
  <!--  <h3>Bags Details</h3>
	Checked In:${lead.checkedIn}<br/>
	Number Of Bags:${lead.numberOfBags}<br/>  -->
	 <h3>Enter Bags Details</h3>

	 <!-- Input True or False 
	 Checked In<input type="text" name="checkedin"> -->
	 Reservation id:<input type="number" name="id" value="${lead.id}">
	 Number Of Bags<input type="number" name="numberOfBags">
	 <input type="submit" name="Save">
	 </form>
</body>
</html>