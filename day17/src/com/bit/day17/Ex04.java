package com.bit.day17;

import java.io.File;

public class Ex04 {

	public static void main(String[] args) {
		File file;
		file=new File("newName2.bin");
		
		if(file.exists()){
			System.out.println("파일삭제?"+file.delete());
		}

	}

}
