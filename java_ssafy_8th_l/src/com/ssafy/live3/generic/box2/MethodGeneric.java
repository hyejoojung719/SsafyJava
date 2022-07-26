package com.ssafy.live3.generic.box2;

public class MethodGeneric {

	public <P> void method(P p) {
		
		System.out.println(p.getClass().getName());
	}
}
