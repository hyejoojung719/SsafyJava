package com.ssafy.live2.poly;

import com.ssafy.live2.extend.person.Person;
import com.ssafy.live2.extend.person.SpiderMan;

public class PolySpiderTest {
	public static void main(String[] args) {
		SpiderMan sman = new SpiderMan("피터파커", true);
		
		// 다형성
		SpiderMan sman2 = sman;
		Person person = sman; // 묵시적 형 	변환(조상의 것을 자식이 다 갖고 있기 때문)
		Object obj =  person; // 묵시적 형 변환
		
		// 명시적 형 변환
		SpiderMan reSpider = (SpiderMan)obj;
		// reSpider.fireWeb(); 이 가능해진다(public 붙였을 경우)
		
		// 뭐든지 담을 수 있는 만능의 주머니 
		Object[] objs = new Object[4];
		objs[0] = sman;
		objs[1] = "Hello";
		objs[2] = objs;
		objs[3] = 1; // 기본형이었는데 왜 되지..? -> autoboxing
		// int가 아닌 Integer로 맴핑 돼서 들어감
	
		
		SpiderMan fromObjArray = (SpiderMan)objs[0];
		//fromObjArray.fireWeb(); (앞에 public 붙여야 오류 사라짐..)
		
		// 2. 따라서 형변환을 할때는 반드시 타입을 확인학 하자!
		if(objs[1] instanceof SpiderMan) {
			SpiderMan fromObjArray2 = (SpiderMan)objs[1];
			// fromObjArray2.fireWeb(); 얘는 실행 X -> objs[1]에는 이미 문자열이 들어가 있기 때문에..
			// 1. 따라서 무턱대고 형변환을 하면 안 된다.
			// 따라서 확인하는 과정이 필요
		}
		
		
		for(Object o : objs) {
			System.out.println(o.getClass().getName());
			// 객체 타입 확인
		}
	}
}
