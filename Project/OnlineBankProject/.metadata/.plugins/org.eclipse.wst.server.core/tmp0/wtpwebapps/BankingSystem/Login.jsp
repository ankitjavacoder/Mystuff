<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login </title>
</head>
<body style="background-color: cyan;">
<center>
	<form action="LoginController" method = "post">
	<h1>Welcome to Jspider Bank</h1>
	<label> Account Number</label>
	<input name="an">
	<br></br>
	<label>Password</label>
	<input type="password" name="pwd">
	<br></br>
	<input type="submit" value="Login">
	<br></br>
	<a href="Registration.jsp">Not yet Registered ?</a>
	</form>
	</center>
	<%
		String message = (String) request.getAttribute("msg");
	if(message != null){
		%>
		<center>
		<strong style="color: red; font-size: 20px;"><%= message %> </strong>
		</center>
		<%
	}
	%>
</body>
</html>