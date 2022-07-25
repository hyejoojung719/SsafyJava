package com.ssafy.live2.modifier.singleton;

class SingletonClass{
    // TODO:SingletonClass에 Singleton Design Pattern을 적용하시오.
    
	// stateless 한 클래스 - 상태를 가지지 않고 기능만~~
	private SingletonClass() {} // 1. public -> private로 변경하자!
	// public으로 바뀌면 이건 singleton 디자인 패턴에 실패한 것이다.
	
	private static SingletonClass sc = new SingletonClass(); // 2. 위 생성자는 여기서만 이걸 쓸 수 있다.
	
	// 3. 이제 getter가 필요
	// 그러나 이 메소드를 쓰려면 객체를 만들어야하는데
	// 객체를 만들지 못 하니까 static을 붙인다. 
	public static SingletonClass getSingletonClass() {
		return sc; // 이런식으로 외부 클래스에서도 쓸 수 있다. 
	}
	
	// END:
    public void sayHello() {
      System.out.println("Hello");
    }
    
  }

  public class SingletonTest {
    public static void main(String[] args) {
      // TODO:SingletonClass를 사용해보세요. 
    	/*
    	SingletonClass sc = new SingletonClass();
    	sc.sayHello();
    	
    	SingletonClass sc2 = new SingletonClass();
    	sc2.sayHello();
    	*/ // 메모리에 쓸 데 없이 객체가 생성 돼서 불편하다!
    	
    	SingletonClass sc = SingletonClass.getSingletonClass();
    	sc.sayHello();
    	
    	SingletonClass sc2 = SingletonClass.getSingletonClass();
    	sc2.sayHello();
    	
    	System.out.println(sc == sc2);
    	
      // END:
    }
  }
