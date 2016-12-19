<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<body>
	<%-- <select name="${customerSales.state }" class="form-control input-lg" id="focusedInput" onchange="showCity(this.value);document.getElementById('cityLabel').style.display='block';"> --%>
	<c:forEach items="${state }" var="st">
	<option value="${st.id }">${st.name}</option>
	</c:forEach>

</body>
</html>