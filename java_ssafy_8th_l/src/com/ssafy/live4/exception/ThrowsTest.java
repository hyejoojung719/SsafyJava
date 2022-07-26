package com.ssafy.live4.exception;

public class ThrowsTest {
    // TODO: 1. methodCall2()에서 uncheckedExceptionMethod()를 호출할 때 발생하는 예외를 throws로 처리하세요.
    // TODO: 2. methodCall2()에서 checkedExceptionMethod()를 호출할 때 발생하는 예외를 throws로 처리하세요.
     public static void main(String[] args){
        try {
			methodCall1(); 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        System.out.println("done");
    }

     private static void methodCall1() throws ClassNotFoundException{
        methodCall2();
    }

     private static void methodCall2() throws ClassNotFoundException{
//        uncheckedExceptionMethod();
        checkedExceptionMethod(); // 얘도 throws나 try catch중 하나 무조건 해야함
    }

     private static void checkedExceptionMethod() throws ClassNotFoundException{
        Class.forName("Hello"); // throws나 try cath중 하나 무조건 해야함
    }

    @SuppressWarnings("unused")
    private static void uncheckedExceptionMethod() {
        int i = 1 / 0;
    }

}
