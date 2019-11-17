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
<f:form action="update/${id}" method="post" >
Enter First Name:<f:input path="firstName"/>
Enter Last Name : <f:input path="lastName"/>
Enter Password : <f:input path="Phone"/>
Enter E-mail ID:<f:input path="emailId"/>
Enter Password :<f:input path="password"/>
<f:hidden path="deliverypersonId"/>
<input type="submit" value="Register">
</f:form> 
</body>
</html>