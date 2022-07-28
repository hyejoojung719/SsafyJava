package com.ssafy.live4.exception.custom;

// 컴파일 때 체크 안받기 때문에 RunTimeException 상속
public class NoSpaceException extends RuntimeException{
	
	public NoSpaceException(String name) {
		super(name+"을 담을 공간이 없습니다.");
	}
}
