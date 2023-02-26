<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register page</title>
</head>
<body>
	<form action="registerUser" method="post"> 
		Name<input type="text" name="userName"/><br>
		Email<input type="email" name="email"/><br>
		Password<input type="text" name="password"/><br>
		Confirm Password<input type="text" name="confirmPassword"/><br>
		<input type="submit" value="Register">
	</form>

</body>
</html>