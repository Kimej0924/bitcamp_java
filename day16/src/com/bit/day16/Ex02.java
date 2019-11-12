package com.bit.day16;

public class Ex02 {

	public static void main(String[] args) {
		String msg="javaweb";
		char[] chs=msg.toCharArray();
		String msg2=new String(chs);
		StringBuilder build1=new StringBuilder("문자열"); //값이 있을때는 값 + 16으로 초기capa->19
		StringBuffer buf1=new StringBuffer(build1);	//	5까지 가고 6이되는순간 6의 두배로 capa 증가/ 증가량 설정은 안되
		System.out.println(buf1);
		System.out.println("-----------------------");
		for(int i=0; i<17; i++){
			buf1.append('a');
//			buf1.trimToSize();	
			System.out.print(buf1.length()+":");
			System.out.println(buf1.capacity());		//초기 capa = 16, 다차면 자기 자신의 2배로 사이즈 늘려간다
		}
		

	}

}
