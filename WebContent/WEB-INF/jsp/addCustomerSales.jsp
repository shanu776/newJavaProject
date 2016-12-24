<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">

</script>
<script type="text/javascript" src="js/script.js"></script> 
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SALES</title>
<style type="text/css">
#font{
width:20px;
}
#focusedInput{
margin-top: 5px;
color:#737373;
}
input[type=submit]
{
margin-left:47% ;
margin-right: 50%;
}
</style>
</head>
<body>

<form action="saveSalesCustomerData.html" method="POST">
<div class="add-customer-sales1">
<table>
  <spring:bind path="customerSales.id">
  <input type="hidden" name="${status.expression }" value="${status.value }">
  </spring:bind>
  
  <spring:bind path="customerSales.name">
  <tr>
  	<td><label>Name:</label></td>
  	<td><input type="text" name="${status.expression }" class="form-control input-lg" id="focusedInput" placeholder="Enter Name" value="${customerSales.name }"></td>
  	</tr>
  </spring:bind>
  
  <spring:bind path="customerSales.email_id">
  <tr>
	<td><label>Email:</label></td>
  	<td><input type="text" name="${status.expression }"  class="form-control input-lg" id="focusedInput" placeholder="Enter Email" value="${customerSales.email_id }"></td>	
  </tr>
  </spring:bind>
  
   <spring:bind path="customerSales.contact_person">
  <tr>
	<td><label>Contact Person:</label></td>
  	<td><input type="text" name="${status.expression }" class="form-control input-lg" id="focusedInput" placeholder="Contact Person" value="${customerSales.contact_person }"/></td>
  </tr>
  </spring:bind>
  
  <spring:bind path="customerSales.shipping_address">
  <tr>
	<td><label>Shipping Address:</label></td>
  	<td><input type="text" name="${status.expression }" class="form-control input-lg" id="focusedInput" placeholder="Shipping Address" value="${customerSales.shipping_address }"/></td>
  </tr>
  </spring:bind>
  
   <spring:bind path="customerSales.billing_address">
  <tr>
	<td><label>Billing Address:</label></td>
  	<td><input type="text" name="${status.expression }" class="form-control input-lg" id="focusedInput" placeholder="Billing Address" value="${customerSales.billing_address }"/></td>
  </tr>
  </spring:bind>
  
   <spring:bind path="customerSales.address_line1">
<tr>
	<td><label>Address Line1:</label></td>
  	<td><input type="text" name="${status.expression }" class="form-control input-lg" id="focusedInput" placeholder="Address Line1" value="${customerSales.address_line1 }"/></td>
  </tr>
  </spring:bind>
  
   <spring:bind path="customerSales.address_line2">
  <tr>
	<td><label>Address Line2:</label></td>
  	<td><input type="text" name="${status.expression }" class="form-control input-lg" id="focusedInput" placeholder="Address line2" value="${customerSales.address_line2 }"/></td>
  </tr>
  </spring:bind>
  
  <spring:bind path="customerSales.shipping_method">
  <tr>
	<td><label>Shipping Method:</label></td>
  	<td><input type="text" name="${status.expression }" class="form-control input-lg" id="focusedInput" placeholder="Shipping_Method" value="${customerSales.shipping_method }"/></td>
  </tr>
  </spring:bind>
  
  <spring:bind path="customerSales.payment_terms">
  <tr>
	<td><label>Payment Terms:</label></td>
  	<td><input type="text" name="${status.expression }" class="form-control input-lg" id="focusedInput" placeholder="Payment_Terms" value="${customerSales.payment_terms }"/></td>
  </tr>
  </spring:bind>  
    
  <spring:bind path="location.location_name">
  <tr>
  <td></td>
	  <td>
	  	<c:forEach items="${customerSales.location}" var="loca">
			<input type="text" name="${status.expression}" class="form-control input-lg" id="focusedInput" value="${loca}">
		</c:forEach>
	  </td>
  </tr>
  <tr id="locTag">
	<td><label>Location:</label></td>
  	<td><input type="text" name="${status.expression }" class="form-control input-lg spchar" id="spchar" placeholder="Location" value=""/></td>
  	<td><input type="button" value="+" id="btn1"></td>  	
  </tr>
  
  </spring:bind>
  
  </table>




