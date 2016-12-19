<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<body>
	<c:forEach items="${city }" var="c">
	<option value="${c.name }">${c.name}</option>
	</c:forEach>
	
</body>
</html>