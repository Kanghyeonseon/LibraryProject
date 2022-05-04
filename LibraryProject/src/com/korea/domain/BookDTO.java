package com.korea.domain;
//도서관련정보를 담는 단위로만 쓴다.
public class BookDTO {
	private String BookCode;
	private String BOokName;
	
	
	//생성자생성
	public BookDTO(String bookCode, String bOokName) {
		super();
		BookCode = bookCode;
		BOokName = bOokName;
	}
	
	public String getBookCode() {
		return BookCode;
	}
	public void setBookCode(String bookCode) {
		BookCode = bookCode;
	}
	public String getBOokName() {
		return BOokName;
	}
	public void setBOokName(String bOokName) {
		BOokName = bOokName;
	}

	@Override
	public String toString() {
		return "BookDTO [BookCode=" + BookCode + ", BOokName=" + BOokName + "]";
	}	
	
}
