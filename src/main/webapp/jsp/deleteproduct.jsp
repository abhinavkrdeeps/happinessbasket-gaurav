<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
enter product id:
<form:form action="delproduct" method="post" modalAttribute="Product">
<form:input path="productId" name="productId"/>
<input type="submit" value="submit">
</form:form>
</body>
</html>