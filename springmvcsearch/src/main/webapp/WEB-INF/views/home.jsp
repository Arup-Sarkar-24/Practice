<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Home Page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css">
<style>
body {
	background-color: #f3f3f3;
	font-family: Arial, sans-serif;
	display: flex;
	flex-direction: column;
	align-items: center;
	justify-content: center;
	height: 100vh;
	margin: 0;
}

.welcome-line {
	color: #1a73e8;
	font-size: 24px;
	margin-bottom: 20px;
}

.card {
	background-color: #1a73e8;
	border-radius: 15px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

.card-body {
	text-align: center;
}

.form-control {
	border-color: #6c757d;
	color: #fff;
	background-color: #1a73e8;
}

.btn {
	border-color: #fff;
	color: #fff;
	transition: all 0.3s ease;
}

.btn:hover {
	background-color: #fff;
	color: #1a73e8;
}
</style>
<link href="<c:url value="/resources/css/style.css"/>">
<script src="<c:url value="/resources/js/script.js"/>"></script>
</head>
<body>
	<div>
		<img alt="my image"
			src="<c:url value="/resources/image/myPhoto.png"/>"
		>
	</div>
	<br>

	<div class="welcome-line text-center">
		<h1>Welcome to the Home Page</h1>
	</div>
	<div class="container">
		<div class="card mx-auto" style="width: 400px;">
			<div class="card-body">
				<h3 class="text-white">My Search</h3>
				<form action="search" class="mt-4">
					<div class="form-group">
						<input type="text" name="querybox"
							placeholder="Enter your keywords" class="form-control">
					</div>
					<button class="btn btn-outline-light mt-3">Search</button>
				</form>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>
