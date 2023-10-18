<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Registration Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/js/toastr.min.js"></script>
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/css/toastr.min.css"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css"/>">
<script src="<c:url value="/resources/js/script.js"/>"></script>
</head>
<body class="main text-center">
	<script>
    function validateId() {
        var idInput = document.getElementById("id");
        var idValue = idInput.value;

        if (!Number.isInteger(Number(idValue))) {
            toastr.error("Please enter a valid numeric ID.", "Invalid Input");
            idInput.focus();
            return false;
        }

        return true;
    }
</script>

	<h2 style="margin-bottom: 20px;">This is the Registration Page.
		Please fill out the details.</h2>
	<div class="container">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center" style="color: blue;">Complex Form</h3>
						<div id="toast-container" class="toast-top-right"></div>
					</div>
					<div class="alert alert-danger" role="alert"> <form:errors path="students.*" /></div>
					<form action="handleform" method="post"
						onsubmit="return validateId();">
						<div class="form-group mt-3">
							<div class="name input-group mt-2">
								<span class="input-group-text">Enter your name</span> <input
									name="name.firstName" type="text" aria-label="First name"
									class="form-control" placeholder="First Name"> <input
									name="name.lastName" type="text" aria-label="Last name"
									class="form-control" placeholder="Last Name">
							</div>
							<br> <small id="emailHelp" class="form-text text-muted">We'll
								never share your name with anyone else.</small>
						</div>
						<div class="form-group mt-3">
							<label for="exampleInputEmail1">Your Id</label> <input name="id"
								type="number" class="form-control mt-2" id="id"
								aria-describedby="emailHelp" placeholder="Enter Id"> <br>
							<small id="emailHelp" class="form-text text-muted">We'll
								never share your Id with anyone else.</small>
						</div>
						<div class="form-group mt-3">
							<label for="exampleInputEmail1">Email address</label> <input
								name="email" type="email" class="form-control mt-2"
								id="exampleInputEmail1" aria-describedby="emailHelp"
								placeholder="Enter email"> <br> <small
								id="emailHelp" class="form-text">We'll never share your
								email with anyone else.</small>
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">Your Date of Birth</label> <input
								name="date" type="date" class="form-control mt-2"
								id="exampleInputEmail1" aria-describedby="emailHelp"
								placeholder="dd/mm/yyyy">
						</div>
						<div class="form-group text center mt-3">
							<div class="card mt-2">
								<div class="card-body text-center mt-2">
									<label class="text-center d-block">Select Courses</label>
									<div class="d-flex justify-content-center">
										<div class="form-check">
											<input class="form-check-input" type="checkbox"
												name="courses" id="java" value="Java"> <label
												class="form-check-label" for="java">Java</label>
										</div>
										&nbsp;&nbsp;
										<div class="form-check">
											<input class="form-check-input" type="checkbox"
												name="courses" id="python" value="Python"> <label
												class="form-check-label" for="python">Python</label>
										</div>
										&nbsp;&nbsp;
										<div class="form-check">
											<input class="form-check-input" type="checkbox"
												name="courses" id="c++" value="C++"> <label
												class="form-check-label" for="c++">C++</label>
										</div>
										&nbsp;&nbsp;
										<div class="form-check">
											<input class="form-check-input" type="checkbox"
												name="courses" id="django" value="Django"> <label
												class="form-check-label" for="django">Django</label>
										</div>
										&nbsp;&nbsp;
										<div class="form-check">
											<input class="form-check-input" type="checkbox"
												name="courses" id="springboot" value="Spring Boot">
											<label class="form-check-label" for="springboot">Spring
												Boot</label>
										</div>
										&nbsp;&nbsp;
										<div class="form-check">
											<input class="form-check-input" type="checkbox"
												name="courses" id="angular" value="Angular"> <label
												class="form-check-label" for="angular">Angular</label>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="form-group mt-3">
							<span class="mr-3">Select Gender &nbsp;&nbsp;</span>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio" name="gender"
									id="inlineRadio1" value="male"> <label
									class="form-check-label" for="inlineRadio1">Male</label>
							</div>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio" name="gender"
									id="inlineRadio2" value="female"> <label
									class="form-check-label" for="inlineRadio2">Female</label>
							</div>
							<div class="form-check form-check-inline">
								<input class="form-check-input" type="radio" name="gender"
									id="inlineRadio3" value="other"> <label
									class="form-check-label" for="inlineRadio3">Other</label>
							</div>
						</div>
						<div class="form-group mt-3">
							<label for="">Select Type</label> <select
								class="form-control mt-2" name="type">
								<option value="oldstudent">Old Student</option>
								<option value="newstudent">New Student</option>
							</select>
						</div>
						<div class="card mt-2">
							<div class="card-body text-center mt-2">
								<p>Your Address</p>
								<div class="form-group mt-2">
									<input name="address.street" type="text" class="form-control"
										placeholder="Enter Street">
								</div>
								<div class="form-group mt-2">
									<input name="address.ward" type="text" class="form-control"
										placeholder="Enter Ward">
								</div>
								<div class="form-group mt-2">
									<input name="address.city" type="text" class="form-control"
										placeholder="Enter City">
								</div>
							</div>
						</div>
						<div class="container text-center mt-3">
							<button type="submit" class="btn btn-primary">Submit</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>
