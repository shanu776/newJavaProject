<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SALES</title>
<!-- <link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script> 
 <script type="text/javascript" src="js/bootstrap1.js"></script>
  <script type="text/javascript" src="js/bootstrap-hover-dropdown.min.js"></script> -->
</head>
<body leftmargin="0">
<div class="container-fluid">
 <div class="table-responsive">
<c:if test="${!empty salesCustomer }">

		<table class="table table-bordered table-hover">
			<tr class="active">
				<th>id</th>
				<th>name</th>
				<th>email_id</th>
				<th>contact_person</th>
				<th>Shipping_address</th>
				<th>billing_address</th>
				<th>address_line1</th>
				<th>address_line2</th>
				<th>city</th>
				<th>state</th>
				<th>country</th>
				<th>assigned_to</th>				
				<th>phone_no</th>
				<th>contact_no</th>				
				<th>zip_code</th>
				<th>vat_no</th>
				<th>cst_no</th>
				<th>shipping_method</th>
				<th>payment_terms</th>
				<th>currency</th>
				<th>created_by</th>
				<th>location</th>
				<th>department</th>
				<th>Update|delete</th>
			</tr>
		
			<c:forEach items="${salesCustomer }" var="customer">
			<tr>
				<td><c:out value="${customer.id }"></c:out></td>
				<td><c:out value="${customer.name }"></c:out></td>
				<td><c:out value="${customer.email_id }"></c:out></td>
				<td><c:out value="${customer.contact_person }"></c:out></td>
				<td><c:out value="${customer.shipping_address }"></c:out></td>
				<td><c:out value="${customer.billing_address }"></c:out></td>
				<td><c:out value="${customer.address_line1 }"></c:out></td>
				<td><c:out value="${customer.address_line2 }"></c:out></td>
				<td><c:out value="${customer.city }"></c:out></td>
				<td><c:out value="${customer.state }"></c:out></td>
				<td><c:out value="${customer.country }"></c:out>
				<td><c:out value="${customer.assigned_to }"></c:out></td>
				<td><c:out value="${customer.phone_no }"></c:out></td>
				<td><c:out value="${customer.contact_no }"></c:out></td>
				<td><c:out value="${customer.zip_code }"></c:out></td>
				<td><c:out value="${customer.vat_no }"></c:out></td>
				<td><c:out value="${customer.cst_no }"></c:out></td>
				<td><c:out value="${customer.shipping_method }"></c:out></td>
				<td><c:out value="${customer.payment_terms }"></c:out></td>
				<td><c:out value="${customer.currency }"></c:out></td>
				<td><c:out value="${customer.created_by }"></c:out></td>
				<%--<td><c:out value="${customer.location }"></c:out> </td> --%>
				<td><select><c:forEach items="${customer.location }" var="loc">				
				<option><c:out value="${loc }"></c:out> </option>				
				</c:forEach></select></td>
				
				<td><select><c:forEach items="${customer.department }" var="dep">				
				<option>${dep }</option>				
				</c:forEach></select></td>
				
				<td align="center"><a href="updateSalesCustomerData.html?id=${customer.id}">Edit</a> | <a href="deleteSalsesCustomerData.html?id=${customer.id}">Delete</a></td>
			</tr>
			</c:forEach>	
		</table>
</c:if>
</div>
</div>
</body>
</html>