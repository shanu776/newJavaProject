<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="table-responsive">
<c:if test="${!empty products }">
<table class="table table-bordered table-hover">
<tr class="active">
<th>Product_Id</th>
<th>Product_card</th>
<th>Buying_price</th>
<th>Statistics</th>
<th>Related_Items</th>
<th>Stock</th>
<th>Update/Delete</th>
</tr>

<c:forEach items="${products }" var="p">
<tr>
<td><c:out value="${p.product_id }"></c:out></td>
<td><c:out value="${p.product_card }"></c:out></td>
<td><c:out value="${p.buying_price }"></c:out></td>
<td><c:out value="${p.statistics }"></c:out></td>
<td><c:out value="${p.related_items }"></c:out></td>
<td><c:out value="${p.stock }"></c:out></td>
<td><a href="updateProduct.html?product_id=${p.product_id }">Update</a>/<a href="deleteProduct.html?product_id=${p.product_id }">Delete</a></td>
</tr>
</c:forEach>
</table>
</c:if>
</div>
</body>
</html>