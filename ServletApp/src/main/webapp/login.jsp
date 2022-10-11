<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="LoginServlet" method="post">
	ID<input type="number", name = "id"/><br/>
	Password<input type="text", name = "pwd"/><br/>
	<input type="submit" value="Login"/>
	</form>
	<br>
	<a href="index.jsp">Register Here</a>

</body>
</html>