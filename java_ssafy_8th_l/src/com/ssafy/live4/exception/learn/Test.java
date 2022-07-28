package com.ssafy.live4.exception.learn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {
	public static void main(String[] args) throws FileNotFoundException{
		FileInputStream fi = new FileInputStream("abc.txt");
		
		System.out.println("실행");
	}
}
