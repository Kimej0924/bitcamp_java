package com.bit.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		// io
		File file;
		file = new File("test01.bin");
		
		java.io.OutputStream os;
		// 1byte
		byte[] by="한글로작성".getBytes();
		try {
			os=new java.io.FileOutputStream(file);
			for(int i=0; i<by.length; i++){
				os.write(by[i]);
			}
//				os.write('a');
//				os.write('b');
//				os.write('c');
//				os.write('d');
//				os.write('e');
//				os.write('f');
//				os.write('g');
//				os.write('한');
				os.close();
				System.out.println("작성완료");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
				e.printStackTrace();
		}
			
	}

}