</div>
<div class="add-customer-sales2">
<table>
 <spring:bind path="customerSales.country">
  <tr>
	<td><label>Country:</label></td>
	<td><select name="${status.expression }" class="form-control input-lg" id="focusedInput" onchange="showState(this.value);">
	<c:forEach items="${country }" var="coun">
	<option value="${coun.id }">${coun.name }</option>
	</c:forEach>
	</select> </td>
  </tr>
  </spring:bind>
  
  <spring:bind path="customerSales.state">
  <tr>
	<td><label>State:</label></td>
	<td id="stateLabel"><select name="${status.expression }" class="form-control input-lg" id="stateDiv" onchange="showCity(this.value);">
	</select>
	</td>	
  </tr>
 </spring:bind>
 
 <spring:bind path="customerSales.city">
  <tr>
	<td><label>City:</label></td>
	<td>
	<select name="${status.expression}" class="form-control input-lg" id="cityDiv">
	</select>
	</td>	
  </tr>
 </spring:bind>
  
 <spring:bind path="customerSales.assigned_to">
  <tr>
	<td><label>Assigned To:</label></td>
  	<td><input type="text" name="${status.expression }" class="form-control input-lg" id="focusedInput" placeholder="Assign To" value="${customerSales.assigned_to }"/></td>
  </tr>
  </spring:bind>
  
   <spring:bind path="customerSales.phone_no">
  <tr>
	<td><label>Phone no:</label></td>
  	<td><input type="text" name="${status.expression }" class="form-control input-lg" id="focusedInput" placeholder="Phone No" value="${customerSales.phone_no }"/></td>
  </tr>
  </spring:bind>
  
   <spring:bind path="customerSales.contact_no">
  <tr>
	<td><label>Contact no:</label></td>
  	<td><input type="text" name="${status.expression }" class="form-control input-lg" id="focusedInput" placeholder="Contact No" value="${customerSales.contact_no }"/></td>
  </tr>
  </spring:bind>
  
   <spring:bind path="customerSales.zip_code">
  <tr>
	<td><label>Zip Code:</label></td>
  	<td><input type="text" name="${status.expression }" class="form-control input-lg" id="focusedInput" placeholder="ZipCode" value="${customerSales.zip_code }"/></td>
  </tr>
  </spring:bind>
  
  <spring:bind path="customerSales.vat_no">
  <tr>
	<td><label>Vat No:</label></td>
  	<td><input type="text" name="${status.expression }" class="form-control input-lg" id="focusedInput" placeholder="Vat_No" value="${customerSales.vat_no }"/></td>
  </tr>
  </spring:bind>
  
  <spring:bind path="customerSales.cst_no">
  <tr>
	<td><label>Cst No:</label></td>
  	<td><input type="text" name="${status.expression }" class="form-control input-lg" id="focusedInput" placeholder="Cst_No" value="${customerSales.cst_no }"/></td>
  </tr>
  </spring:bind>  
  
  <spring:bind path="customerSales.currency">
  <tr>
	<td><label>Currency:</label></td>
  	<td><input type="text" name="${status.expression }" class="form-control input-lg" id="focusedInput" placeholder="Currency" value="${customerSales.currency }"/></td>
  </tr>
  </spring:bind>

  
  <spring:bind path="department.department_name">
  <tr>
  <td></td>
	  <td>
	  	<c:forEach items="${customerSales.department}" var="dep">
			<input type="text" name="${status.expression}" class="form-control input-lg" id="focusedInput" value="${dep}">
		</c:forEach>
	  </td>
  </tr>
  <tr id="depTag">  
	<td><label>Department:</label></td>
  	<td><input type="text" name="${status.expression }" class="form-control input-lg spchar" id="spchar1" placeholder="Department" value=""/></td>
  	<td><input type="button" value="+" id="btn2"></td>
  </tr>
  </spring:bind>  
  
  
</table>
</div>
		<input class="btn btn-default" type="submit">

</form>
<script type="text/javascript">
$(document).ready(function(){ 
	$('#btn1').click(function(){	
	$("<tr><td></td><td><input type='text' name='location_name' class='form-control input-lg' pattern='^[a-zA-Z0-9 ]+$' id='spchar' placeholder='Location' value=''/></td></tr>")
	.insertAfter("#locTag");
	});
	
	$('#btn2').click(function(){	
	$("<tr><td></td><td><input type='text' name='department_name' class='form-control input-lg' pattern='^[a-zA-Z0-9 ]+$' id='spchar' placeholder='Department' value=''/></td></tr>")
	.insertAfter("#depTag");
	});
});
$(document).ready(function(){
	$("#spchar").on("keypress",function(){
		 var regex = new RegExp("^[a-zA-Z0-9 ]+$");
		    var key = String.fromCharCode(!event.charCode ? event.which : event.charCode);
		    if (!regex.test(key)) {
		     /*event.preventDefault();*/
		       return false;}
	})
	$("#spchar1").on("keypress",function(){
		 var regex = new RegExp("^[a-zA-Z0-9 ]+$");
		    var key = String.fromCharCode(!event.charCode ? event.which : event.charCode);
		    if (!regex.test(key)) {
		     /*event.preventDefault();*/
		       return false;}
	})
})
</script>

</body>
</html>