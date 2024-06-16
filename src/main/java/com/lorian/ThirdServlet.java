package com.lorian;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet{

	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		int k = Integer.parseInt(req.getParameter("result"));
		
		PrintWriter out = res.getWriter();
		
		out.println("The Result is " + k*k + " in ThirdServlet.");
		
	}
	
}
