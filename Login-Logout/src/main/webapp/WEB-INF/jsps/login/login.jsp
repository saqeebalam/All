<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form action="login" method="post"> 
		User Name<input type="text" name="userName">
		Password<input type="text" name="password">
		<input type="submit" value="login">
	</form>
	${error}
</body>
</html>