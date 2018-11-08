package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletEx extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminId = getServletConfig().getInitParameter("adminId");
		String adminPW = getServletConfig().getInitParameter("adminPW");
		
		PrintWriter out = response.getWriter();
		out.print("<p>adminId :"+ adminId  +"</p>");
		out.print("<p>adminPw :"+ adminPW  +"</p>");
		
		String imgDir = getServletContext().getInitParameter("imgDir");
		String testServerID = getServletContext().getInitParameter("testServerID");
		
		out.print("<p>imgDir :"+ imgDir  +"</p>");
		out.print("<p>testServerID :"+ testServerID  +"</p>");
		
		getServletContext().setAttribute("connectedIP", "112.124.45.45");
		getServletContext().setAttribute("connectedUser", "Kim");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
