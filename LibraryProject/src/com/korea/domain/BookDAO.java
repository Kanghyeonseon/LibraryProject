package com.korea.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//BookTable과 연결되어 도서를 조회, 삽입, 수정, 삭제하는데 사용한다.
//DB연동코드가 기본으로 setup이 되어있어야한다.
public class BookDAO {
	//연결정보	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/librarydb";
	private String id = "root";
	private String pw = "1234";
	
	//연결객체정보
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private Connection conn = null;
	
	//생성자 : 객체 생성시 기본 DBMS연결
	BookDAO() {
		try {
			Class.forName(driver);
			System.out.println("Driver Loading Success");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB Connected.....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//도서정보조회/삽입/수정/삭제
	void Select() {}
	void Insert(BookDTO dto) {
		try {
			//컨트롤러로부터 받은 도서정보를 Book_Tbl에 저장
			pstmt = conn.prepareStatement("insert into booktbl values(?,?)");
			pstmt.setString(1, dto.getBookCode());
			pstmt.setString(2, dto.getBookName());
			int result = pstmt.executeUpdate();
			if(result!=0) {
				System.out.println("도서등록완료!");
			} else {
				System.out.println("도서등록실패");
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { pstmt.close(); } catch(Exception e) {e.printStackTrace();}
		}
	}
	void Update() {}
	void Delete() {}
	
	
	
}
