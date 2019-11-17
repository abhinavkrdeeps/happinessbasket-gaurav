<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Happiness Basket</title>
</head>
<body>
	  
	<div align="center">
		<table border="1">
			<tr>
				<th>Admin Id</th>
				<th>Name</th>
				<th>UserName</th>
				<th>Password</th>
			</tr>
			<c:forEach items="${lists}" var="list">
				<tr>
					<td>${list.aid}</td>
					<td>${list.name}</td>
					<td>${list.username}</td>
					<td>${list.password}</td>
					<td><a href="editAdmin?id=${list.aid}">Edit</a> <a
						href="deleteAdmin?id=${list.aid}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		</div>
</body>
</html>