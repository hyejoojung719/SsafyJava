package com.ssafy.live2.extend.person;

public class SpiderMan extends Person {
	boolean isSpider;
	Spider spider = new Spider(); // 따라서 객체를 만들어줘야 한다.
	
	public SpiderMan(String name, boolean isSpider){
		// this() or super()가 올 수 있는데 아무 것도 없으면 누가 생략???
		super(name); // 아무 것도 없으면 이게 생략되어 있다.
		this.isSpider = isSpider;
	}

	void fireWeb() {
		if(isSpider) {
			// null pointer => nul.xx 하고 있는 것
			spider.fireWeb();
		}else {
			System.out.println("거미줄을 쏘... 어떻게 쏘지?");
		}
	}
	
	// 자신이 코드를 개선하면 자동적으로 사용하는 곳에서는 개선된 코드가 동작하다니...
	@Override // 이걸 붙였는데 만약 jump를 jumo로 하면 경고 메시지가 뜸!!
	void jump() {
		if(isSpider) {
			spider.jump();
		}else {
			//System.out.println("두 다리로 폴짝!!");
			super.jump();
		}
	}
	
	@Deprecated // love라는 메소드 취소선 생김
	void love() {
		System.out.println("메리 제인 사랑해!!");
	}
	
	@Override //to+ctrl+spaces
	public String toString() {
		// TODO Auto-generated method stub
		//return "name : " + this.name + ", is Spider : " + isSpider;
		return super.toString() + ", is Spider : " + isSpider;
	}

	
}
