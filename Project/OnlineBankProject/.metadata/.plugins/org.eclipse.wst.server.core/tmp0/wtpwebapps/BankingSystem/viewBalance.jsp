<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Balance</title>
</head>
<body style="background-color: yellow;">
	<%
		String username = (String)session.getAttribute("un");
	%>
	<strong style="font-size: 30px; float: right;"><%= username %></strong>
	<form action="DisplayName.jsp">
	<input type="submit" value="Home"></input>
	</form>
	<%
		double balance = (Double) request.getAttribute("balance");
	%>
	<center>
	<h1>Your Balance Rs : <%= balance %></h1>
	</center>
</body>
</html>