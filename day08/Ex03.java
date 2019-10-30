package com.bit;

class Ex03 extends java.lang.Object{		//extends java.lang.Object생략되어있는거임
						//기본적으로 Object에 상속받고있다
  public static void main(String[] args){
/*	Ex03 me = new Ex03();
	System.out.println(me);
	System.out.println(me.toString());
	System.out.println(me.hashCode());

	Object obj = new Object();
	System.out.println(obj.toString());
*/

	Ex03 me = new Ex03();
	Ex03 you = me;	//new Ex03();	//	System.out.println(me==you); 출력값 true
//	Ex03 you = new Ex03();		//	System.out.println(me==you); 출력값 false	//2

	java.util.Scanner sc;
	sc = new java.util.Scanner(System.in);
	String msg1=sc.nextLine();

	int a=100;
	int b=55+45;
	
	System.out.println(msg1=="java");	//결과값 false / ln17의 2번과 같은이유로
	System.out.println(msg1.equals("java"));//문자열 글자그대로 비교할땐 (비교대상값.equals("문자열"));
	
	
  }	


}