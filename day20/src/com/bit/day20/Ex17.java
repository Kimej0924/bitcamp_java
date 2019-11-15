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
		// 학생성적관리프로그램(ver0.4.0)
		
//		String title = "학생성적관리프로그램(ver0.4.0)";
//		String bar = "-----------------------------------";
//		String menu = "1.입력  2.보기  3.수정  4.삭제  0.종료 >";
//		String viewT = "학번\t|국어\t|영어\t|수학\t|총점\t|평균";
	
		String path = "students.bin";
		File file = new File(path);
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int cnt=0;
		OutputStream os= null;
		PrintStream ps = null;	
//		InputStream is = null;
//		DataInputStream dis = null;
		String title = "학생성적관리프로그램(ver0.4.0)";
		String bar = "-----------------------------------";
		String menu = "1.입력  2.보기  3.수정  4.삭제  0.종료 >";
		String viewT = "학번\t|국어\t|영어\t|수학\t|총점\t|평균";
		String[] msg = {"국어","영어","수학"};
		
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
				
				////////// 0. 종료 ////////////
				if(input==0){
					System.out.println("종료됩니다.");
					break;
				}
				////////// 1. 입력 ////////////
				if(input==1){
					cnt++;
					for(int i=0; i<msg.length; i++){
					System.out.print(cnt+"번학생"+msg[i]+">>");
					int su = System.in.read(buf);
					os.write(buf,0,su);
					os.flush();			//buf 비우는거
					

					if(i==3){
						System.out.println("작성완료");
						
					}
				}
				
					
				////////// 2. 보기 ////////////
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
