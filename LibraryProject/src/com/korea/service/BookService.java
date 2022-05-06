package com.korea.service;

import com.korea.domain.BookDAO;
import com.korea.dto.BookDTO;

public class BookService {
	//멤버
	BookDAO dao = new BookDAO();
	
	//조회
	
	//추가
	public boolean Insert(BookDTO dto) {
		return dao.Insert(dto);
		//전달받은 dto를 dao로 넘기고 반환되는 값을 Controller로 true/false로 연결
		
	}
	
	 
	//수정
	
	//삭제
	
	
}
