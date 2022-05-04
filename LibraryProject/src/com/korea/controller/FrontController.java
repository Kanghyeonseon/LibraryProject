package com.korea.controller;

import java.util.HashMap;
import java.util.Map;

import com.korea.dto.BookDTO;

public class FrontController {
//각각의 Controller를 객체형으로 가진다.
//SubController를 담는 컬렉션 지정
	
	
	
	//맵에 서브컨트롤러를 등록시키는 작업(컬렉션)
	Map<String, SubController> map = new HashMap<>();
	//상위인터페이스를 제너릭타입으로 돌려준다.
	public FrontController() {
		Init();
		//FrontController를 실행했을 때 Init이라는 메소드를 항상 실행하도록한다.
	}
	
	void Init() {
		map.put("BOOK", new BookController());
		map.put("AUTH", new AuthController());
		//SubController로 Value부분을 지정, 
		//BookController를 SubController타입으로바꾸는것이므로 업캐스팅
		//BookController가 객체로 지정이 되어있다.
//		map.put("AUTH", new AuthenticationController());
//		map.put("EMPLOYEE", new EmployeeController());
//		map.put("Member", new MemberController());
	}
	public void SubConExecute(String menu, int num, BookDTO dto) {
		if(menu.equals("BOOK")) {
			//도서관련요청
			SubController sub = map.get("BOOK");
			//BOOK키워드를가지는 객체를만들고, 			
			//BookController를 map에서 꺼내욤. 
			
			sub.execute(num, dto); //도서관련 dto
			//입력된 num에 따라 도서 
			//조회, 삽입, 수정, 삭제를 할것이다.
			//요청번호, 도서정보를 BookController에 execute로 전달한다.
			
			
		} else if(menu.equals("AUTH")) {
			//로그인, 로그아웃 요청
		} else if(menu.equals("MEMBER")) {
			
		}
	}
	
	
	
}
