package com.bit.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex16 {

	public static void main(String[] args) {
		//
		String path="test06.txt";
		File file = new File(path);
		
		RandomAccessFile raf = null;
		byte[] buf = new byte[32];
		try {
			raf = new RandomAccessFile(file, "rw");	//rw,
			raf.write("abcd".getBytes());
//			raf.seek(0);
			raf.write("1234".getBytes());
//			raf.seek(0);
			raf.write("!@#$".getBytes());
			raf.seek(0);
			while(true){
				int su = raf.read(buf);
				if(su==-1){break;}
				System.out.write(buf,0,su);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(raf!=null)raf.close();
			} catch (IOException e) {
				e.printStackTrace();
				
			}	

		}

			
	}

}
