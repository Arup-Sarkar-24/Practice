<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>help</title>
</head>
<body>
	<h1>this is help page</h1>
	<%
    String name = (String) request.getAttribute("name");
    Integer rollNo = (Integer) request.getAttribute("rollNo");
    List<Integer> marks=(List<Integer>)request.getAttribute("marks");
    %>
	<h1>
		Hello my Name is <%= name %></h1>
	<h1>
		Hello my rollNO is <%= rollNo %></h1>
	<hr>
	<h1>marks : <%=marks %></h1>
</body>
</html>
