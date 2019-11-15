package com.bit.day20;
//DataInputStream으로 작성한거 불러오는거해보자

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex06 {

	
	public static void main(String[] args) {
		String path = "test02.bin";
		File file = new File(path);
		
		InputStream is = null;
		DataInputStream dis = null;
		
		try {
			is = new FileInputStream(file);
			dis = new DataInputStream(is);
			
			System.out.println(dis.read());
			System.out.println(dis.readInt()+1);		// 기본자료형에 속하는게 dataStream에 쓸수있다 //예외 문자열도 가능
			System.out.println(dis.readDouble());		// dos로 다양한 자료형을 쓰게되면 작성한 순서그대로 읽어들여야 정확한 값이 나옴
			System.out.println(dis.readChar());			// 문자열의 이동이있을때는 오류가 뜰수있다.....
			System.out.println(dis.readBoolean());		// 출력 시 입력한 것 중 다른 자료형이 빠지게 되도 오류 떨어짐
			System.out.println(dis.readUTF());			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				
				if(dis!=null){dis.close();}
				if(is!=null){is.close();}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
