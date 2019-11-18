<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Happiness Basket</title>
</head>
<body>

</head>

<body>


<f:form action="addcus" method="post" ><table>
<tr><td>Enter First Name:</td><td><f:input path="firstCusName"/></td>
</tr>
<tr><td>Enter Last Name : </td><td><f:input path="lastCusName"/></td>
</tr>
<tr><td>Enter Password : </td><td><f:input path="customerPhone"/></td>
</tr>
<tr><td>Enter E-mail ID:</td><td><f:input path="cusemailId"/></td>
</tr>
<tr><td>Enter Password :</td><td><f:input path="cuspassword"/></td>
</tr></table><br>
<input type="submit" value="Register">

</f:form>
</body>
</html>
