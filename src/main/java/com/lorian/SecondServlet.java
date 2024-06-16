package com.lorian;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int k = (int) req.getAttribute("result");
		
		PrintWriter out = res.getWriter();
		
		out.println("The Result is " + k*2 + " in SecondServlet.");
		
	}

}
