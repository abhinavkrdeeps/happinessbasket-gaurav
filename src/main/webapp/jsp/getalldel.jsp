<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="getdel">
<table border="1">

			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Phone Number</th>
				<th>E-mail Id</th>
				<th>Password</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
			<c:forEach items="${lists}" var="list">
				<tr>
					<td>${list.firstName}</td>
					<td>${list.lastName}</td>
					<td>${list.Phone}</td>
					<td>${list.emailId}</td>
					<td>${list.password}</td>
					<td><a href="updatedelAdmin?id=${list.deliverpersonId}">Update</a></td>
					<td><a href="deletedel?id=${list.deliverpersonId}">Delete</a></td>
				</tr>
			</c:forEach>
		</table> 
		</form>
</body>
</html>