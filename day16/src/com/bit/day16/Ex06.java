package com.bit.day16;

public class Ex06 {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("java");
		StringBuilder sb2=new StringBuilder("java");
		StringBuilder sb3=new StringBuilder("java");
		StringBuilder sb4=new StringBuilder("java");
		StringBuilder sb5=new StringBuilder("java");
		char[] chs={'A','B','C','D','E','F','G'};
		String st2="ABCDEFG";
		sb1.append(chs,2,4);		//chs의 인덱스번호(0,1,)2부터 CDEF 4개 복사
		System.out.println(sb1);
		sb2.append(st2,2,6);		//  (st2,인덱스번호시작,st2길이6까지)	CDEF 4개복사
		System.out.println(sb2);
		sb3.getChars(1, 3, chs, 2);	// sb3의 인덱스번호 1부터 3미만까지를 chs인덱스번호 2번부터 바꿈
		for(int i=0; i<chs.length; i++){
			System.out.println(chs[i]);
		}
		
		sb4.insert(2, "ADD");	//(끼워들어갈 위치, 넣을꺼)숫자,문자,문자열,불린,다됨
		System.out.println(sb4);
		sb5.replace(1,3,"AV");
		System.out.println(sb5);
	}

}
