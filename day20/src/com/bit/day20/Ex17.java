package com.bit.day20;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {
		// �л������������α׷�(ver0.4.0)
		
//		String title = "�л������������α׷�(ver0.4.0)";
//		String bar = "-----------------------------------";
//		String menu = "1.�Է�  2.����  3.����  4.����  0.���� >";
//		String viewT = "�й�\t|����\t|����\t|����\t|����\t|���";
	
		String path = "students.bin";
		File file = new File(path);
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int cnt=0;
		OutputStream os= null;
		PrintStream ps = null;	
//		InputStream is = null;
//		DataInputStream dis = null;
		String title = "�л������������α׷�(ver0.4.0)";
		String bar = "-----------------------------------";
		String menu = "1.�Է�  2.����  3.����  4.����  0.���� >";
		String viewT = "�й�\t|����\t|����\t|����\t|����\t|���";
		String[] msg = {"����","����","����"};
		
		byte[] buf = new byte[20];
		try {
			os = new FileOutputStream(file);
			ps = new PrintStream(os);
//			is = new FileInputStream(file);
//			dis = new DataInputStream(is);
			
			System.out.println(title);
			System.out.println(bar);
			ps.println(title);
			ps.println(bar);
			
			while(true){
				System.out.println(menu);
				input = sc.nextInt();
				
				////////// 0. ���� ////////////
				if(input==0){
					System.out.println("����˴ϴ�.");
					break;
				}
				////////// 1. �Է� ////////////
				if(input==1){
					cnt++;
					for(int i=0; i<msg.length; i++){
					System.out.print(cnt+"���л�"+msg[i]+">>");
					int su = System.in.read(buf);
					os.write(buf,0,su);
					os.flush();			//buf ���°�
					

					if(i==3){
						System.out.println("�ۼ��Ϸ�");
						
					}
				}
				
					
				////////// 2. ���� ////////////
				if(input==2){
					System.out.println(viewT);
					
					
				}
					
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
//				if(dis!=null){dis.close();}	
//				if(is!=null){is.close();}	
				if(ps!=null){ps.close();}	
				if(os!=null){os.close();}	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}








	}

}
