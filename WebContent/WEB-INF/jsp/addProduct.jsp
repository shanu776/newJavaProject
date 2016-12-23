<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
#focusedInput{
width:100%;
margin-top: 5px;
color:#737373;
}
input[type=submit]
{
margin-top:20px;
margin-left:47% ;
margin-right:50%;
}
</style>
</head>
<body>
<form action="saveProduct.html" method="post">
<spring:bind path="product.product_id">
	<input type="hidden" name="${status.expression}" value="${products.product_id}">
</spring:bind>
<div class="add-customer-sales1">
	<table>
	<tr>
		<spring:bind path="product.product_description">
		<td><label>Product Description:</label></td>
		<td>
		<input type="text"name="${status.expression}" class="form-control input-lg" id="focusedInput" value="${products.product_description }" placeholder="Product Description">
		</td>
		</spring:bind>
	</tr>
	<tr>
		<spring:bind path="product.product_sales">
		<td><label>Sales:</label></td>
		<td>
		<input type="text"name="${status.expression}" class="form-control input-lg" id="focusedInput" value="${products.product_sales }" placeholder="Sales" >
		</td>
		</spring:bind>
	</tr>
	<tr>
		<spring:bind path="product.status_purchase">
		<td><label>Purchase:</label></td>
		<td>
		<input type="text"name="${status.expression}" class="form-control input-lg" id="focusedInput" value="${products.status_purchase }" placeholder="Purchase" >
		</td>
		</spring:bind>
	</tr>
	<tr>
		<spring:bind path="product.sr_no">
		<td><label>Sr_NO:</label></td>
		<td>
		<input type="text"name="${status.expression}" class="form-control input-lg" id="focusedInput" value="${products.sr_no }" placeholder="Sr_NO" >
		</td>
		</spring:bind>
	</tr>
	<tr>
		<spring:bind path="product.weight">
		<td><label>Weight:</label></td>
		<td>
		<input type="text"name="${status.expression}" class="form-control input-lg" id="focusedInput" value="${products.weight }" placeholder="Weight" >
		</td>
		</spring:bind>
	</tr>
	<tr>
		<spring:bind path="product.dimension">
		<td><label>Dimension:</label></td>
		<td>
		<input type="text"name="${status.expression}" class="form-control input-lg" id="focusedInput" value="${products.dimension }" placeholder="Dimension" >
		</td>
		</spring:bind>
	</tr>
	<tr>
		<spring:bind path="product.selling_price">
		<td><label>Selling Price:</label></td>
		<td>
		<input type="text"name="${status.expression}" class="form-control input-lg" id="focusedInput" value="${products.selling_price }" placeholder="Selling_Price" >
		</td>
		</spring:bind>
	</tr>
	<tr>
		<spring:bind path="product.min_selling_price">
		<td><label>Min Selling Price:</label></td>
		<td>
		<input type="text"name="${status.expression}" class="form-control input-lg" id="focusedInput" value="${products.min_selling_price }" placeholder="Min Selling Price" >
		</td>
		</spring:bind>
	</tr>
	</table>
</div>


<div class="add-customer-sales2">
	<table>
	<tr>
		<spring:bind path="product.min_buying_price">
		<td><label>Min Buying Price:</label></td>
		<td>
		<input type="text"name="${status.expression}" class="form-control input-lg" id="focusedInput" value="${products.min_buying_price }" placeholder="Min Buying Price" >
		</td>
		</spring:bind>
	</tr>
	<tr>
		<spring:bind path="product.tax">
		<td><label>Tax:</label></td>
		<td>
		<input type="text"name="${status.expression}" class="form-control input-lg" id="focusedInput" value="${products.tax }" placeholder="Tax" >
		</td>
		</spring:bind>
	</tr>
	<tr>
		<spring:bind path="product.stock_limit">
		<td><label>Stock Limit:</label></td>
		<td>
		<input type="text"name="${status.expression}" class="form-control input-lg" id="focusedInput" value="${products.stock_limit }" placeholder="Stock Limit" >
		</td>
		</spring:bind>
	</tr>
	<tr>
		<spring:bind path="product.product_card">
		<td><label>Product Card:</label></td>
		<td>
		<input type="text"name="${status.expression}" class="form-control input-lg" id="focusedInput" value="${products.product_card }" placeholder="Product Card" >
		</td>
		</spring:bind>
	</tr>
	<tr>
		<spring:bind path="product.buying_price">
		<td><label>Buying Price:</label></td>
		<td>
		<input type="text"name="${status.expression}" class="form-control input-lg" id="focusedInput" value="${products.buying_price }" placeholder="Buying Price" >
		</td>
		</spring:bind>
	</tr>
	<tr>
		<spring:bind path="product.statistics">
		<td><label>Statistics:</label></td>
		<td>
		<input type="text"name="${status.expression}" class="form-control input-lg" id="focusedInput" value="${products.statistics }" placeholder="Statistics" >
		</td>
		</spring:bind>
	</tr>
	<tr>
		<spring:bind path="product.stock">
		<td><label>Stock:</label></td>
		<td>
		<input type="text"name="${status.expression}" class="form-control input-lg" id="focusedInput" value="${products.stock }" placeholder="Stock" >
		</td>
		</spring:bind>
	</tr>
		<spring:bind path="related_items.item_name">
		 <tr>
		  <td></td>
			  <td>
			  	<c:forEach items="${products.related_items}" var="ri">
					<input type="text" name="${status.expression}" class="form-control input-lg" id="focusedInput" value="${ri}">
				</c:forEach>
			  </td>
		 </tr>
		<tr id="itemTag">
		<td><label>Related Items:</label></td>
		<td>
		<input type="text" name="${status.expression}" class="form-control input-lg" id="spchar" value="" placeholder="Related Items" >
		</td>
		<td><input type="button" value="+" id="btn"></td>
		</tr>
		</spring:bind>
	</table>
</div>

<input class="btn btn-default" type="submit">
</form>
<script type="text/javascript">
$(document).ready(function(){ 
	$('#btn').click(function(){	
	$("<tr><td></td><td><input type='text' name='item_name' class='form-control input-lg' pattern='^[a-zA-Z0-9 ]+$' placeholder='Related_Items' value=''required title=' remove special char'/></td></tr>")
	.insertAfter("#itemTag");
	});
});
$("#spchar").on("keypress",function(){
	 var regex = new RegExp("^[a-zA-Z0-9 ]+$");
	    var key = String.fromCharCode(!event.charCode ? event.which : event.charCode);
	    if (!regex.test(key)) {
	     /*   event.preventDefault(); */
	       return false;}
});
</script>
</body>
</html>