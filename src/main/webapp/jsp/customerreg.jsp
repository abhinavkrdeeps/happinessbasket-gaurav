<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<style>
        body
{

margin:0;
padding:0;

background-size:cover;
font-family: sans-serif; 
}

.loginBox
{
position:absolute;
top:75%;
left:50%;
transform: translate(-50%, -50%);
width:450px;
height:900px;
padding:80px 40px;
box-sizing: border-box;
background:rgba(0,0,0,0.5) ;

}

h2
{
margin:0;
padding:0 0 20px;
color:#00D1FF;
text-align:center;
} 



.loginBox p
{
padding:0;
margin:0;
font-weight:bold;
color:#fff;

} 

.loginBox input
{
width:100%;
margin-bottom: 20px; 
}

.loginBox input[type="text"], .loginBox input[type="password"]
{
border: none;
border-bottom: 1px solid #fff;
background: transparent;
outline:none;
height:40px;
color:#fff;
font-size: 16px;


}


.loginBox input[type="submit"]
{
border:none;
outline:none;
height: 40px;
color:#fff;
font-size:16px;
background: rgb(255,38,126);
cursor:pointer;
border-radius:20px;
}

.loginBox input[type="submit"]:hover
{
background: #efed40;
color: #262626;
}
 

.loginBox a
{
color: #fff;
font-size:14px;
font-weight:bold;
} 


::placeholder
{
color:rgba(255,255,255,0.5); 
}


.user
{
width:100px;
height:100px; 
overflow:hidden;
position:absolute;
top:calc(-100px/2);
left:calc(50% - 50px);
border-radius:50%;
}

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: FFFFFF;
}

li {
  float: right;
}

li a {
  display: block;
  color: yellow;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #DDDDDB;
}
.active {
  background-color: #DDDDDB;
}
   
</style>
</head>

<body>
<div class="loginBox">


<h2>Sign Up  Here</h2>
<form>
            <p>Name</p>
<input type="text" name = "" placeholder="Enter Name">
            <p>Email</p>
<input type="text" name = "" placeholder="Enter Email">
             <p>Mobile Number</p>
<input type="text" name = "" placeholder="Enter Mobile Number">
             <p>Address 1</p>
<input type="text" name = "" placeholder="Enter Street/area/locality">
<p>Address 2</p>
<input type="text" name = "" placeholder="Enter city,State">
<p>Pincode</p>
<input type="text" name = "" placeholder="Enter Pincode">

<p>Username</p>
<input type="text" name = "" placeholder="Enter Username">
<p>Password</p>
<input type="password" name = "" placeholder="Enter Password">
<input type="submit" name = "" value="sign Up">

<a href="customerlogin.jsp"><h2> Existing Customer</h2></a>
 

</form>
</div>
</body>
</html>
