<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

</style>

</head>
<body>

	<h2 style="text-align: center;">Resultado</h2>

	<hr>

	<div class="main_div">
		<% 
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int result = num1 + num2;
		
		out.println("The Result is " + result);
		
		%>
	</div>
	
</body>
</html>