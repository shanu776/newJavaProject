<%@page import="com.ibm.icu.util.StringTokenizer"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.OutputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<div class="container-fluid">
 <div class="table-responsive">
	<c:if test="${!empty user }">
		<table class="table table-bordered table-hover">
			<tr class="active">
				<th>id</th>
				<th>First_Name</th>
				<th>Middle_Name</th>
				<th>Last_Name</th>
				<th>Password</th>
				<th>User_Type</th>
				<th>Phone_No</th>
				<th>Mobile_No</th>
				<th>Department</th>
				<th>Report_To</th>
				<th>Address</th>
				<th>Location</th>
				<th>IM_Type</th>
				<th>IM_Name</th>
				<th>Photo</th>
				<th>CV</th>
				<th>Update|delete</th>
			</tr>
			<%int i=0; %>
			<c:forEach items="${user }" var="user">
			<tr>
			<td><c:out value="${user.id }"></c:out></td>
			<td><c:out value="${user.first_name }"></c:out></td>
			<td><c:out value="${user.middle_name }"></c:out></td>
			<td><c:out value="${user.last_name }"></c:out></td>
			<td><c:out value="${user.password }"></c:out></td>
			<td><c:out value="${user.user_type }"></c:out></td>
			<td><c:out value="${user.phone_no }"></c:out></td>
			<td><c:out value="${user.mobile_no }"></c:out></td>
			<td><c:out value="${user.department }"></c:out></td>	
			<td><c:out value="${user.report_to }"></c:out></td>
			<td><c:out value="${user.address }"></c:out></td>
			<td>
			<select>
			<c:forTokens items="${user.location }" delims="," var="loc">
			<option><c:out value="${loc }"></c:out></option>
			</c:forTokens>
			</select>
			</td>
			<td><c:out value="${user.im_type }"></c:out></td>
			<td><c:out value="${user.im_name }"></c:out></td>
			<td><img alt="" width="80" height="40" src="image/abc<%out.print(i++);%>.jpg"></td>
			<td><c:out value=""></c:out></td>
			<td align="center"><a href="updateUser.html?id=${user.id}">Edit</a> | <a href="deleteUser.html?id=${user.id}">Delete</a></td>
			</tr>
			</c:forEach>	
		</table>	
		</c:if>
	</div>
</div>
</body>

</html>