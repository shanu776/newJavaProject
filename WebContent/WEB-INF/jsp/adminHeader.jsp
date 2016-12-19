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
<title>Admin_HOME</title>
<style type="text/css">
#header{
background-color: #161032;
border: 2px groove;
border-color: #161032;
}
 .dropdown-submenu {
    position: relative;
}

.dropdown-submenu .dropdown-menu {
    top: 0;
    right: 100%;
    margin-top: -1px;
}  
</style>
</head>
<body>
<nav class="navbar navbar-inverse" id="header">
  <div class="container-fluid">
    <div class="navbar-header" >
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="adminDefault.html">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right" class="nav-tabs">
       	<li class="dropdown">
        <a data-toggle="dropdown" href="#">Production<span class="caret"></span></a>
	        <ul class="dropdown-menu">		     
		     <li class="dropdown-submenu">
		        <a class="test" data-hover="dropdown" tabindex="-1" href="#">Employee <span class="caret"></span></a>
		        <ul class="dropdown-menu">
		          <li><a tabindex="-1" href="#">AddEmployee</a></li>
		          <li><a tabindex="-1" href="#">ViewEmployee</a></li>		          
		        </ul>
		      </li>
		      
		     <li class="dropdown-submenu">
		        <a class="test" data-hover="dropdown" tabindex="-1" href="#">Customer<span class="caret"></span></a>
		        <ul class="dropdown-menu">
		          <li><a tabindex="-1" href="#">AddCustomer</a></li>
		          <li><a tabindex="-1" href="#">ViewCustomer</a></li>		          
		        </ul>
		      </li>	
		       <li class="divider"></li>    
		        <li><a href="#">DesignAssignment</a></li>  
		        <li><a href="#">StatusOfDesign</a></li> 
		        <li><a href="#">MaterialRequirement</a></li>  
		        <li><a href="#">ProductionGoals</a></li> 
		        <li><a href="#">ProductionStage</a></li>  
		        <li><a href="#">AddProducts</a></li> 
		        <li><a href="#">AddTask</a></li>  	      
		       </ul>
        </li>
        	<li class="dropdown">
       		<a data-toggle="dropdown" href="#">Operation<span class="caret"></span></a>
	        <ul class="dropdown-menu">		     
		     <li class="dropdown-submenu">
		        <a class="test" data-hover="dropdown" tabindex="-1" href="#">Vendor<span class="caret"></span></a>
		        <ul class="dropdown-menu">
		          <li><a tabindex="-1" href="#">AddVendor</a></li>
		          <li><a tabindex="-1" href="#">ViewVendor</a></li>		          
		        </ul>
		      </li>
		      <li class="dropdown-submenu">
		        <a class="test" data-hover="dropdown" tabindex="-1" href="#">PO<span class="caret"></span></a>
		        <ul class="dropdown-menu">
		          <li><a tabindex="-1" href="#">AddPO</a></li>
		          <li><a tabindex="-1" href="#">ViewPO</a></li>		          
		        </ul>
		      </li>
		      
		      
		  </ul>    
        
        	<li class="dropdown">
       		 <a data-toggle="dropdown" href="#">Sales<span class="caret"></span></a>
	        <ul class="dropdown-menu">		     
		     <li class="dropdown-submenu">
		        <a class="test" data-hover="dropdown" tabindex="-1" href="#">Customer<span class="caret"></span></a>
		        <ul class="dropdown-menu">
		          <li><a tabindex="-1" href="addSalesCustomerForm.html">AddCustomer</a></li>
		          <li><a tabindex="-1" href="viewSalesCustomerData.html">ViewCustomer</a></li>		          
		        </ul>
		      </li>
		       <li class="divider"></li>    
		        <li><a href="#">Leads</a></li>   
		        <li><a href="#">Calls</a></li>   
		        <li><a href="#">Appointment</a></li>
		        <li><a href="#">AddQuotation</a></li>  
		        <li><a href="#">Email</a></li>    
		      </ul>
		      </li>		      
		  
		  <li class="dropdown">
       		 <a data-toggle="dropdown" href="#">Quality<span class="caret"></span></a>
	        <ul class="dropdown-menu">
		       <li><a href="#">InspectionCycle</a></li>
		       <li><a href="#">StatusOfPO</a></li>
		       <li><a href="#">Packaging</a></li>
		       <li><a href="#">Slip</a></li>		       
	        </ul>
        </li>
        
         <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Create<span class="caret"></span></a>
	        <ul class="dropdown-menu">
		        <li><a href="#">Customer</a></li>       
		       <li class="dropdown-submenu">
		        <a class="test" data-hover="dropdown" tabindex="-1" href="#">Product<span class="caret"></span></a>
		        <ul class="dropdown-menu">
		          <li><a tabindex="-1" href="productForm.html">AddProduct</a></li>
		          <li><a tabindex="-1" href="viewProduct.html">ViewProduct</a></li>
		        </ul>
		        </li>
		        <li><a href="#">Vendor</a></li> 
		        <li><a href="#">Opportunity</a></li> 
		        <li><a href="#">Lead</a></li> 
		        <li><a href="#">Quotation</a></li> 
		        <li><a href="#">Invoice</a></li> 
		        <li><a href="#">LogCall</a></li> 
		        <li><a href="#">Task</a></li> 
		        <li><a href="#">Material</a></li> 
		        <li><a href="#">MaterialRequirment</a></li> 
		        
		        <li class="dropdown-submenu">
		        <a class="test" data-hover="dropdown" tabindex="-1" href="#">Services<span class="caret"></span></a>
		        <ul class="dropdown-menu">
		          <li><a tabindex="-1" href="serviceForm.html">AddServices</a></li>
		          <li><a tabindex="-1" href="viewServices.html">ViewServices</a></li>
		        </ul>
		        </li>
		        
		        <li><a href="#">DeliveryChalan</a></li>   
	        </ul>
        </li>
        
        
        <li><a href="logout.html"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>        
      </ul>     
    </div>          
    </div>
</nav>
<script>
$(document).ready(function(){
  $('.dropdown-submenu a.test').on("click mouseenter", function(e){
	  $(".test").next('ul').hide();
    $(this).next('ul').toggle();   
    e.stopPropagation();
    e.preventDefault();
  });
});
</script>
</body>
</html>