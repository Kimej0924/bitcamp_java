package com.bit.day17;

import java.io.File;

public class Ex05 {

	public static void main(String[] args) {
		File file;
		file = new File("newName.bin");
		
		File file2;
		file2 = new File("test01.bin");
		
		System.out.println("파일명변경?"+file.renameTo(file2));

	}

}
