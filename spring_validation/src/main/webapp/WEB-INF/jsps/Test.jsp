<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">Login Here</h2>
	<form action="form" method="post">
		UserName<input type="text" name="userName" value="">
		
		Email<input type="text" name="email" value="">
		
		Password<input type="password" name="password">
		<input type="submit" value="Save">
	</form>
	Message:-${result}
	
</body>
</html>