package com.ssafy.live2.extend.person;

public class SpiderManTest {

	@SuppressWarnings({"deprecation","unused"})
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		
		SpiderMan sman = new SpiderMan("피터파커", false);
		
		sman.eat();	//Person
		sman.jump();	//Person
		sman.fireWeb();	//SpiderMan
		
		sman.isSpider = true;
		
		sman.eat();	//Person
		sman.jump();	//Person -> 메소드 오버라이딩으로 소속이 Spider로 바뀜!
		sman.fireWeb();	//SpiderMan
		
		sman.love();
		
		System.out.println(sman.toString());
		
		
		// sman.equals()는 뭐지?? 만든적이 없는데 뜬디!
	}

}
