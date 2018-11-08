package com.servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.servlet.dto.BookDTO;

public class BookDAO {
	
	DataSource dataSource;

	public BookDAO() {
		try {
			// �����̳��� connection pool�� �����´�.
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<BookDTO> select() {
		
		// �� �޼��忡�� DB�� �����ؼ� Data�� �����´�.
		
		ArrayList<BookDTO> list = new ArrayList<>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		
		try {
			con = dataSource.getConnection();
			String sql = "SELECT * FROM book";
			pstmt = con.prepareStatement(sql);
			res = pstmt.executeQuery();
			
			while(res.next()) {
				int bookId = res.getInt("book_id");
				String bookName = res.getString("book_name");
				String bookLoc = res.getString("book_loc");
				
				BookDTO bookDTO = new BookDTO(bookId, bookName, bookLoc);
				list.add(bookDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(res != null) res.close();
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		//list�� �����ش�.
		return list;
	}
}
