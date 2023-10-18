<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
	<h1 class="text-center">This is Success page</h1>
	<h2 class="text-center">${Header}</h2>
	<p>${Desc }</p>
	<h1 style="color : green">${msg}</h1>
	<h2>Welcome , ${user.userName }</h2>
	<h3>Your email is : ${user.email }</h3>
	<h3>Your password is ${user.password } ,try to secure the
		password.</h3>
</body>
</html>