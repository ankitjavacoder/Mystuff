<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Verify OTP</title>
</head>
<body>
<%
String temp = request.getParameter("otp");
int generateOtp = Integer.parseInt(temp);
int GeneratedOtp = (Integer)session.getAttribute("GeneratedOtp");
if(GeneratedOtp == generateOtp){
	%>
	<h2 style = "color:green">OTP Verified</h2>
	<%
}
else {
	%> 
	<h1 style="color: red">OTP not Verified</h1>
	<%
}
%>
</body>
</html>