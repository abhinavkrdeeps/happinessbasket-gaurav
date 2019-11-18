<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Happiness Basket</title>
</head>
<body>
<table>
<form:form action="updateshipping" method="post">
<tr>
<tr><td>Enter Customer ID</td><td><form:input path="customerId"/></tr>
<tr><td>Enter Address1</td><td><form:input path="addressLine1"/></tr>
<tr><td>Enter Address2</td><td><form:input path="addressLine2"/></tr>
<tr><td>Enter City</td><td><form:input path="city"/></tr>
<tr><td>Enter Pin code</td><td><form:input path="pincode"/></tr>
<tr><td>Enter State</td><td><form:input path="state"/></tr>
<tr><td>Enter Country</td><td><form:input path="country"/></tr>
<tr><td>Enter Contact No.</td><td><form:input path="mobileno"/></tr><br>
<tr><td><input type="submit" value="Save"></td></tr>
<form:hidden path="addressId"/>
</form:form>
</table>
</body>
</html>