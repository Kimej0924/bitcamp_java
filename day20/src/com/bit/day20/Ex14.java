package com.bit.day20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Ex14 {

	public static void main(String[] args) {
		InputStream inn = System.in;
		PrintStream oout = System.out;
		
		String msg1 = "abcdefg";
		String msg2 = "12345";
		String msg3 = "�ѱ�ddddaa��";

		File file = new File("test05.txt");
	
		OutputStream os = null;
		OutputStreamWriter osw = null;
		PrintStream ps = null;			//byte ��Ʈ�������� ��¿� �������ä�����������������
		
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			os = new FileOutputStream(file);
			ps = new PrintStream(os);
			ps.println(msg1);
			ps.println(msg2);
			ps.println(msg3);
			
			
//			osw = new OutputStreamWriter(os);
//			bw = new BufferedWriter(osw);
//			pw = new PrintWriter(bw);
//			pw.println(msg1);
//			pw.println(msg2);
//			pw.println();
//			pw.println(msg3);

//			bw.write(msg1);
//			bw.newLine();
//			bw.write(msg2);
//			bw.newLine();
//			bw.write(msg3);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(pw!=null)pw.close();
				if(bw!=null)bw.close();
				if(osw!=null)osw.close();
				if(os!=null)os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	
	
	
	}

}
