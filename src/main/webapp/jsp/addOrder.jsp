<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="successOrder" method="post">
<table>
<tr> <td>Enter Cart Id</td> <td><f:input path="cart"/> </td> </tr>
<tr> <td>Enter Delivery Person ID</td> <td><f:input path="customer"/></td> </tr>
<tr> <td>Enter Customer ID</td> <td><f:input path="deliveryperson"/></td> </tr>
<tr> <td>Status</td> <td>In Progress<f:radiobutton path="status" value="inprogress"/>   Delivered<f:radiobutton path="status" value="Delivered"/></td> </tr>
</table>
</f:form>

</body>
</html>