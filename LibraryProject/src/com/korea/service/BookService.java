package com.korea.service;

import com.korea.domain.BookDAO;
import com.korea.dto.BookDTO;

public class BookService {
	//dao와 연결
	BookDAO dao = new BookDAO();
	
	//Book 조회, 삽입, 수정, 삭제
	void Select() {}
	void Insert(BookDTO dto) {
		dao.Insert(dto); 
		//이렇게 불러오기위해서 Insert를 public으로바꿨다.
		
	}
	void Update() {}
	void Delete() {}
}
