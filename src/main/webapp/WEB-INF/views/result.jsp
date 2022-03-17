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
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2><%=text %><br>

Your Employee Id :
<%=traine.getId() %><br>
<%=traine.getEmail() %><br>
<%=traine.getNumber() %><br>
</h2>

<form action="./facebook"><button type="submit" class="btn btn-primary">Login</button></form>
</body>
</html>