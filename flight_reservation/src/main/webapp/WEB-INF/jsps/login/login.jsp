<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h2 align="center">Login Here</h2>
	<form action="verifyLogin" method="post">
		Email<input type="text" name="email"><br>
		Password<input type="password" name="password">
		<input type="submit" value="Login">
	</form>
	${msg}
</body>
</html>