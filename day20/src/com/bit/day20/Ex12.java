package com.bit.day20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex12 {

	public static void main(String[] args) {
		String msg1 = "java�� �������� �ۼ�";
		String msg2 = "���۷� �ۼ�";
		
		File file = new File("test05.txt");
		
		Writer fw = null;
		BufferedWriter bw = null;
		try {
			fw= new FileWriter(file);
			bw= new BufferedWriter(fw);
			char[] cbuf = msg1.toCharArray();
			bw.write(cbuf);						//���۷� �ۼ�
			bw.newLine();
//			bw.write("\r\n");		/newLine�� ������ �ǹ��Ѵ�
			cbuf=msg2.toCharArray();
			bw.write(cbuf);
			
//			for(int i=0; i<msg.length(); i++){
//				fw.write(msg.charAt(i));
//			}
//			fw.write(cbuf,0,cbuf.length);
//			fw.write(new String(cbuf));
//			fw.write(msg);
			
			bw.flush();
			System.out.println("�ۼ��Ϸ�");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(bw!=null) bw.close();
				if(fw!=null) fw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
