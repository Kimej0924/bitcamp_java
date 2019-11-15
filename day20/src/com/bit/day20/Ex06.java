package com.bit.day20;
//DataInputStream���� �ۼ��Ѱ� �ҷ����°��غ���

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
			System.out.println(dis.readInt()+1);		// �⺻�ڷ����� ���ϴ°� dataStream�� �����ִ� //���� ���ڿ��� ����
			System.out.println(dis.readDouble());		// dos�� �پ��� �ڷ����� ���ԵǸ� �ۼ��� �����״�� �о�鿩�� ��Ȯ�� ���� ����
			System.out.println(dis.readChar());			// ���ڿ��� �̵����������� ������ ����ִ�.....
			System.out.println(dis.readBoolean());		// ��� �� �Է��� �� �� �ٸ� �ڷ����� ������ �ǵ� ���� ������
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
