<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Contact</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
	<h1 class="text-center">This is contact page</h1>
	<div class="container mt-5 text-center">
		<h3>Registration form</h3>
		<h2 class="text-center">${Header}</h2>
		<p>${Desc }</p>
		<form action="processform" method="post">
			<div class="form-group">
				<label for="userName">User Name</label> <input type="text"
					class="form-control" id="userName" aria-describedby="emailHelp"
					placeholder="Enter name here" name="userName">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> <input
					type="email" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter email here"
					name="email">
			</div>

			<div class="form-group">
				<label for="userPassword">User Password</label> <input
					type="password" class="form-control" id="userPassword"
					aria-describedby="emailHelp" placeholder="Enter password here"
					name="password">
			</div>

			<div class="container text-center mt-3">
				<button type="submit" class="btn btn-success">Sign Up</button>
			</div>
		</form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>