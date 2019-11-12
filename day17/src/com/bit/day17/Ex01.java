package com.bit.day17;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
		// file
		// 경로(상대,절대)
		java.io.File file1=null;
//		file1=new File("C:\\java\\day17\\test01.bin");		// 절대경로
//		 . 현재디렉토리	..한단계올라간디렉토리
		file1=new File(".\\..\\day17");		// . 현재디렉토리에 있는 파일
		
		
		System.out.println("존재하는지?"+file1.exists()); // 없는 파일,폴더명을 입력하면 false가 떨어진다
		System.out.println("디렉토리인지?"+file1.isDirectory());
		System.out.println("파일인지?"+file1.isFile());
		
		System.out.println("경로?"+file1.getPath());
		System.out.println("절대경로?"+file1.getAbsolutePath());
		System.out.println("절대경로?"+file1.getAbsoluteFile());
		
		try {
			System.out.println("절대경로?"+file1.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("이름?"+file1.getName());	//윈도우 이외에는 파일이나 디렉토리나 다 같이인식
		System.out.println("상위경로?"+file1.getParent());
		System.out.println("r읽기권한?"+file1.canRead());
		System.out.println("w쓰기권한?"+file1.canWrite());
		System.out.println("x실행권한?"+file1.canExecute());
		System.out.println(file1.length()+"byte");
		System.out.println(new Date(file1.lastModified()));
		String[] msg = file1.list();
		System.out.println(Arrays.toString(msg));
	}

}
