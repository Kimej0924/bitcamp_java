package com.bit.day13;

public class Ex08 {
	
	class Inner08 {
		int su1 = 1111;
//		static int su2=2222;		static 못가짐
		static final int su3=2222;
		public Inner08(){
			
		}
		
//		public static void func02(){}		static 못가짐
		
		public void func01(){
			System.out.println("Inner08 finc01()...");
		}
	}

	public void func(){
		Inner08 inn = new Inner08();
		System.out.println(inn.su1);
		inn.func01();

	}
	
	public static void main(String[] args) {
		//멤버클래스
//			에 있는애는 스테틱을 가질수가없다
		Ex08 me = new Ex08();
//		me.func();
		Inner08 inn = null;
		inn=me.new Inner08();
//		System.out.println(inn.su1);
		inn.func01();
	}

}
