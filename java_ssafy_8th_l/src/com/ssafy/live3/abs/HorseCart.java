package com.ssafy.live3.abs;

// extends Vehicle이 안됨! 
// 재정의 필요!
public class HorseCart extends Vehicle{
	
	@Override // 재정의
	public void addFuel() {
		System.out.println("말은 건초를 먹인다");
	}
	
}
