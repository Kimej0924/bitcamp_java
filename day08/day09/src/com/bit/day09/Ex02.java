package com.bit.day09;

public class Ex02 {

	public static void main(String[] args) {
		// 문자열의 제어
		
//		abcd
//		가나다라
//		1234
//		!@#$
		String msg="abcd\\가나다라\n1234\n!@#$";  //상위 문자 표시할때 실제적으로 갖는 데이터값
		System.out.println(msg);
		
		String msg2="";		//msg2는 참조변수
		int cnt=msg2.length();
		System.out.println(msg2+"의 글자수는 "+cnt);
		boolean empty=false;
		if(cnt==0){empty=true;}
		System.out.println("글자가 비었는가? "+empty);
		empty=msg2.isEmpty();
		System.out.println("글자가 비었는가? "+empty);

		for(int i=0; i<msg.length(); i++){
			char ch=msg.charAt(i);			// 문자열의 원하는 자리의 문자만 뽑아내는거
			System.out.print(ch);
		}		
			
//		System.out.println(msg.charAt(1));
//		System.out.println(msg.charAt(4));	// \n 자리
//		System.out.println(msg.charAt(5));

		System.out.println("\n--------------");
		String msg3="921019";
		char[] arr3=msg3.toCharArray();		//문자열을 문자로 쪼개는거(string->char)
		for(int i=0; i<arr3.length; i++){
			System.out.println(arr3[i]);
		}
	
		String msg4;
		msg4 = new String(arr3);
		System.out.println(msg4);
		System.out.println("--------------");
		
		
		int change = Integer.parseInt(msg4);		//string 숫자를 int 숫자로 변환
		
		System.out.println(change+"1="+(change+1));
		System.out.println("============");

		byte[] arr4=msg3.getBytes();
		for(int i=0; i<arr4.length; i++){
			System.out.println(arr4[i]);
		}
		
		for(int i=0; i<arr3.length; i++){
			System.out.println((int)arr3[i]);		//한,글 에 대한 숫자표현을 확인
		}
		
		String msg5=new String(arr4);	//문자를 문자열로 조합해서 
		
			System.out.println(msg5);
			

	}

}
