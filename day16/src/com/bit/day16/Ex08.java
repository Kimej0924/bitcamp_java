package com.bit.day16;

public class Ex08 {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("java");
		StringBuilder sb2=sb1;	//¾èÀºº¹»ç
		StringBuilder sb3=new StringBuilder(sb1);
		
		sb1.append("add");
		
		System.out.println(sb2);
		System.out.println(sb3);
	}

}
