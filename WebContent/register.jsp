<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Register </title>
<%@ include file="WEB-INF/resources/common_css_js.jsp"%>
</head>
<body>



	<div class="container-fluid">
	
	<div class="row mt-5">
		<div class="col-md-5 offset-md-4">
		
		  <div class="card">
		  		  
		    <div class="card-body">
		    
          <h3 class="text-center my-3"> Register here ! </h3>
          
			<form action="RegisterServlet" method="get">
			
			    <div class="form-group">
					<label for="firstname"> First Name </label> 
					<input name="firstname" type="text" class="form-control" id="firstname" placeholder="Enter here" aria-describedby="emailHelp"> 
				</div>
				
				<div class="form-group">
					<label for="lastname"> Last Name </label> 
					<input name="lastname" type="text" class="form-control" id="lasttname" placeholder="Enter here" aria-describedby="emailHelp"> 
				</div>
				
				<div class="form-group">
					<label for="username"> Username </label> 
					<input name="username" type="text" class="form-control" id="username" placeholder="Enter here" aria-describedby="emailHelp"> 
				</div>
				
				<div class="form-group">
					<label for="exampleInputEmail1">Email address</label> 
					<input name="email" type="email" class="form-control" id="exampleInputEmail1" placeholder="your-email@example.com" aria-describedby="emailHelp"> 
					<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
				</div>
				
				<div class="form-group">
					<label for="phone"> Phone Number </label> 
					<input name="phone" type="number" class="form-control" id="phone" placeholder="Enter here" aria-describedby="emailHelp"> 
				</div>
				
				<div class="form-group">
					<label for="password"> Password </label> 
					<input name="password" type="password" class="form-control" id="password" placeholder="Enter here" aria-describedby="emailHelp"> 
				</div>
				
				<div class="container text-center">
				<button class="btn btn-outline-success"> Register </button>
				<button class="btn btn-outline-warning"> Reset </button>
				
				</div>
				
			</form>
		    
		    </div>  
	      </div>
		        
		</div>
	</div>
	           
	</div>
	<br>
  Already Registered? <a href="login.jsp"> Login </a> 
</body>
</html>