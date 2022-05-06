package com.korea.controller;

import com.korea.dto.AuthDTO;
import com.korea.dto.DTO;
import com.korea.service.AuthService;

public class AuthController implements SubController{
	AuthService service = new AuthService(); //집합 포함관계를 봐야한다.
	@Override
	public boolean execute(int num, DTO dto) {
		AuthDTO adto  = (AuthDTO) dto;
		
		if(num==1) {   	 //멤버로그인
			service.MemberLogin(adto);
		}
		else if(num==2) { //직원로그인
			service.EmployeeLogin(adto);
		}
		
		
		return false;
	}

}
