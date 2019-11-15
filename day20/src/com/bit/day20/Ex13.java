package com.bit.day20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex13 {

	public static void main(String[] args) {
		String path="test05.txt";
		
		File file = new File(path);
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br =null;
		try {
			is = new FileInputStream(file);
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			while(true){
				String msg = br.readLine();
				if(msg==null)break;
				System.out.println(msg);
			}
			
//			while(true){
//				int su = isr.read();
//				if(su==-1)break;
//				System.out.print((char)su);
//			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			
			try {
				if(isr!=null)isr.close();
				if(is!=null)is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
