<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.menu1,.menu2,.menu0,.menu3{
/* width:10%; */
margin-top:5px;
height:35px;
border-radius:5px;
background-color: #161032;
}
.menuli{
/* width:100%;  */
height:30px;
margin-top:10px;
margin-left:-27%; 
display:list-item;
list-style: none;
border-radius:10px;
background-color: #585858;
}
ul{
 /* width:10%; */
}
a:hover, a:visited, a:link, a:active{
font:inherit 10px;
color: #161032;
text-decoration: none;
} 
</style>
</head>
<body>
<%-- <h3>${company.id }</h3> --%>
<div class="menu0"><font size="5" color="#fffff">&nbsp;Company</font></div>
<div class="item0">
<ul>
<c:if test="${!empty company }">
<c:forEach items="${company }" var="cp">
<li class="menuli"><a href="updateCompany.html?id=${cp.id }" style="text-decoration: none;">&nbsp; &nbsp;Update </a></li>
<li class="menuli"><a href="deleteCompany.html?id=${cp.id }" style="text-decoration: none;">&nbsp; &nbsp;Delete </a>
</li>
</c:forEach>
</c:if>
</ul>
</div>
<div class="menu1"> <font size="5" color="#fffff">&nbsp;User</font></div>
<div class="item1">
<ul>
<a href="userForm.html"><li class="menuli">&nbsp; &nbsp; AddUser</li></a>
<a href="viewUser.html"><li class="menuli">&nbsp; &nbsp; ViewUser</li></a>
</ul>
</div>
<div class="menu2"> <font size="5" color="#fffff">&nbsp;menu_2</font></div>
<div class="item2">
<ul>
<li class="menuli">1234</li>
<li class="menuli">1234</li>
<li class="menuli">1234</li>

</ul>
</div>
<div class="menu3"> <font size="5" color="#fffff">&nbsp;menu_3</font></div>
<div class="item3">
<ul>
<li class="menuli">1234</li>
<li class="menuli">1234</li>
<li class="menuli">1234</li>
</ul>
</div>


<script type="text/javascript">
$(document).ready(function(){ 
	$(".item0,.item1,.item2,.item3").hide(500);
    $(".menu1").click(function(){  
        $(".item1").slideToggle("slow"); 
        $(".item0").slideUp("slow"); 
        $(".item2").slideUp("slow"); 
        $(".item3").slideUp("slow");         
    });  
    
    $(".menu2").click(function(){  
        $(".item2").slideToggle("slow");
        $(".item0").slideUp("slow"); 
        $(".item1").slideUp("slow"); 
        $(".item3").slideUp("slow"); 
    });
    $(".menu0").click(function(){  
        $(".item0").slideToggle("slow");
        $(".item1").slideUp("slow"); 
        $(".item2").slideUp("slow"); 
        $(".item3").slideUp("slow"); 
    }); 
    $(".menu3").click(function(){  
        $(".item3").slideToggle("slow");  
        $(".item0").slideUp("slow"); 
        $(".item2").slideUp("slow"); 
        $(".item1").slideUp("slow"); 
    }); 
});  
</script>

</body>
</html>