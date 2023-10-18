<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${student }</h1>
	<h3>Student name is ${student.name}</h3>
	<h3>Student id is ${student.id}</h3>
	<h3>Student email is ${student.email}</h3>
	<h3>Student Date of birth is ${student.formattedDate}</h3>
	<h3>Selected courses are ${student.courses}</h3>
	<h3>Student's gender is ${student.gender}</h3>
	<h3>Student's type is ${student.type}</h3>
	<h3>Student's address is ${student.address}</h3>	
</body>
</html>