<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

	<form action="RegistrationSevlet" method="post">
	ID<input type="number", name = "id"/><br/>
	Name<input type="text", name = "name"/><br/>
	Email<input type="text", name = "email"/><br/>

	Salary<input type="int", name = "salary"/><br/>
	Password<input type="text", name = "pwd"/><br/>
	<input type="submit" value="Add"/>
	</form>
	
</body>
</html>