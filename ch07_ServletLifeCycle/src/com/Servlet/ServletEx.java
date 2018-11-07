package com.Servlet;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletEx
 */
@WebServlet("/SE")
public class ServletEx extends HttpServlet {
	// Servlet 角青
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	@PostConstruct
	public void postconstruct() {
		System.out.println("----PostConstruct----");
	}
	
	// Servlet 积己
	@Override
	public void init() throws ServletException{
		System.out.println("-----init-----");
	}

	// Servlet 昏力
	@Override
	public void destroy() {
		System.out.println("-----destroy-----");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("-----preDestroy-----");
	}
}
