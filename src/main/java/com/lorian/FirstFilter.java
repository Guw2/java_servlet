package com.lorian;

import jakarta.servlet.Filter;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@WebFilter("/add")
public class FirstFilter implements Filter {
	
	public void init(FilterConfig config) throws ServletException {
		
	}
	public void destroy() {
		
	}

	@Override
	public void doFilter(jakarta.servlet.ServletRequest request, jakarta.servlet.ServletResponse response,
			jakarta.servlet.FilterChain chain) throws IOException, jakarta.servlet.ServletException {
		
		String user = request.getParameter("user");
		
		if(!user.isBlank())
			chain.doFilter(request, response);
		else
			response.getWriter().println("Deu cu.");
		
	}
}
