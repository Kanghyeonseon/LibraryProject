package com.korea.domain;
//도서관련정보를 담는 단위로만 쓴다.
public class BookDTO {
	private String BookCode;
	private String BookName;
	
	
	//생성자생성
	public BookDTO(String bookCode, String bookName) {
		super();
		BookCode = bookCode;
		BookName = bookName;
	}	
	public String getBookCode() {
		return BookCode;
	}
	public void setBookCode(String bookCode) {
		BookCode = bookCode;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bOokName) {
		BookName = bOokName;
	}

	@Override
	public String toString() {
		return "BookDTO [BookCode=" + BookCode + ", BOokName=" + BookName + "]";
	}	
	
}
