<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String temp = request.getParameter("param1");
int Param1 = Integer.parseInt(temp);
String temp1 = request.getParameter("param2");
String nan = "";
%>
<%!
//Non Static Variable
 double area;
public void findArea(int radius){
	//find area of circle
	area = 3.14*radius*radius;
}
public void findArea(int length, int breadth){
	//find area of circle
	area = length*breadth;
}
%>
<%
if(temp1.equals(nan)){
findArea(Param1);
%>
<h3>The Area of Circle is </h3>
<%= area %>
<%
}
else {
	int Param2 = Integer.parseInt(temp1);
	findArea(Param1, Param2);
	%><h3>The area of Rectangle</h3>
	<%= area %>
	<%
}
%>
<jsp:include page="Action.jsp"></jsp:include>
<jsp:include page="FetchDate.jsp"></jsp:include>
</body>
</html>