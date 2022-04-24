<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body style="background-color: tomato;">
<center>
	<h1>Registration Process of Bank of Jspider !</h1>
	<form action="RegistrationController" method="post">
	<label>First Name</label>
	<input name="fn"></input>
	<br></br>
	<label>Last Name</label>
	<input name="fn"></input>
	<br></br>
	<label>Mobile</label>
	<input name="mob"></input>
	<br></br>	
	<label>Aadhar Card No:</label>
	<input name="aadhar"></input>
	<br></br>
	<label>Pan Card</label>
	<input name="pancard"></input>
	<br></br>
	<label>Email - ID</label>
	<input type="email" name="email"></input>
	<br></br>
	<label>Address</label>
	<textarea name="addr"></textarea>
	<br></br>
	<label>Date of Birth</label>
	<input type="date" name="dob">
	<br></br>
	<label>Gender : </label>
	<input type="radio" name="abc">Male</input>
	<input type="radio" name="abc">Female</input>
	<br></br>
	<label>Type of Account </label>
	<input type="radio" name="type">SB</input>
	<input type="radio" name="type">FD</input>
	<input type="radio" name="type">CA</input>
	<input type="radio" name="type">RD</input>
	<br></br>	
	<label>Amount : </label>
	<input placeholder=".rs" name="amt"></input>
	<br></br>
	<label>Password : </label>
	<input type="password" name="pwd"></input>
	<br></br>
	<label>Confirm Password : </label>
	<input type="password"></input>
	<br></br>
	<input type="submit" value="Submit">
	<input type="reset" value="Reset">
	</form>
	<a href="Login.jsp">Already registered ? Login</a>
	
</center>
<%
String errormsg = (String)request.getAttribute("msg");
if(errormsg != null){
	%>
	<h1 style="color: red;"><%= errormsg %></h1>
	<%
}
%>
</body>
</html>