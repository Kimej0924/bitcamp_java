package com.bit.day17;

import java.io.File;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		File file;
		file=new File("test01.bin");
		
		if(!file.exists()){
			try {
				System.out.println("파일생성:"+file.createNewFile());
			} catch (IOException e) {
				e.printStackTrace();
			}
//			file.mkdir();		//상위 디렉토리가 존재하지 않으면 하위 디렉토리는 생성되지 않음
//			file.mkdirs();		//하위상위디렉토리 한번에 만드는거
//			System.out.println("디렉토리생성");
			
		}else{
			System.out.println("파일이존재함");
		}

	}

}
