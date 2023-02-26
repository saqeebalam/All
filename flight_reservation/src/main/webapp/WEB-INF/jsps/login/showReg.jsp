<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration Page</title>
</head>
<body>
	<h2 align="center">Registration Page</h2>
	<h4 align="center">Create One Account</h4>
	<form action="saveReg" method="post">
		First Name <input type="text" name="firstName"><br>
		Last Name  <input type="text" name="lastName"><br>
		Email      <input type="email" name="email"><br>
		Password   <input type="password" name="password"><br>
		<input type="submit" value="Save">
	</form>
</body>
</html>