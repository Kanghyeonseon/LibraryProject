package com.korea.controller;

import com.korea.dto.BookDTO;
import com.korea.dto.DTO;
import com.korea.service.BookService;

public class BookController implements SubController {
	BookService service = new BookService();
	//집합관계는 이런식으로 객체를 만들어줘야한다. 


	@Override
	public boolean execute(int num, DTO dto) {
		BookDTO bdto = (BookDTO) dto;// 다운캐스팅을 해주지않으면 받을 수 없다.
		//1.조회, 2.삽입, 3.수정, 4.삭제
		
		if(num==1) {			
		} else if(num==2) {
			return service.Insert(bdto);
		} else if(num==3) {
			
		} else if(num==4) {
			
		}
		
		
		return false;
	}



}
