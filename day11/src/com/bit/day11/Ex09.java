package com.bit.day11;

public class Ex09 {

	public static void main(String[] args) {
		int su;
		su=1111;
		try{
			su=2/0;
		}catch(java.lang.ArithmeticException e){
			su=0;
		}
		System.out.println(su);
		System.out.println("³¡");

	}

}
