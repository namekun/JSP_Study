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
	// Servlet ����
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
	
	// Servlet ����
	@Override
	public void init() throws ServletException{
		System.out.println("-----init-----");
	}

	// Servlet ����
	@Override
	public void destroy() {
		System.out.println("-----destroy-----");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("-----preDestroy-----");
	}
}
