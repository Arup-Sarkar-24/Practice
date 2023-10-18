<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>help2</title>
</head>
<body>
	<h1>Hello my name is ${name }</h1>
	<h1>My roll is ${rollNo }</h1>
	<h1>Today's date and time is ${time }</h1>
	<hr>
	<h2>marks : ${marks }</h2>
	<c:forEach var="item" items="${marks }">
		<h3>
			<c:out value=" ${item }"></c:out>
		</h3>
	</c:forEach>

</body>
</html>