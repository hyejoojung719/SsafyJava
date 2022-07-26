package com.ssafy.live4.exception.install;


public class UseInstaller {
	public static void main(String[] args) {
		// TODO: InstallApp을 이용하면서 자원이 확실히 정리되도록 해보자.

		InstallApp ia = new InstallApp();

		try {
			// try 발생할 수 있는 구문
			ia.copy();
			ia.install();
		}catch (Exception e) {
			// catch 발생한 예외 객체를 받아 처리하는 부분
			e.printStackTrace();
		}finally {
			//  finally try구문에서 사용한 자원 반납을 주로 함
			ia.delete();
		}

		// END:
		System.out.println("설치 종료");

	}
}
