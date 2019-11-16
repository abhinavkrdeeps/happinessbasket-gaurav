<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Happiness Basket</title>
</head>
<body>
<!--${home}-->
<!-- ${msg}-->

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
  .jumbotron {
    background-color: #f4511e;
    color: #fff;
    padding: 100px 25px;
  }
  .container-fluid {
    padding: 60px 50px;
  }
  .bg-grey {
    background-color: #f6f6f6;
  }
  .logo {
    font-size: 200px;
  }
  @media screen and (max-width: 768px) {
    .col-sm-4 {
      text-align: center;
      margin: 25px 0;
    }
  }
body {
  font-family: Arial, Helvetica, sans-serif;
  margin: 0;
}

.navbar {
  overflow: hidden;
  background-color: #ABABAB; 
}

.navbar a {
  float: left;
  font-size: 18px;
  color: yellow;
  text-align: center;
  padding: 12px 16px;
  text-decoration: none;
}


.navbar a:hover, .subnav:hover .subnavbtn {
  background-color: #6DF432;
}

.sub-nav-logout{
 float: right;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 0px;
  text-decoration: none;
}
</style>
</head>
<body>



<div class="navbar">
  <a href="home.jsp">Home</a>

  

  <div class="sub-nav-logout">
  <a href="login.jsp">Logout</a>
  </div>
</div>
<!-- Container (Services Section) -->
<div class="container-fluid text-center">
  <h2>DASHBOARD</h2>
  <h4>Things To Do</h4>
  <br>
  <div class="row">
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-off"></span>
      <h4>CATEGORIES DETAILS</h4>
     <a href="categories.jsp"><p>Add/Delete Categories</p></a>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-heart"></span>
      <h4>PRODUCT DETAILS</h4>
      <a href="categories.jsp"><p>Add/Delete Product</p></a>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-lock"></span>
      <h4>ORDER DETAILS</h4>
      <a href=""><p>View/Confirm Orders</p></a>
    </div>
  </div>
  <br><br>
  <div class="row">
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-leaf"></span>
      <h4>PAYMENT DETAILS</h4>
      <a href=""><p>View Payment Details</p></a>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-certificate"></span>
      <h4>Delivery Details</h4>
      <a href=""><p>Confirm Order and Assign Delivery Person</p></a>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-wrench"></span>
      <h4 style="color:#303030;">Delivery Approval</h4>
      <a href=""><p>Approval of Delivery Person after Registeration</p></a>
    </div>
  </div>
</div>





</body>
</html>