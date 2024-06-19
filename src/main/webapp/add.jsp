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

	<div class="main_div">
	
		<%! int res; %>
	
		<%
			
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		res = num1 + num2;
		
		%>
		
		The result is <% out.println(res); %>
		
	</div>
	
</body>
</html>