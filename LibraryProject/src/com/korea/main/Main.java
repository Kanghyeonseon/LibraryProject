
package com.korea.main;

import com.korea.controller.FrontController;
import com.korea.dto.BookDTO;
import com.korea.view.Viewer;

public class Main {
	public static void main(String[] args) {
		
		/*
		//1. BookDAO- BookDTO 테스트
		BookDTO dto = new BookDTO("1010","열혈C언어","윤성우","오렌지미디어",1);
		BookDAO dao = new BookDAO();
		dao.Insert(dto); //성공여부 확인
		*/
		
//		FrontController controller = new FrontController();
//		BookDTO dto = new BookDTO("2023","이것이자반가","윤성우","오렌지미디어",0);
//		controller.SubControllerEX("BOOK", 2, dto);
		//서비스명과 작업번호 전달한다.
		
		
		//3. Viewer랑 컨트롤러를 연결
		Viewer view1 = new Viewer();
		view1.BookMenu();
		
		
	}
}