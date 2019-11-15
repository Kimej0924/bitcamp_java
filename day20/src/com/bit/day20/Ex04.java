package com.bit.day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		File file = new File("test01.txt");
		InputStream is = null;
		
		try {
			is = new FileInputStream(file);
			Scanner sc = new Scanner(is);	//()안에는 io가 들어가야한다
			System.out.println(sc.nextLine());		//next 는 최소 띄어쓰기 단위로 끊어 읽어들인다
			System.out.println(sc.nextLine());		//nextLine은 줄단위로 끊어 읽어들인다 
			System.out.println(sc.nextLine());	
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally{
			try {
				if(is!=null){is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
