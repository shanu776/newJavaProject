<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<title>CreateCompany</title>
<style type="text/css">

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

<form:form action="saveCompany.html" method="POST" modelAttribute="company" enctype="multipart/form-data">
<div class="add-customer-sales1">
<table>

<form:hidden path="id"/>

  <tr>
	<td><form:label path="name">Name:</form:label></td>
	<td><form:input path="name" class="form-control input-lg" id="focusedInput" placeholder="Enter Company Name" value=""/></td>
	<td><form:errors path="name"></form:errors>
  </tr>
   <tr>
	<td><form:label path="logo">CompanyLogo:</form:label></td>
	<td><input Type="file" name="file" class="form-control input-lg" id="focusedInput" placeholder="selectFile" value=""/></td>
  </tr>
  <tr>
	<td><form:label path="email_id">Email:</form:label></td>
	<td><form:input path="email_id" class="form-control input-lg" id="focusedInput" placeholder="Enter email" value=""/></td>
	<td><form:errors path="email_id"></form:errors></td>
  </tr>
   
   <tr>
	<td><form:label path="vat_no">Vat_No</form:label></td>
	<td><form:input path="vat_no" class="form-control input-lg" id="focusedInput" placeholder="VatNo" value=""/></td>
  </tr>
  <tr>
	<td><form:label path="tin_no">Tin_No:</form:label></td>
	<td><form:input path="tin_no" class="form-control input-lg" id="focusedInput" placeholder="TinNo" value=""/></td>
  </tr>
  <tr>
	<td><form:label path="billing_addr">Billing_Address:</form:label></td>
	<td><form:input path="billing_addr" class="form-control input-lg" id="focusedInput" placeholder="BillingAddress" value=""/></td>
  </tr>
  <tr>
	<td><form:label path="phone_no">Phone_No:</form:label></td>
	<td><form:input path="phone_no" class="form-control input-lg" id="focusedInput" placeholder="PhoneNo" value=""/></td>
  </tr>  
  <tr>
	<td><form:label path="website">Website:</form:label></td>
	<td><form:input path="website" class="form-control input-lg" id="focusedInput" placeholder="WebSite" value=""/></td>
  </tr>
   <tr>
	<td><form:label path="shipping_addr">Shipping_Address:</form:label></td>
	<td><form:input path="shipping_addr" class="form-control input-lg" id="focusedInput" placeholder="Shipping_address" value=""/></td>
  </tr>
  <tr>
  <td></td>
  <td><input class="btn btn-default" type="submit"></td>
  </tr>
  </table>
  
</div>
</form:form>


<div class="add-customer-sales2">

	<div class="table-responsive" style="margin-top:10px; width: 450px; height: 150px;">
	<table class="table table-bordered table-hover">
	<c:if test="${!empty department }">
	<tr class="active">
	<th>Id</th>
	<th>Department</th>
	</tr>
	<c:forEach items="${department }" var="department">
	<tr>
	<td><c:out value="${department.id}"></c:out></td>
	<td><c:out value="${department.department_name }"></c:out></td>
	</tr>
	</c:forEach>
	</c:if>
	</table>
	</div>

<form:form action="saveDepartment.html" modelAttribute="department">
<table>
	<tr>
		<td><form:label path="department_name">DepartmentName:</form:label></td>
		<td><form:input path="department_name" class="form-control input-lg" id="focusedInput" placeholder="Department" value=""/></td>
		<td><input class="btn btn-default" type="submit" value="addDepartment"></td>
	</tr>  
</table>
</form:form>
<div class="table-responsive" style="margin-top:10px; width: 450px; height: 150px;">
<table class="table table-bordered table-hover">
<c:if test="${!empty location }">
<tr class="active">
<th>Id</th>
<th>State</th>
<th>City</th>
</tr>
<c:forEach items="${location }" var="location1">
<tr>
<td><c:out value="${location1.id}"></c:out></td>
<td><c:out value="${location1.state }"></c:out> </td>
<td><c:out value="${location1.city }"></c:out> </td>
</tr>
</c:forEach>
</c:if>
</table>
</div>
<form:form action="saveLocation.html" modelAttribute="location">
<table>

<tr>
	<td><form:label path="city">CityName:</form:label></td>
	<td><form:input path="city" class="form-control input-lg" id="focusedInput" placeholder="CityName" value=""/></td>
</tr>
<tr>
	<td><form:label path="state">StateName:</form:label></td>
	<td><form:input path="state" class="form-control input-lg" id="focusedInput" placeholder="StateName" value=""/></td>
</tr>
<tr>
<td></td>
<td align="center">
<input class="btn btn-default" type="submit" value="addLocation">
</td>
</tr>
</table>
</form:form>
</div>

		


</body>
</html>