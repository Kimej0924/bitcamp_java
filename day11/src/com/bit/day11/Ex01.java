package com.bit.day11;

class Lec01{
	int su1=1234;		//접근제한자 public 어디서든지 접근해서 사용할수 있는거
//	private int su1=1234;		// 
	static int su2=4321;		//
	
	private Lec01() {
		
	}

	static Lec01 me = new Lec01();
	static Lec01 newInstance(){
		return me;
	}
	
//	static Lec01
//	static Lec01 newInstance(){
//		Lec01 me=new Lec01();
//		return me;
//	}
	
	public void func01(){
		System.out.println("func01..."+su1);
	}
	
	public static void func02(){
		System.out.println("func02..."+su2);	
	}
	
	
}


public class Ex01 extends com.bit.sec.Lec03{
	// 접근제한자
	// 클래스 (다른 패키지상의 class는 public이 아니면 사용할 수 없다)
	// 클래스의 접근제한자는 public, default 이렇게 두개 (private 사용하면 클래스 자체를 쓸수 없다)
	// 생성자(public, default, private)
	// 필드부분과 메소드는 그 위치가 동일하게 붙는다
//---- public >protected=default > private	----//
	// public(어디서나 접근허용) 
	// protected(default와 동일하나 상속을 통한 접근은 허용)
	// private(클래스 내부에서만 접근허용)	private 가 적혀있는 클래스에서만 그 변수를 사용가능하다
	// 없는거 default 접근제한자  - 동일 패키지 내에서만 돌아감
	public static void main(String[] args) {
		// 클래스
//		System.out.println(com.bit.sec.Lec03.su2);		

//		com.bit.sec.Lec03.func02();
//		com.bit.sec.Lec03 lec01 = new com.bit.sec.Lec03();
//		System.out.println(lec01.su1);
//		lec01.func01();
		
//		Lec01 ex01=new Lec01();
//		Lec01 ex02=new Lec01();		
		
//		Lec01 ex01=Lec01.newInstance();
//		Lec01 ex02=Lec01.newInstance();		
//		System.out.println(ex01==ex02);
	
		Ex01 me =  new Ex01();
		System.out.println(me.su1);
		me.func01();
		
		
	}

}
