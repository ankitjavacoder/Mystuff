<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File</title>
</head>
<body>
	<form action="FileStorage" enctype="multipart/form-data" method="post">
		<input placeholder="First Name" name="fn"></input><br><br>
		<input placeholder="Last Name" name="ln"></input><br><br>
		<input placeholder="email" name="mail"></input><br><br>
		<input placeholder="mobile" name="mob"></input><br><br>
		<input placeholder="password" name="pwd"></input><br><br>
		Upload Image : <input type = "file" name = "file1"></input>
		<br><br>
		<input type="submit" value="Register">
		<br><br>
	</form>
</body>
</html>