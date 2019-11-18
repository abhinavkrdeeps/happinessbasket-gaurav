<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Happiness Basket </title>
</head>
<body>
<f:form action="adddel" method="post" ><table>
<tr><td>Enter First Name:</td><td><f:input path="firstName"/></td>
</tr>
<tr><td>Enter Last Name : </td><td><f:input path="lastName"/></td>
</tr>
<tr><td>Enter Contact No. : </td><td><f:input path="Phone"/></td>
</tr>
<tr><td>Enter E-mail ID:</td><td><f:input path="emailId"/></td>
</tr>
<tr><td>Enter Password :</td><td><f:input path="password"/></td>
</tr></table><br>
<input type="submit" value="Register">

</f:form>
</body>
</html>