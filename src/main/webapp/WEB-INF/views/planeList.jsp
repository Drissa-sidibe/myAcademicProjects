<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<h1>Welcome to Planes</h1>
<body>
	<div class="container">
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Model</th>
				<th>Price</th>
				<th>Delete</th>
				
			</tr>
			</thead>
			<tbody>
				
				<c:forEach items="${drissa}" var="Mam"> 
				<tr>
					<td>${Mam.name}</td>
					<td>${Mam.model}</td>
					<td>${Mam.year}</td>
					<td>${Mam.price}</td>
					<td><div class ="picture">	<img src="${Mam.picture}"/></td>
						</div>	
					<a href ="/create.do?id=${Mam.id}">Add</a></h1>
					<a href ="/delete.do?id=${Mam.id}">Delete</a></h1>
				
				</tr>
				</c:forEach>
			</tbody>
	</table>
	</div>
</body>
</html>