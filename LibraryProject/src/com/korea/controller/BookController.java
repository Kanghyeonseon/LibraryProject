package com.korea.controller;

import com.korea.dto.BookDTO;
import com.korea.service.BookService;

public class BookController implements SubController{
	//사실 BookController 말고도 다른걸 다 해줘야하는데 
	//예제로 BookController만 썼다
	
	BookService service = new BookService();
	
	@Override
	public void execute(int num, BookDTO dto) {
		//요청서비스확인
		switch(num) {
			case 1 : //조회
				break;
			case 2 : //삽입
				service.Insert(dto);
				break;
			case 3 : //수정
				break;
			case 4 : //삭제
				break; 
		}
		
		
		
		
	}

}
