package com.ssafy.live4.exception.resource;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {
		TryWithResource test = new TryWithResource();
		test.useStream();
		test.useStreamNewStye();

	}


	public void useStream() {
		FileInputStream fileInput = null; // 밖에선 선언하는 이유 -> try 내부에 있으면 catch나 finally에서 접근 x(자원 반납을 위해..)
		try {
			fileInput = new FileInputStream("abc.txt");
			fileInput.read();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileInput != null) {
				try {
					fileInput.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void useStreamNewStye() {
		// TODO: useStream을 try~with~resource 문장으로 변경하세요.
		try(
				FileInputStream fileInput = new FileInputStream("abc.txt")
			) {
			fileInput.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// END:
	}
}
