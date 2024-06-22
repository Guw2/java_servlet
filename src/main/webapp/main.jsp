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
	
		${mesaje}
		<%! 
		Connection con = null; 	
		Statement st = null;
		%>
	
		<%
		
			String user = request.getParameter("user");
			String pass = request.getParameter("pass");
			String info = request.getParameter("info");
			
			try{
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/routinesapp", user, pass);
				
				ResultSet title;
				
				st = con.createStatement();
				switch(info){
				case "title":
					title = st.executeQuery("SELECT title FROM routine;");	
					break;
				case "message":
					title = st.executeQuery("SELECT message FROM routine;");
					break;
				case "owner_id":
					title = st.executeQuery("SELECT owner_id FROM routine;");
					break;
				default:
					title = st.executeQuery("SELECT * FROM routine;");
				}
				
				while(title.next()){
					out.println(title.getString(1) + "<br>");
				}
				
				
			}catch(SQLException e){
				out.println("Error : " + e.getMessage());
			}
		
		%>
		
	</div>
	
</body>
</html>