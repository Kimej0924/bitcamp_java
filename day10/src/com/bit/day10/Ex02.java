package com.bit.day10;

public class Ex02 {

	public static void main(String[] args) {
		// Long
		java.lang.Long su1;
		java.lang.Long su2;		
		su1 = new Long(10);	//"10"가능 "10L" 불가능	//숫자가 아닌 문자가 들어가면오류
		su2 = new Long("10");	//문자 10을 Long타입으로 바꿔주는거	
		
		System.out.println(su1);
		System.out.println(su2);
	}

}
