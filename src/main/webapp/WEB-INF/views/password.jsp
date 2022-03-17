<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    String msg = (String)request.getAttribute("msg");
    int id =(int)request.getAttribute("userid");
   String pwd =(String)request.getAttribute("pwd");
	String passkey = (String)request.getAttribute("pass");
   response.setHeader("cache-control", "no-cache,no-store,must-revalidate");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<img src="bg.jpg" class="img-fluid" alt="...">
<h2><%=msg %><br></h2>
<h2>Your User Details is :</h2>
<h3><%=id %><br></h3>
<form action="./facebook"><button type="submit" class="btn btn-primary">Logout</button></form><br>
<form action="./deletePage"><button type="submit" class="btn btn-primary">Delete Account</button></form><br>
<form action="./upadte" ><button type="submit" class="btn btn-primary">Update Account</button></form><br>
 </body>
</html>