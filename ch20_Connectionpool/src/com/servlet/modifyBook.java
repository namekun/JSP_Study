package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/modifyBook")
public class modifyBook extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		String bookName = request.getParameter("book_name");
		String bookLoc = request.getParameter("book_loc");

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "nam";
		String pw = "nam";

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName(driver);

			con = DriverManager.getConnection(url, id, pw);
			String sql = "UPDATE book SET book_loc = ? WHERE book_name = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "001-00007123");
			pstmt.setString(2, "book5");
			
			int result = pstmt.executeUpdate();

			if (result == 1) {
				out.print("INSERT success!!");
			} else {
				out.print("INSERT fail");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // resource를 해제하는 과정
			try {
				if (pstmt != null)
					pstmt.close(); // statement 해제
				if (con != null)
					con.close(); // connection 해제
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
