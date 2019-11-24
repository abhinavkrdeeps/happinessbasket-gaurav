<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>add Product</title>
</head>
<body>
<form action="addproduct" method="post">

Select Category <select name="category">

<c:forEach items="${categories}" var="category">
<option value="${category.getCategoryid()}">${category.getCategoryName()}</option>

</c:forEach>

</select>

Name <input type="text" name="productName"></br>

Description <input type="text" name="productDescription"></br>

price <input type="text" name="price"></br>

Quantity <input type="number" name="quantity"></br>

<input type="submit" value="ADD">
</form>
</body>
</html>