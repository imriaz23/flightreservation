<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="saveUser" method="post">
First Name:<input type="text" name="firstName"/>
<br>
Last Name:<input type="text" name="lastName"/>
<br>
Email:<input type="text" name="email"/>
<br>
Password:<input type="password" name="password"/>
<br>
Confirm Password:<input type="password"/>
<br>
<input type="submit" value="Register"/>
</form>
</body>
</html>