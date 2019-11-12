package com.bit.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex14 {

	public static void main(String[] args) {
		//개행
		//\r
		//\n
		//\r\n
		String msg="이렇게 작성 할 수 있습니다\r\n1234\r\nabcd";	//윈도우에서의 개행은 \r\n 인데 win10에선\n도되네?
		File file;
		file = new File("test01.bin");

		OutputStream os;
		byte[] buff=msg.getBytes();

		try {
			os = new FileOutputStream(file);
			
			os.write(buff);
			
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
