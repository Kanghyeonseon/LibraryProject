package com.korea.controller;

import com.korea.domain.BookDTO;

public interface SubController {
	//실행하기 함수
	void execute(int num, BookDTO dto);
	//DTO : 데이터를 담는 단위
	//DTO가 도서정보일수도 인증정보일수도... 있는데 BookDTO로 정했다.
	//num : 서비스 종류(조회, 삽입, 수정, 삭제);
}
