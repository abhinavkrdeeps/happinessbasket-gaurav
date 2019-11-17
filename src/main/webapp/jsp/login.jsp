<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<title>Happiness Basket</title>


	
	<style> 
    /*set border to the form*/ 
      
    form { 
        border: 3px solid #f1f1f1; 
    } 
    /*assign full width inputs*/ 
      
    input[type=text], 
    input[type=password] { 
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
    /*centre the display image inside the container*/ 
      
   
    /*set image properties*/ 
      
  
    /*set padding to the container*/ 
      
    .container { 
        padding: 16px; 
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

    <h2><center>LOGIN</center></h2> 
    <!--Step 1 : Adding HTML-->
  <f:form action="homecus" method="post" modalAttribute="Customer">

  
        <div class="container"> 
           <br> <label><b>Username</b></label>
            <br>
            <f:input path="emailId" name="emailId"/>
          <%--  <% request.setAttribute("emailId", "emailId") ;%> --%>
            
            </br> 
  
           <br> <label><b>Password</b></label> 
           <br> 
           <f:password path="password" name="password"/>
          <%--  <% request.setAttribute("password", "password") ;%> --%>
           </br> 
           </div>
  
			<button type="submit">Sign In</button></a>            
        
 </f:form>
 
		  <a href="add">Sign Up</a>	
  </body>

</html>