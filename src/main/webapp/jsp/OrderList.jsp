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
<f:form>
<f:input path="orderId"/><br>
<f:input path="cart"/><br>
<f:input path="customer"/><br>
<select><option>
<c:forEach items="${lists}" var="list">
${list.firstName}
</c:forEach>
</option></select><br>

<f:input path="status"/><br>
<f:input path="prodList"/><br>
<f:input path="billing"/><br>
<f:input path="shipping"/><br>
<input type="submit" value="Assign">
</f:form>
</body>
</html>