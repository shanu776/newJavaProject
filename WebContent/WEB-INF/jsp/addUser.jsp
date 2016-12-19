<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*" %>
	<%@ page import="java.net.*" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style type="text/css">
.td1{
padding-left:10px;
width: 2%;
}
.td{
width:20%;
}
#focusedInput{
width:100%;
margin-top: 5px;
color:#737373;
}
input[type=submit]
{
margin-top:20px;
margin-left:47% ;
margin-right: 50%;
}
</style>
</head>
<body>
<form:form action="saveUser.html" method="POST" enctype="multipart/form-data" modelAttribute="user">
<div style="width: 90%; margin-left:5%; margin-top: 20px; ">
<form:hidden path="id"/>
<table cellpadding="0" cellspacing="0" align="center" border="0">
  <tr>
	<td class="td1"><form:label path="first_name">First_Name:</form:label></td>
	<td class="td"><form:input path="first_name" class="form-control input-lg" id="focusedInput" placeholder="First_Name" value="${users.first_name }"/></td>
	
  
	<td class="td1"><form:label path="middle_name">Middle_Name:</form:label></td>
	<td class="td"><form:input path="middle_name" class="form-control input-lg" id="focusedInput" placeholder="Middle_Name" value="${users.middle_name }"/></td>

  
	<td class="td1"><form:label path="last_name">Last_Name:</form:label></td>
	<td class="td"><form:input path="last_name" class="form-control input-lg" id="focusedInput" placeholder="Last_Name" value="${users.last_name }"/></td>
	
  </tr>
  
  <tr>
	<td class="td1"><form:label path="password">Password:</form:label></td>
	<td class="td"><form:input path="password" class="form-control input-lg" id="focusedInput" placeholder="Password" value="${users.password }"/></td>
	
 
	<td class="td1"><form:label path="user_type">User_Type:</form:label></td>
	<td class="td"><form:input path="user_type" class="form-control input-lg" id="focusedInput" placeholder="User_Type" value="${users.user_type }"/></td>
	
  </tr>
  
  <tr>
	<td class="td1"><form:label path="phone_no">Phone_No:</form:label></td>
	<td class="td"><form:input path="phone_no" class="form-control input-lg" id="focusedInput" placeholder="Phone_No" value="${users.phone_no }"/></td>
	
  
	<td class="td1"><form:label path="mobile_no">Mobile No:</form:label></td>
	<td class="td"><form:input path="mobile_no" class="form-control input-lg" id="focusedInput" placeholder="Mobile No" value="${users.mobile_no }"/></td>
	
  </tr>

  <tr>
	<td class="td1"><form:label path="department">Department:</form:label></td>
	<td class="td"><form:select class="form-control input-lg" id="focusedInput" path="Department" value="${users.department }">
	<c:forEach items="${department }" var="depart">
	<form:option value="${depart.department_name }"></form:option>
	</c:forEach>
	</form:select> </td>
  </tr> 
 
  <tr>
	<td class="td1"><form:label path="report_to">Report_to:</form:label></td>
	<td class="td"><form:input path="report_to" class="form-control input-lg" id="focusedInput" placeholder="Report_to" value="${users.report_to }"/></td>

  </tr>

  <tr>
	<td class="td1"><form:label path="address">Address:</form:label></td>
	<td class="td"><form:input path="address" class="form-control input-lg" id="focusedInput" placeholder="Address" value="${users.address }"/></td>
	
  
	<td class="td1"><form:label path="location">Location:</form:label></td>
	<td class="td"><form:input path="location" class="form-control input-lg field2" id="focusedInput" value="${users.location }" readonly="true"/></td>
	
	
	<td class="td1"><input type="button" class="btn btn-default" id="btn1" value="<<<<"></td>
	<td class="td"><input type="text" class="form-control input-lg field1" id="focusedInput " placeholder="Location"/></td>
	<td style="width: 10px;"><input type="button" class="btn btn-default" id="btn2" value="clear"></td>
</tr>
	 
  <tr>
	<td class="td1"><form:label path="im_type">Im_Type:</form:label></td>
	<td class="td"><form:input path="im_type" class="form-control input-lg" id="focusedInput" placeholder="Im_Type" value="${users.im_type }"/></td>

  
	<td class="td1"><form:label path="im_name">IM_Name:</form:label></td>
	<td class="td"><form:input path="im_name" class="form-control input-lg" id="focusedInput" placeholder="IM_Name" value="${users.im_name }"/></td>
	
  </tr>
   <!--  </table>
	<table align="center"> -->
	  <tr>
		<td class="td1"><form:label path="photo">Photo:</form:label></td>
		<td><input Type="file" name="photo1" class="form-control input-lg" id="focusedInput" value="${users.photo }"/></td>
	
		
		<td class="td1"><form:label path="cv">CV:</form:label></td>
		<td class="td"><input type="file" name="cv1" class="form-control input-lg" id="focusedInput" value="${users.cv }"/></td>	
		
	  </tr>
	 
	</table>
		<input class="btn btn-default" type="submit"></td>
</div>
</form:form>
<script type="text/javascript">
$(document).ready(function(){
		    $('#btn1').click(function()
		    {
		    	var s=$('.field1').val();		    	
		    	var s1=$('.field2').val();
		    	s1=s1+s+",";
		         $('.field2').val(s1);
		         s=" ";
		         $('.field1').val(s);
		    });
		    $('#btn2').click(function(){
		    	$('.field2').val("");
		    })
		    
		});
</script>
</body>

</html>