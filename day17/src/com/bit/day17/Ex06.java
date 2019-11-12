package com.bit.day17;

import java.io.File;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		File file;
		try {
			file = File.createTempFile("abcdefg", "bit");	//임시파일저장경로 파일명 (앞,뒤)로붙어
			System.out.println("임시파일생성");
			System.out.println(file.exists());
			System.out.println(file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
