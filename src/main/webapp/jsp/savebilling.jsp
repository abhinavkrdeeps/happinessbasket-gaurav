<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>save shipping</title>
</head>
<body>
<form:form action="savebilling" method="post">
<form:input path="customerId"/>
<form:input path="addressLine1"/>
<form:input path="addressLine2"/>
<form:input path="city"/>
<form:input path="state"/>
<form:input path="country"/>
<form:input path="pincode"/>
<form:input path="mobileno"/>
<input type="submit" value="submit">
</form:form>

</body>
</html>