<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Login </title>
<%@ include file="WEB-INF/resources/common_css_js.jsp"%>
</head>
<body>

	
	<div class="contianer">
		<div class="row">
			<div class="col-md-4 offset-md-4">

				<div class="card mt-3">

					<div class="card-header custom-bg text-black">
						<h3>Login here</h3>
					</div>

					<div class="card-body">
			<form action="LoginServlet" method="post">
							<div class="form-group">
								<label for="exampleInputEmail1">Email address</label> 
								<input type="email" name="email" class="form-control" id="exampleInputEmail1" placeholder="email@example.com" aria-describedby="emailHelp"> 
								<small id="emailHelp" class="form-text text-muted">We'll never share your
									email with anyone else.</small>
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Password</label>
								<input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder=" Password ">
							</div>
							<div class="form-group">
								<div class="form-check">
									<input type="checkbox" class="form-check-input"	id="dropdownCheck"> 
									<label class="form-check-label"	for="dropdownCheck"> Remember me </label>
								</div>
							</div>

							<div class="container text-center">
						     	<button type="submit" class="btn btn-primary custom-bg border-0">Login</button>
						     	<button type="reset" class="btn btn-primary custom-bg border-0">Reset</button>
							</div>
							
						</form>
						 <a href="register.jsp"> New around here? Sign up </a>
						 <br>
                          <a href="#">Forgot password?</a>
					</div>

			</div>
		</div>
	</div>
	
	</form>
	<br> New User?
	<a href="register.jsp"> Register </a>
</body>
</html>