<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Flight</title>
</head>
<body>
	<h2 align="center">Search Flight</h2>
	
	<form action="findFlights" method="post"> 
		From:<input type="text" name="from"/><br><br>
		To:<input type="text" name="to"/><br><br>
		Date is in Format of MM-DD-YYYY <br><br>
		Departure Date<input type="text" name="departureDate"/><br><br>
		<input type="submit" value="Search">
	</form>
	
</body>
</html>