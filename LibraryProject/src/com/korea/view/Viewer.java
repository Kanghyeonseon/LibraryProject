package com.korea.view;

import java.util.Scanner;

import com.korea.controller.FrontController;
import com.korea.dto.BookDTO;


public class Viewer {
	
	int num;
	Scanner sc = new Scanner(System.in);
	
	//컨트롤러객체를 추가
	FrontController controller = new FrontController();
	
	//메인메뉴
	public void LoginMenu() {		
		while(true) {
		System.out.println("----------로그인----------");
		System.out.println("1. 직원로그인");
		System.out.println("2. 회원로그인");
		System.out.println("3. 종료");
		System.out.println("----------로그인----------");
		System.out.print("번호 >>");
		num = sc.nextInt();		
		switch(num) {
			case 1 : //직원로그인				
				BookMenu();
				break;
			case 2 : //회원로그인				
				break;
			case 3 : //종료
				break;
			default : 
				System.out.println("잘못 입력하셨습니다.");
				
		} //switch끝
		} //while 끝
		
	}
	
	//도서메뉴
	public void BookMenu() {
		while(true) {
			System.out.println("----------MAIN----------");
			System.out.println("1. Select"); //도서조회
			System.out.println("2. Insert"); //도서정보삽입
			System.out.println("3. Update"); //도서정보수정
			System.out.println("4. Delete"); //도서삭제
			System.out.println("5. Previous");
			System.out.println("----------MAIN----------");
			System.out.print("번호 >>");
			num = sc.nextInt();			
			switch(num) {
				case 1 : 
					System.out.println("책 조회!");
					break;
				case 2 :
					System.out.println("도서코드|도서명|저자|출판사");
					String Code = sc.next();
					String Name = sc.next();
					String Author=sc.next();
					String Publisher=sc.next();
					BookDTO dto = new BookDTO(Code, Name,Author,Publisher,1);
									//1은 대여가능이라는 뜻
					boolean result = controller.SubControllerEX("BOOK", 2, dto);
					if(result) System.out.println("INSERT 성공");
					else System.out.println("INSERT 실패!");
					break;
				case 3 : 
					System.out.println("수정요청!");
					break;
				case 4 : 
					System.out.println("삭제요청!");
					break;
				case 5 : 
					return; //Main메뉴로 리턴					
				default : //잘못입력 
					System.out.println("번호를 잘못입력하셨습니다.");
					break;
			}
			
			
			
		}
	}
	
	
	//인증(로그인)메뉴
	
	
	//직원메뉴
	
	
	//회원메뉴
}
