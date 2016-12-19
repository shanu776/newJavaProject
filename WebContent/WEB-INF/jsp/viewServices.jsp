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
<c:if test="${!empty services }">
<table class="table table-bordered table-hover">
<tr class="active">
<th>Service_Id</th>
<th>Description</th>
<th>Status</th>
<th>Parent</th>
<th>Duration</th>
<th>Assign_To</th>
<th>Billing_Price</th>
<th>Update | Delete</th>
</tr>

<c:forEach items="${services }" var="ser">
<tr>
<td><c:out value="${ser.service_id }"></c:out></td>
<td><c:out value="${ser.description }"></c:out></td>
<td><c:out value="${ser.status }"></c:out></td>
<td><c:out value="${ser.parent }"></c:out></td>
<td><c:out value="${ser.duration }"></c:out></td>
<td><c:out value="${ser.assign_to }"></c:out></td>
<td><c:out value="${ser.billing_price }"></c:out></td>
<td><a href="updateServices.html?service_id=${ser.service_id }">Update</a>/<a href="deleteServices.html?service_id=${ser.service_id }">Delete</a></td>
</tr>
</c:forEach>
</table>
</c:if>
</div>
</body>
</html>