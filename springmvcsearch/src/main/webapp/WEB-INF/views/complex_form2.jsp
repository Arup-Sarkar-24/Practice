<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Registration Form 2</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <style>
        body {
            background-color: #f5f5f5;
            font-family: 'Arial', sans-serif;
        }
        
        h1 {
            color: #1e90ff;
            text-align: center;
            margin-top: 30px;
        }
        
        .card {
            background-color: #ffffff;
            border: none;
            border-radius: 10px;
            box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.1);
        }
        
        .card-body {
            padding: 30px;
        }
        
        .form-group label {
            color: #333;
            font-weight: bold;
        }
        
        .form-control {
            border: 1px solid #ccc;
        }
        
        .form-text {
            color: #777;
        }
        
        .form-check-label {
            color: #333;
        }
        
        .btn-primary {
            background-color: #1e90ff;
            border: none;
        }
        
        .btn-primary:hover {
            background-color: #007bff;
        }
    </style>
</head>
<body>
    <h1>This is the Registration Page. Please fill in the details.</h1>

    <div class="container mt-4">
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <div class="card">
                    <div class="card-body">
                        <h3 class="text-center mb-4">Complex Form</h3>
                        <form action="handle">
                            <div class="form-group">
                                <label for="exampleInputName">Your Name</label>
                                <input name="name" type="text" class="form-control" id="exampleInputName" placeholder="Enter Name">
                                <small class="form-text text-muted">We'll never share your name with anyone else.</small>
                            </div>
                            	<div class="form-group mt-3">
								<label for="exampleInputEmail1">Your Id</label> <input
									name="id" type="text" class="form-control mt-2"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									placeholder="Enter Id"> <small id="emailHelp"
									class="form-text text-muted">We'll never share your
									Id with anyone else.</small>
							</div>
                            <div class="form-group">
                                <label for="exampleInputEmail">Email address</label>
                                <input name="email" type="email" class="form-control" id="exampleInputEmail" placeholder="Enter email">
                                <small class="form-text">We'll never share your email with anyone else.</small>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputDOB">Your Date of Birth</label>
                                <input name="dob" type="text" class="form-control" id="exampleInputDOB" placeholder="dd/mm/yyyy">
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlSelect">Select Courses</label>
                                <select name="courses" class="form-control" id="exampleFormControlSelect" multiple>
                                    <option value="1">Java</option>
                                    <option value="2">Python</option>
                                    <option value="3">C++</option>
                                    <option value="4">Django</option>
                                    <option value="5">Spring Framework</option>
                                    <option value="6">Angular</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Select Gender</label>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="gender" id="inlineRadio1" value="male">
                                    <label class="form-check-label" for="inlineRadio1">Male</label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="gender" id="inlineRadio2" value="female">
                                    <label class="form-check-label" for="inlineRadio2">Female</label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="gender" id="inlineRadio3" value="other">
                                    <label class="form-check-label" for="inlineRadio3">Other</label>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputType">Select Type</label>
                                <select class="form-control" name="type" id="exampleInputType">
                                    <option value="oldstudent">Old Student</option>
                                    <option value="newstudent">New Student</option>
                                </select>
                            </div>
                            <div class="text-center mt-3">
                                <button type="submit" class="btn btn-primary">Submit</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>
