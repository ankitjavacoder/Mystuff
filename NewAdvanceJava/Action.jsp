<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Action jsp</title>
</head>
<body>
<h1>Creation of Object</h1><jsp:useBean id="employee1" class="packge1.BeanClass"></jsp:useBean>
<h3>Object Created Successfully</h3>
<h1>Initialize variable by using setter</h1>
<jsp:setProperty property="empId" name="employee1" value="100"></jsp:setProperty>
<jsp:setProperty property="empName" name="employee1" value="ABC"></jsp:setProperty>
<jsp:setProperty property="empSalary" name="employee1" value="20000"></jsp:setProperty>
<h2> Fetch Data</h2>
Employee Name : <strong> <jsp:getProperty property="empName" name="employee1"/></strong><br>
Employee Id : <strong><jsp:getProperty property="empId" name="employee1"/></strong><br>
Employee Salary : <strong><jsp:getProperty property="empSalary" name="employee1"/></strong>
</body>
</html>