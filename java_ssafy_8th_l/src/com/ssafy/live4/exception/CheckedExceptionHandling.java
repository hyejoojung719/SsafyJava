package com.ssafy.live4.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptionHandling {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // TODO: 다음에서 발생하는 예외를 처리해보자.
    	try {
    		Class.forName("abc.Def"); // ClassNotFoundException
            new FileInputStream("Hello.java"); // FileNotFoundException
            DriverManager.getConnection("Hello"); // SQLException
		} catch (ClassNotFoundException e) {
			System.out.println("classNotFound 예외 처리");
			e.printStackTrace();
		}catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		}catch (SQLException e) {
			System.out.println("쿼리문에 오류가 있습니다.");
			e.printStackTrace();
		}
        
        // END:
        System.out.println("프로그램 정상 종료");

    }
}
