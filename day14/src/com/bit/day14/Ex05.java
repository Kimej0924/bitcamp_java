package com.bit.day14;

public class Ex05 {

	public static void main(String[] args) {
		java.util.List list = null;
		list = new java.util.ArrayList();
//		list = new java.util.LinkedList();
		
		long start = System.currentTimeMillis();
		for(int i=0; i<999999; i++){		//객체수가 많아질수록 ArrayList가 처리속도가 더 빨라짐
			list.add(i);					//객체수가 적을때는 LinkedList 가 더빠름
			
		}
		long end = System.currentTimeMillis();
		System.out.println("입력끝:"+(end-start));
	}

}
