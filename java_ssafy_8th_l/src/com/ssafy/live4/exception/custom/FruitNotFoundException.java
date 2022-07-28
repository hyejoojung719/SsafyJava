package com.ssafy.live4.exception.custom;

public class FruitNotFoundException extends Exception{
	
	public FruitNotFoundException(String name) {
		// 에러메세지 설정
		super(name + "에 해당하는 과일은 없습니다.");
	}

}
