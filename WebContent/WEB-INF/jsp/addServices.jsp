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
<form:form action="saveServices.html" method="post" modelAttribute="services">
<form:hidden path="service_id"/>
<div class="container" style="width: 25%;display: inline-block;"></div>
<div class="container" style="width: 40%">
<table>
<tr>
	<td><form:label path="description">Description</form:label></td>
	<td><form:input path="description" class="form-control input-lg" id="focusedInput" placeholder="Description" value="${service.description }"/></td>
</tr>
<tr>
	<td><form:label path="status">Status</form:label></td>
	<td><form:input path="status" class="form-control input-lg" id="focusedInput" placeholder="Status" value="${service.status }"/></td>
</tr>
<tr>
	<td><form:label path="parent">Parent</form:label></td>
	<td><form:input path="parent" class="form-control input-lg" id="focusedInput" placeholder="Parent" value="${service.parent }"/></td>
</tr>
<tr>
	<td><form:label path="duration">Duration</form:label></td>
	<td><form:input path="duration" class="form-control input-lg" id="focusedInput" placeholder="Duration" value="${service.duration }"/></td>
</tr>
<tr>
	<td><form:label path="assign_to">Assign_to</form:label></td>
	<td><form:input path="assign_to" class="form-control input-lg" id="focusedInput" placeholder="Assign_to" value="${service.assign_to }"/></td>
</tr>
<tr>
	<td><form:label path="billing_price">billing_price</form:label></td>
	<td><form:input path="billing_price" class="form-control input-lg" id="focusedInput" placeholder="billing_price" value="${service.billing_price }"/></td>
</tr>
</table>
</div>
<input class="btn btn-default" type="submit">
</form:form>
</body>
</html>