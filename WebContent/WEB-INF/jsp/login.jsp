<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%-- <%@include file="header.jsp" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<div class="logindiv" class="container">
<form:form action="loginAction.html">
	<ul class="loginul">
		<li class="loginli1"><input id="logininput1" type="text" name="name" placeholder=" Name"></li>
		<li class="loginli2"><input id="logininput2" type="password" name="password" placeholder=" Password"></li>
		<li class="loginli3"><input id="loginsubmit1" type="submit" value="submit"></li>
	</ul>
</form:form>
</div>
</body>
</html>