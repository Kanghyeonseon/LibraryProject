package com.korea.dto;

public class BookDTO extends DTO {
	private String Book_Code;
	private String Book_Name;
	private String Book_Author;
	private String Publisher;
	private int isRental;
	
	
	//생성자
	public BookDTO(String book_Code, String book_Name, String book_Author, String publisher, int isRental) {
		super();
		Book_Code = book_Code;
		Book_Name = book_Name;
		Book_Author = book_Author;
		Publisher = publisher;
		this.isRental = isRental;
	}

	//게터세터
	public String getBook_Code() {
		return Book_Code;
	}


	public void setBook_Code(String book_Code) {
		Book_Code = book_Code;
	}


	public String getBook_Name() {
		return Book_Name;
	}


	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}


	public String getBook_Author() {
		return Book_Author;
	}


	public void setBook_Author(String book_Author) {
		Book_Author = book_Author;
	}


	public String getPublisher() {
		return Publisher;
	}


	public void setPublisher(String publisher) {
		Publisher = publisher;
	}


	public int getIsRental() {
		return isRental;
	}


	public void setIsRental(int isRental) {
		this.isRental = isRental;
	}

	@Override
	public String toString() {
		return "BookDTO [Book_Code=" + Book_Code + ", Book_Name=" + Book_Name + ", Book_Author=" + Book_Author
				+ ", Publisher=" + Publisher + ", isRental=" + isRental + "]";
	}
	
	
}
