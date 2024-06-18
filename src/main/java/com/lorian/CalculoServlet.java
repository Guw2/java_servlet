package com.lorian;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/servlet_add")
public class CalculoServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int result;
		PrintWriter out = res.getWriter();
		HttpSession session = req.getSession();
		try {
			int num1 = (int) session.getAttribute("num1");
			int num2 = (int) session.getAttribute("num2");
			result = num1 + num2;
			out.println("The result is " + result);
		}catch(NumberFormatException e) {
			out.println("Invalid Numbers");
		}
		
		Cookie[] cookies = req.getCookies();
		
		String message = "";
		for(Cookie c : cookies) {
			if(c.getName().equals("message")) {
				message = c.getValue();				
			}
		}
	}
}
