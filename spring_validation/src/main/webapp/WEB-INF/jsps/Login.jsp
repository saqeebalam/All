<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
	<h2 align="center">Login</h2>
	<form action="saveLoginPage" method="post">
		UserName<input type="text" name="userName">
		Password<input type="text" name="password">
		<input type="submit" value="Login">
	</form>
</body>
</html>