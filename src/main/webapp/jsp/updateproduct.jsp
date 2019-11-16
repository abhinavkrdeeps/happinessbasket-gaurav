<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>add Product</title>
</head>
<body>
<form:form action="updateproduct" method="post">
CategoryId:<form:input path="categoryId"/><br>
Description:<form:input path="description"/><br>
ProductCost:<form:input path="productCost"/><br>
ProductName:<form:input path="productName"/><br>
Quantity:<form:input path="quantity"/><br>
<input type="submit" value="submit">
</form:form>
</body>
</html>