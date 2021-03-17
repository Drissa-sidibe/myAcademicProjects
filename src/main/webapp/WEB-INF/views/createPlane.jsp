<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="create.do" method="POST">
		Name:<input type ="text" name= "name">
		Model:<input type ="text" name= "model">
		Description:<input type ="text" name= "desccription">
		Year:<input type ="text" name= "year">
		Picture:<input type ="text" name= "picture">
		Price:<input type ="text" name= "price">
		<input type="submit" value="Create">
	</form>
</body>
</html>