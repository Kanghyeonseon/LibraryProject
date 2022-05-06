package com.korea.controller;

import java.util.HashMap;

import java.util.Map;

import com.korea.dto.*;

public class FrontController {
	//서브컨트롤러 저장용	
	Map<String, SubController> map = new HashMap();
	
	//각각의 SubController를 받을 수 있는 맵이다.	
	public FrontController() {
		Init();
		//Map에서 Init에 지정된대로 서브컨트롤러가 추가된다.		
	}
	//등록 할 서비스 지정
	private void Init() {
		map.put("BOOK", new BookController());
		map.put("AUTH", new AuthController());

	}	
	//MAP에 있는 서브컨트롤러를 꺼내어 해당 컨트롤러를 실행하는 함수
	public boolean SubControllerEX(String menu, int num, DTO dto) {
		SubController tmp;
		if(menu.equals("BOOK")) {
			tmp = map.get("BOOK"); //BOOKController에 꺼내서 tmp에 연결
			return tmp.execute(num, dto); //execute의 반환형이 불린형이다.
			//실행된 것을 View로 전달하는 역할을 한다.
			//num : 1->조회, 2->삽입 3->수정 4->삭제
		} else if(menu.equals("AUTH")) {
			tmp=map.get("AUTH"); //AuthController꺼내서 tmp에 꺼낸다.
			return tmp.execute(num, dto); //직원로그인인지 회원로그인인지 확인한다.
			//서브컨트롤러 execute를 실행하고 결과(true/false)를 view로 전달한다.
			//num : 1->회원로그인 2->직원로그인
		}
		return false;
	}
}
