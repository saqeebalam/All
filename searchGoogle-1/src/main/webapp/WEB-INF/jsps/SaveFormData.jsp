<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Form Data</title>
</head>
<body>

<h1 align="center">Save Form Data</h1>
	<h2 align="center">Data Save In Form </h2>
  <h4>First Name:- ${user.firstname}</h4>
  <h4>Last Name:- ${user.lastname}</h4>
  <h4>Mobile:- ${user.mobile}</h4>
  <h4>Age is:- ${user.age}</h4>
  <h4>Email is:- ${user.email}</h4>
  <h4>Password:- is ${user.password}</h4>
  <h4>Address 1:-  ${user.address.address1}</h4>
  <h4>Address 2:- ${user.address.address2}</h4>
  <h4>City is:- ${user.address.city}</h4>
  <h4>State:-${user.address.state}</h4>
  <h4>Pin Code:-${user.address.zip}</h4>
</body>
</html>