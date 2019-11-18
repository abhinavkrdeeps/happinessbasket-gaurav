<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Happiness Basket</title>
</head>
<body>
<f:form action="add" method="post" >

<table>
<tr>
<td>Enter Admin Name:</td>
<td><f:input path="name" required="required"/></td>
</tr>
<tr>
<td>Enter Email ID:</td>
<td><f:input path="emailid" required="required"/></td>
</tr>
<tr>
<td>Enter username :</td>
<td><f:input path="username" required="required"/></td>
</tr>
<tr>
<td>Enter Password</td>
<td><f:input path="password" required="required"/></td>
</tr>
</table><br>
<input type="submit" value="Add Admin">


</f:form>
</body>
</html>