package com.ssafy.live2.modifier.p2;

import com.ssafy.live2.modifier.p1.Parent;
//TODO: Parent를 상속받고 Parent의 member들에 접근해보세요.
 public class OtherPackageChildClass extends Parent{
	 
	 public void method() {
		 this.publicVar = 10;
		 this.protectVar = 10;
//		 this.defaultVar = 10; // dedfault = package 따라서 패키지가 달라지므로 아웃
//		 this.privVar = 10; // 상속을 해주긴 하지만 볼 수는 없다.
//		 this.someVar = 10; // 이런 거 없어
	 }
	 
    // END:
}
