package com.bit.day09;

public class Ex01 {
	//"abcd" -> Ox0101
	public static void main(String[] args) {
		// 문자열 (String)
		String msg1;
		msg1="abcd"; //쌍따옴표
		
		String msg2;
		msg2=new String("abcd"); // ""
		
		String msg3="abcd";
		String msg4="ab"+"cd";			// +는 더해서 기존의 같은 객체에 담아내게 하는거(자원소모막으려고)
		String msg5="ab".concat("cd");	// .concat 은 더하기기능 //ab 와 cd를 메소드를 통해서 더했을때는 뭐가나올지 몰라
										// 그래서 새로운 객체를 만들어서 값을 담아내는거 -> 주소가 달라져
		System.out.println(msg1==msg2);
		System.out.println(msg1.equals(msg2));	//.equals는 값(Ox0101)을 비교하는거		
		
		System.out.println(msg1==msg3);
		System.out.println(msg1.equals(msg3));	
		
		System.out.println("abcd"==msg1);
		System.out.println("abcd"==msg2);
		System.out.println("abcd"==msg3);
		System.out.println("abcd"==msg4);	
		System.out.println("abcd"==msg5);

	}

}
