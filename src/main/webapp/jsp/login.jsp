<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<html>
<title>Happiness Basket</title>



<style>
/*set border to the form*/
form {
	border: 3px solid #f1f1f1;
}
/*assign full width inputs*/
input[type=text], input[type=password] {
	width: 50%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}
/*set a style for the buttons*/
button {
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 50%;
}
/* set a hover effect for the button*/
button:hover {
	opacity: 0.8;
}
/*set extra style for the cancel button*/
.cancelbtn {
	width: auto;
	padding: 10px 18px;
	background-color: #f44336;
}

.container {
	padding: 16px;
}

.box {
	margin-left: 400px;
}
/*set the forgot password text*/
span.psw {
	float: right;
	padding-top: 16px;
}
/*set styles for span and cancel button on small screens*/
@media screen and (max-width: 300px) {
	span.psw {
		display: block;
		float: none;
	}
.cancelbtn {
width: 100%;
	}
}
</style>

<body>

	<h2>
		<center>ADMIN LOGIN</center>
	</h2>
	<!--Step 1 : Adding HTML-->
	<div class="container">
		<f:form action="homecus" method="post" modalAttribute="Customer">


			<div class="box">
				<br> <label><b>Username</b></label> <br>
				<f:input path="emailId" name="emailId" />
				  <% request.setAttribute("emailId", "emailId") ;%>

				</br> <br> <label><b>Password</b></label> <br>
				<f:password path="password" name="password" />
				  <% request.setAttribute("password", "password") ;%> 
				</br><br>


				<button type="submit">Sign In</button>
				</a>
			</div>
		</f:form>
		<br><center> <a href="add">Sign Up</a></center>
	</div>
</body>

</html>