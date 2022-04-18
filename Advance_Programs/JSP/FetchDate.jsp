<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current Date</title>
</head>
<body>
<h1>The current date is </h1>
<%
Date date = new Date();
SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
String time = dateFormat.format(date);
%>
<h1>The date is : </h1><%= time %>
</body>
</html>