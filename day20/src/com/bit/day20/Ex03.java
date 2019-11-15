package com.bit.day20;

import java.io.IOException;
import java.io.InputStream;

public class Ex03 {

	public static void main(String[] args) {
		InputStream inn = System.in;

		int su =-1;
		try {
			while(true){
				su=inn.read();
				if(su==-1){break;}
				System.out.println(su);		//콘솔에 a 입력시 97 13 10 이 출력되는데 97=a 13=\r 10=\n 이다
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
