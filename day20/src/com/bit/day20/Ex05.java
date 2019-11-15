package com.bit.day20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex05 {

	public static void main(String[] args) {
		//Data stream	byte단위는 불편.... 작업하면서 그 정보를 그대로 담고싶을때
		
		String path = "test02.bin";
		File file = new File(path);
		
		OutputStream os = null;
		DataOutputStream dos = null;
		
		int su1 = 1234;
		double su2 = 3.14;
		char ch = '@';
		boolean boo = true;
		String msg = "문자열";
		try {
			os = new FileOutputStream(file);
			dos = new DataOutputStream(os);

			dos.write(65);
			dos.writeInt(su1);
			dos.writeDouble(su2);
			dos.writeChar(ch);
			dos.writeBoolean(boo);
			dos.writeUTF(msg);
			dos.flush();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(dos!=null){dos.close();}		//객체 생성의 역방향으로 닫아줘야함 /아니면 오류떨어짐(깨져버린대)
				if(os!=null){os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}

}
