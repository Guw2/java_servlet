package com.lorian;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class RedirectServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		
		HttpSession session = req.getSession();
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		
		
		Cookie cookie = new Cookie("message", "hifromredirectservlet");
		res.addCookie(cookie);
		
		res.sendRedirect("servlet_add");
		
	}
	
}
