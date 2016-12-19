<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">

.a_header{
margin-top: 20px;
margin-right:15px;
float: right;
}
</style>
<link type="text/css" rel="stylesheet" href="css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<div class="header">
	<%if(session.getAttribute("name")!=null){ %>
		<div>
			<a class="a_header" href="logout.html"><button>Logout</button></a>
		</div>
	<%} %>
</div>
</body>
</html>