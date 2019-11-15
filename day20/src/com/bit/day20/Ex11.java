package com.bit.day20;
// 문자열스트림
// Reader -> 기본이 2byte체계
// 오직 문자열만을 처리하기 위해서 존재한다	
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex11 {
	
	public static void main(String[] args) {
		String path = "test04.txt";
		File file = new File(path);
		
		Reader fr = null;	
		BufferedReader br =null;
		
		char[] cbuf=new char[5];
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while(true){
				String temp = br.readLine();		//readLine() 한줄씩 읽어옴
				if(temp==null){break;}
				System.out.println(temp);
			}

//			while(true){
//				int su = fr.read(cbuf);
//				if(su==-1){break;}
////				char ch = (char) su;
//				System.out.print(new String(cbuf,0,su));
//			}
		
//			System.out.println(fr.read());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fr!=null)fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
