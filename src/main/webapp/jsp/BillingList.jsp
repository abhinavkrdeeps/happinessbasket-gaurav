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
<div align="center">
		<table border="1">
			<tr>
				<th>Customer Id</th>
				<th>Address 1 :</th>
				<th>Address 2:</th>
				<th>City</th>
				<th>State</th>
				<th>Pincode</th>
				<th>Country</th>
				<th>Contact Number</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			<c:forEach items="${lists}" var="list">
				<tr>
					<td>${list.customerId}</td>
					<td>${list.addressLine1}</td>
					<td>${list.addressLine2}</td>
					<td>${list.city}</td>
					<td>${list.state}</td>
					<td>${list.country}</td>
					<td>${list.pincode}</td>
					<td>${list.mobileno}</td>
					<td><a href="editAdmin?id=${list.addressId}">Edit</a></td> 
					<td><a href="deleteAdmin?id=${list.addressId}">Delete</a></ td>
				</tr>
			</c:forEach>
		</table>
		</div>

</body>
</html>