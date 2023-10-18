<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Change product details</h1>
				<form action="${pageContext.request.contextPath }/handle-product" method="post">
					<input type="int" value="${product.pId }" name="pId" />
					<div class="form-group">
						<label for="pName">Product Name</label><input type="text"
							class="form-control" id="pName" aria-descibedby="emailHelp"
							name="pName" placeholder="Enter the product name here" value="${product.pName }">
					</div>
					<div class="form-group">
						<label for="pDescription">Product Description</label>
						<textarea class="form-control" name="pDescription"
							id="pDescription" row="5"
							placeholder="Enter the product description">${product.pDescription }</textarea>
					</div>
					<div class="form-group">
						<label for="pPrice">Product Price</label><input type="int"
							class="form-control" id="pPrice" name="pPrice"
							placeholder="Enter the product Price" value="${product.pPrice }">
					</div>
					<div class="container text-center">
						<a href="${pageContext.request.contextPath }"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-outline-warning">Update</button>
					</div>
				</form>
			</div>
		</div>

	</div>
</body>
</html>