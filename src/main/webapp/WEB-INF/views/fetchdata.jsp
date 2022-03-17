<%@page import="com.te.trainee.Trainee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%
 String text=(String)request.getAttribute("text");
 Trainee traine=(Trainee)request.getAttribute("trainee"); 
 %>
<!DOCTYPE html>
<html>
<head>
	<!-- Include Bootstrap CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	
	<title>Displaying Inline Code</title>
</head>
<body>
	<div class="container">
		<h3><%=text %><br></h3>
		<p>

Entered Email Id is  : <%=traine.getEmail() %><br>
Entered Number is    : <%=traine.getNumber() %><br>
Your Employee Id is  : <%=traine.getId() %><br>
			
			<code><p></code> 
		</p>
	</div>
</body>
</html>					
