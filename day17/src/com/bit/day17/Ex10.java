package com.bit.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex10 {

	public static void main(String[] args) {
		File img;
		img = new File("imgs\\cat1.jpg");
		System.out.println(img.exists());
		System.out.println(img.length());
		
		File copy;
		copy = new File("copy\\copyCat1.jpg");		//jpg, mp4 등 다 복사가능하다
		InputStream is;
		OutputStream os;
//		System.out.println(copy.exists());
		if(!copy.exists()){
			try {
				copy.createNewFile();
				is=new FileInputStream(img);
				os=new FileOutputStream(copy);
				for(int i=0; i<img.length();i++){
					os.write(is.read());
					
				}
				os.close();
				is.close();
				System.out.println("복사완료");
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
