package com.korea.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.korea.dto.BookDTO;

public class BookDAO extends DAO{
	

	
	public BookDAO () {}
	
	//도서정보 조회(num : 1)
	public void Select() {}
	//도서정보 추가(num : 2)
	public boolean Insert(BookDTO dto) {
			//전달이 잘 됐는지 boolean형으로 알려준다.
		try {
			pstmt = conn.prepareStatement("insert into book_tbl values(?,?,?,?,?)");
			pstmt.setString(1, dto.getBook_Code());
			pstmt.setString(2, dto.getBook_Name());
			pstmt.setString(3, dto.getBook_Author());
			pstmt.setString(4, dto.getPublisher());
			pstmt.setInt(5, dto.getIsRental());
			int result = pstmt.executeUpdate();				
			if(result!=0) { return true; }
			
		} catch (Exception e) {
			e.printStackTrace();
		}  finally {
			try {pstmt.close(); }catch(Exception e) { e.printStackTrace(); }
		}			
		return false;
		}
		//도서정보 수정(num : 3)
		public void Update() {}
		//도서정보 삭제(num : 4)
		public void Delete() {}
		
	}
	//연결객체 생성하는 작업까지만 한다. (finally이하 구문을 지워준다.)



