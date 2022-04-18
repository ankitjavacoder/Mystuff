
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mobile number Verify</title>
</head>
<body>

	<%
	String mobile = request.getParameter("mob");
	String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
	String query = "select * from ankitdatabase.userinformation where mobileNumber = ?";
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection = DriverManager.getConnection(url);
	PreparedStatement ps = connection.prepareStatement(query);
	ps.setString(1, mobile);
	ResultSet rs= ps.executeQuery();
	if(rs.next()){
		
		%>
		<h3>Mobile Verified</h3>
	<%
	}
	else{
		
	%>
	<h3>Invalid Mobile Number</h3>
	<% }
	connection.close();
	%>
</body>
</html>