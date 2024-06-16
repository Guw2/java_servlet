package com.lorian;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int result = num1 + num2;
		
		req.setAttribute("result", result);
		
		// Se o primeiro número inserido for maior que o segundo, o FirstServlet chama o SecondServlet 
		if(num1 > num2) {
			RequestDispatcher rd = req.getRequestDispatcher("/servlet_add2");
			rd.forward(req, res);
		}
		
		
		// Se ambos os campos forem iguais, o FirstServlet chama o ThirdServlet
		if(num1 == num2) {
			res.sendRedirect("servlet_add3?result="+result);
		}
		
		PrintWriter out = res.getWriter();
		
		out.println("The Result is " + result + " in FirstServlet.");
		
	}
	
}
