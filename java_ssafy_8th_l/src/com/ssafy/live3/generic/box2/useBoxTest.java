package com.ssafy.live3.generic.box2;

public class useBoxTest {
	public static void main(String[] args) {

		MethodGeneric m = new MethodGeneric();
		
		m.method(30);
	}

	public static void userGenericBox() {

		GenericBox<Object> obox = new GenericBox<>();

	}

	// GenericBox에 담겨있는 타입이 숫자라는 가정하에 작동하는 메소드
	public static void test(GenericBox<? extends Number> box) {
		
//		box.setSome("hello");

//		box.setSome(10); 안 되는 이유 -> 10은 Integer인데 Integer클래스 인지 알 수 없어서 오류 발생
		// 즉, 최대로 올 수 있는 클래스가 Number이기 때문에 Number 아래 있는 클래스는 올 수 없음
		// extends를 super로 수정해야 숫자가 올 수 있다.
	}
}
