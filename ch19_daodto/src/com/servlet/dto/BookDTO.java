package com.servlet.dto;

public class BookDTO {

	int bookId;
	String bookName;
	String bookLoc;
	
	public BookDTO(int bookId, String bookName, String bookLoc) {
		this.bookId = bookId;
		this.bookLoc = bookLoc;
		this.bookName = bookName;
	}
	
	//setter�� �����ڿ��� �̹� �ʱ�ȭ�� ����⶧���� �ʿ����.
	
	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public String getBookLoc() {
		return bookLoc;
	}
	
	
}
