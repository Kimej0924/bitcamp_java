package com.bit.day10;

public class Ex01 {

	public static void func1(Object a){}
	
	public static void main(String[] args) {
		// 래퍼클래스(기본자료형의 객체 타입)
		// 기본자료형을 객체로 싸는거
		int a=100;
		java.lang.Integer su1;
		su1=new Integer(100);
		Integer su2=new Integer("200");		//오토래핑 //박싱
		Integer su3=100;		//언래핑	//언박싱
		
		int b = su1+1;
		func1(10);
		System.out.println(su1+su2);

		System.out.println(Integer.MAX_VALUE);	//다 대문자   상수형변수(final) > 수정이 불가능 
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		Integer su4 = new Integer("100");
		byte by1=su4.byteValue();
		System.out.println(su4+":"+by1);
		
		System.out.println(su1==su4);	//래퍼런스비교
		System.out.println(su1.equals(su4));	//value값 비교
		String msg="1234";
		Integer su5=Integer.valueOf(msg);	//msg값이 숫자로만 이루어져있어야함
		System.out.println(su5);
		System.out.println(su5.intValue());
		
		int su6=Integer.max(2,3);
		System.out.println(su6);
		
		int su7=Integer.parseInt(msg);		//문자열을 숫자로 변환하는거
		int su8=Integer.valueOf(msg);
		int su9=Integer.reverse(1);
		System.out.println(su9);
		int su10=7;
		System.out.println(su10+"의 2진수:"+Integer.toBinaryString(su10));
		System.out.println(su10+"의 8진수:"+Integer.toOctalString(su10));
		System.out.println(su10+"의 16진수:"+Integer.toHexString(su10));
		
		int su11=Integer.compare(28, 28);	//앞에께 크면 1, 뒤에께크면 -1, 같으면 0 출력
		int su12=su4.compareTo(100);		//su4가 크면 1, 괄호안의 수가 크면 -1, 같으면 0
		System.out.println(su12);
	}

}
