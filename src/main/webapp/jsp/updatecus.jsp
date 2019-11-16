<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update</title>
</head>
<body>
<form:form action="updatecus" method="post">
<form:input path="CustomerId"/>
<form:input path="firstName"/>
<form:input path="lastName"/>
<form:input path="customerPhone"/>
<form:input path="emailId"/>
<form:input path="password"/>
<input type="submit" value="submit">
</form:form>
</body>
</html>