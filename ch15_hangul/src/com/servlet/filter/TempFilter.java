package com.servlet.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/TempFilter")
public class TempFilter implements Filter {


	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("--- filter init() ---");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("---- filter doFilter ----");
		
		// request filter
		request.setCharacterEncoding("UTF-8");
		
		chain.doFilter(request, response);
		
		// response filter
	
	}

	public void destroy() {
		System.out.println("--- filter destroy ---");
	}
}
