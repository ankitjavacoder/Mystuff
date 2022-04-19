<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OutPut here</title>
</head>
<body>
<%
String element = request.getParameter("input");
if(element.equalsIgnoreCase("Scriplets"))
{	
	%>
	<jsp:forward page="FetchDate.jsp"></jsp:forward>
	<%
}
else if (element.equalsIgnoreCase("Action"))
{
	%>
	<jsp:forward page="Action.jsp"></jsp:forward>
	<%
}
else if(element.equalsIgnoreCase("Directive")){
%>
<jsp:forward page="FindArea_jsp.jsp"></jsp:forward>
<%
}
%>
</body>
</html>