package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bs")
public class bookServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "nam";
		String pw = "nam";

		Connection con = null;
		Statement stmt = null;
		// 한번에 여러개의 데이터를 받아야하므로 ResultSet을 사용
		ResultSet res = null;

		try {
			Class.forName(driver);

			con = DriverManager.getConnection(url, id, pw);
			stmt = con.createStatement();
			String sql = "SELECT * FROM book";
			// 검색할 때는 executeQuery
			res = stmt.executeQuery(sql);
			
			while (res.next()) {
				int bookId = res.getInt("book_id");
				String bookName = res.getString("book_name");
				String bookLoc = res.getString("book_loc");

				out.println("bookId : " + bookId + ",");
				out.println("bookName : " + bookName + ",");
				out.println("bookLoc : " + bookLoc + "</br>");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally { // resource를 해제하는 과정
			try {
				if (res != null)
					res.close();
				if (stmt != null)
					stmt.close(); // statement 해제
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
