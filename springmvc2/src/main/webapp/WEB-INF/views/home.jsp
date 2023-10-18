<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
<h1>this is home page</h1>
<h2>Called by home controller</h2>
<h1>url /home</h1>
<%String name= (String) request.getAttribute("name"); 
 Integer id=(Integer) request.getAttribute("id");
 List<String> friends = (List<String>) request.getAttribute("f");
%>
<h2>Name is <%=name %></h2>
<h2>Id is <%=id %></h2>
<h2>
<%for(String s:friends){
	out.println(s);}%>
</h2>
<%for(String s:friends){ %>
<h3><%=s %> </h3>
	<%}%>
</body>
</html>