<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	
<%@ page import = "java.util.*, com.demo.model.Employee" %>
<!-- Example of using page directive -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employee</title>
</head>
<body><center>
	<h1>Employee Data</h1>


	<!-- 
 9 implicit object created by JSP, no need to create, just use.
 1, request, 2, response, 3, out, 4, session, 5, application, 6 pageContext, 7, config, 8, exception, 9, page
  -->

	<%
	List<Employee> al = (List<Employee>) request.getAttribute("AllList");
	%>
	
	<table border = "1", bgcolor = "#EEEEEE">
		<tr bgcolor = "#CCCCCC">
			<th>Employee ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Salary</th>
			<th>Password</th>
		</tr>
		
		
		<%
		for(Employee e: al){
		%>
		<tr>
		<td>&nbsp;<%= e.getId() %>&nbsp;</td>
		<td>&nbsp;<%= e.getName() %>&nbsp;</td>
		<td>&nbsp;<%= e.getEmail() %>&nbsp;</td>
		<td>&nbsp;<%= e.getSalary() %>&nbsp;</td>
		<td>&nbsp;<%= e.getPassword() %>&nbsp;</td>
		</tr>
		<% 
		}
		%>
		
	
	</table>

</body>
</html>