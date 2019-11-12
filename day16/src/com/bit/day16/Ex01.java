package com.bit.day16;

public class Ex01 {

	public static void main(String[] args) {
		//StirngBuffer  StirngBuilder  둘중 하나 
		//문자열을 다루는 클래스
		//제어하는 순간 새로운 객체를 찍어내는게 아니라 자기자신이(하나의 객체) 바뀌는거 - 자원소모줄어듬 
		//기존값 유지는 어려워요
		
		String msg0="java"+"web";
		String msg1="java".concat("web");

		
		StringBuffer msg2=new StringBuffer("BUFFER");	//무조건 생성자를 통해서 할수 있어
//		StringBuffer msg3="buffer class";		//StringBuffer msg3=new String("buffer class"); 이건안되
		
		StringBuffer msg3=new StringBuffer(" class");
		StringBuffer msg4=new StringBuffer("의 +");
		
		System.out.println(msg0=="javaweb");
		System.out.println(msg0==msg1);
		
		System.out.println("---------------------");
//		System.out.println(msg2+msg3);		//+로 더하는건 String클래스에서만 가능
		System.out.println(msg2.append(msg3).append(msg4));
		
		System.out.println("---------------------");
		System.out.println(msg2);	//StringBuffer는 append 후 값으로 자기자신이 바뀐다
		
		

	}

}
