<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<head>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<html>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h2 class="text-center mb-3">welcome to my Product Application</h2>
				<table class="table table-striped table-dark">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Product Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${products }" var="i">
						<tr>
							<th scope="row">${i.pId }</th>
							<td>${i.pName }</td>
							<td>${i.pDescription }</td>
							<td class="font-weight-bold">&#8377;${i.pPrice }</td>
							<td ><a href="delete/${i.pId }"><i class="fas fa-trash text-danger"style="font-size:20px;"></i></a>&nbsp;
							<a href="update/${i.pId }"><i class="fas fa-pen-nib text-primary"style="font-size:20px;"></i></a></td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="container text-center">
					<a href="add-product" class="btn btn-outline-success">Add Product</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
