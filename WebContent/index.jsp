<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MitajStudio</title>
    <%@ include file="WEB-INF/resources/common_css_js.jsp"%>
</head>
<body>
   
   <%@include file="navbar.jsp"%>
   
	<a href="register.jsp"> Register </a> |
	<a href="login.jsp"> Login </a>
	<br>
	<a href="GetAllUser"> GetAllUser </a>
	<a href="output.jsp"> Output </a>
	<br>
	<a href="addingproduct.jsp"> Adding Product </a>
	<br>
	<a href="product.jsp"> Product </a>
	<br> ${errorMsg}
	<br>
	<a href="getAllProduct">getAllProduct</a>
	<form action="MailSend" method="post">
		to<input type="text" name="sendTo"> message<input type="text"
			name="message"> <input type="submit" value="send mail">

	</form>
</body>
</html> 