<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Number</title>
</head>
<body style="background-color: cyan;">
 <h1 style="font-size: 50px;"><marquee> Welcome to Bank if Jspiders</marquee></h1>
 <%
 String accountNumber = (String)request.getAttribute("accNo");
 %>
 <center>
 <h2 style="color: green;">Your Registration is completed successfully Account number is </h2>
 <mark><%= accountNumber %></mark>
 </center>
</body>
</html>