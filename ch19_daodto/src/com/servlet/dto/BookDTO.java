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
	
	//setter은 생성자에서 이미 초기화를 해줬기때문에 필요없다.
	
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
