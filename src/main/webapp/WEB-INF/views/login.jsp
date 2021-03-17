<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 

	<h1>Welcome to the Plane Garage</h1>
	${Error}
	<form action="login.do" method=POST>
	Username<input type="text" name="username">
	Password<input type="text" name="password">
	<input type="submit" value=login>
	</form>
</body>
</html>