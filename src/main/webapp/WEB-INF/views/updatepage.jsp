<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">

		<h2>Update Your Account</h2>
		<form action="./updatepage" method="post">
			<div class="form-group">
				<label for="id">User Id:</label> <input type="number"
					class="form-control" id="id" placeholder="Enter User id" name="id">
			</div>
			<div class="form-group">
				<label for="email">Email:</label> <input type="email"
					class="form-control" id="email" placeholder="Enter email"
					name="email">
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> <input type="password"
					class="form-control" id="pwd" placeholder="Enter password"
					name="pwd">
			</div>
			<div class="form-group">
				<label for="number">Mobile Number:</label> <input type="number"
					class="form-control" id="number" placeholder="Enter mobile"
					name="number">
			</div>
			<button type="submit" class="btn btn-default">Update</button>

		</form>
</body>
</html>