<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/npm.js"></script>
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script> 
 <script type="text/javascript" src="js/bootstrap1.js"></script>
  <script type="text/javascript" src="js/bootstrap-hover-dropdown.min.js"></script>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SALES_HOME</title>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="salesDefault.html">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right" class="nav-tabs">
        <li class="active"><a href="salesDefault.html">Home</a></li>
        
        <li><a href="#">About</a></li>
        
        <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Customer<span class="caret"></span></a>
        <ul class="dropdown-menu">
        <li><a href="addSalesCustomerForm.html">AddCustomer</a></li>
        <li><a href="viewSalesCustomerData.html">ViewCustomer</a></li>    
        <li><a href="customerReport.html">report</a></li>      
        </ul>
        </li> 
               
        <li><a href="#">Contact</a></li>
        <li><a href="logout.html"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>        
      </ul>     
    </div>          
    </div>
</nav>

<h1>${message1}</h1>
</body>
</html>