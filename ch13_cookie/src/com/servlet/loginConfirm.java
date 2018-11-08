package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginConfirm")
public class loginConfirm extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String mID = request.getParameter("mID");
		String mPW = request.getParameter("mPW");

		out.print("mID : " + mID);
		out.print("mPW : " + mPW);

		Cookie[] cookies = request.getCookies();
		Cookie cookie = null;

		//cookie 조회
		for (Cookie c : cookies) {
			System.out.println("c.getName :" + c.getName() + " c.getValue() : " + c.getValue());
			
			// 기존에 memberID 조회한 이력이 있다면?
			if (c.getName().equals("memberID")) {
				cookie = c;
			}
		}
		
		// 없다면 사용자가 입력한 값으로~
		if (cookie == null) {
			System.out.println("cookie is null");
			cookie = new Cookie("memberID", mID);
		}
		
		response.addCookie(cookie);
		cookie.setMaxAge(60*60); // 1시간동안 유지

		response.sendRedirect("loginOKjsp.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
