package com.ssafy.live3.generic.box2;

class GrandParent{}

class Parent extends GrandParent{}

class Child extends Parent{}


public class Test<T> {
	
	private T some;
	
	public T getSome() {
		return some;
	}

	public void setSome(T some) {
		this.some = some;
	}

	public static void main(String[] args) {
		
	}
	
	public static void test(Test<? super Parent> t) {
		// Test<? extends Parent> t -> 여기서 가능한 타입은 T<Parent>, T<Child>가 올 수 있다. 
		// 그러나 뭐가 올지 몰라서 t.setSome(new Parent()) 이런식으로 넣지 못 함.
		// ?에 들어가는 타입은 최소 Parent 이다. 
		// 그래서 Test<? super Parent>로 바꿔야 한다. 
		// 그러면 Parent랑 Child 둘 다 다룰 수 있다. 
		
		t.setSome(new Parent());
		t.setSome(new Child());
	}

}
