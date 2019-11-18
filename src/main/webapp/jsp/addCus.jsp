<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="addcus" method="post" >
<table>
<tr>
<td>Enter First Name :</td>
<td><f:input path="firstCusName" required="required"/></td>
</tr>
<tr>
<td>Enter Last Name :</td>
<td><f:input path="lastCusName" required="required"/></td>
</tr>
<tr>
<td>Enter Phone Number :</td>
<td><f:input path="customerPhone" required="required"/></td>
</tr>
<tr>
<td>Enter E-mail ID:</td>
<td><f:input path="cusemailId" required="required"/></td>
</tr>
<tr>
<td>Enter Password</td>
<td><f:input path="cuspassword" required="required"/></td>
</tr>
</table><br>
<input type="submit" value="Register">

</f:form>
</body>
</html>