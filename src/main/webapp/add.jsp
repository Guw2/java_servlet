<%@ page import="java.sql.*"%>
<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">

	body{
		font-family: arial;
		font-size: 40px;
		text-align: center;
	}
	
	.main_div{
		color: blue;
	}

</style>

</head>
<body>

	<h2 style="text-align: center;">Resultado</h2>

	<hr>

	<div class="main_div">
	
		<%!
			int coiso = 27;
		%>
	
		My Favourite Number is <% out.println(coiso2); %>
	</div>
	
</body>
</html>