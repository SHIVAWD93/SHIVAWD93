<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%-- <%
	String passkey = (String)request.getAttribute("pass");
	%>
	 --%>
	 <%
	   response.setHeader("cache-control", "no-cache,no-store,must-revalidate");
	 %>
	
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body 	class="p-3 mb-2 bg-secondary text-black">

<style>
body {
  background-image: url('/trainingmvc/bg.jpg');
}
</style>

<img src="bg.jpg" class="img-fluid" alt="...">
	<div class="container">
	
		<h2>Login Page</h2>
		<form action="./fblogin" method="get">
			<div class="form-group">
				<label for="id">User Id:</label> <input type="number"
					class="form-control" id="id" placeholder="Enter User id"
					name="id">
			</div>
			<div class="form-group">
				<label for="email">Email:</label> <input type="email"
					class="form-control" id="email" placeholder="Enter email"
					name="email"><%-- <%=passkey %> --%>
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> <input type="password"
					class="form-control" id="pwd" placeholder="Enter password"
					name="pwd"><%-- <%=passkey %> --%>
</div>
				<button type="submit" class="btn btn-default">Login</button>
		</form><br>		 
		<form action="./login">
						<button type="submit" class="btn btn-default">SignUp</button>
		
		</form>
	</div>
</body>
</html>
