<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Banking System</title>
</head>
<body style = "background-color: violet;">
	<input type="button" value="LOGOUT"></input>
	<br></br>
<%
String username = (String)session.getAttribute("un");
%>
<center><h1>UserName : <em style="background-color: lime;"><%= username %></em></h1></center>
	<form action="ViewBalanceController">
	<input type="submit" value="VIEWBALANCE"></input>
	</form>
	<br></br>
	<form action="">
	<input type="submit" value="MONEY TRANSFER"></input>	
	</form>
	<br></br>
		<form action="">
	<input type="submit" value="VIEW STATEMENT"></input>	
	</form>
	<br></br>
</body>
</html>