<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<form:form action="saveProduct.html" method="post" modelAttribute="product">
<form:hidden path="product_id"/>
<div class="container" style="margin-left: 25%;">
<table>
<tr>
	<td><form:label path="product_card">Product_card</form:label></td>
	<td><form:input path="product_card" class="form-control input-lg" id="focusedInput" placeholder="Product_card" value="${product.product_card }"/></td>
</tr>
<tr>
	<td><form:label path="buying_price">Buying_Price</form:label></td>
	<td><form:input path="buying_price" class="form-control input-lg" id="focusedInput" placeholder="Buying_Price" value="${product.buying_price }"/></td>
</tr>
<tr>
	<td><form:label path="statistics">Statistics</form:label></td>
	<td><form:input path="statistics" class="form-control input-lg" id="focusedInput" placeholder="Statistics" value="${product.statistics }"/></td>
</tr>
<tr>
	<td><form:label path="related_items">Related_Items</form:label></td>
	<td><form:input path="related_items" class="form-control input-lg" id="focusedInput" placeholder="Related_Items" value="${product.related_items }"/></td>
</tr>
<tr>
	<td><form:label path="stock">Stock</form:label></td>
	<td><form:input path="stock" class="form-control input-lg" id="focusedInput" placeholder="Stock" value="${product.stock }"/></td>
</tr>
</table>
</div>
<input class="btn btn-default" type="submit">
</form:form>
</body>
</html>