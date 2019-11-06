package com.bit.day12;

class Cl01{		//부모클래스
	int num1=1234;
	
	public Cl01(){
		
	}
	
	public void func01(){
		System.out.println("부모클래스의 func01...");
	}
	
	public final void func02(){
		System.out.println("부모클래스의 final func02...");
	}
	
}

class Cl101 extends Cl01{		//부모클래스를 상속받은 자식클래스
	int num1=1111;
	int num2=2222;
	
	//오버라이드(접근제한자는 부모클래스와 같거나 보다 더 열린걸로 사용가능)
	public void func01(){
		System.out.println("자식클래스의 func01...");
	}
	
	public void func03(){
		System.out.println("자식클래스의 func03...");
	}
	
	
}


public class Ex01 {

	public static void main(String[] args) {
		// 상속
		System.out.println("parent obj>---------------------");
		Cl01 parent = new Cl01();
		System.out.println(parent.num1);
		parent.func01();
		parent.func02();
		System.out.println("child obj>---------------------");	
		Cl101 child = new Cl101();		//부모클래스를 상속받은 자식클래스의 객체생성
		System.out.println(child.num2);
		child.func03();
		System.out.println(child.num1);
		child.func01();
		child.func02();
		System.out.println("parent type>---------------------");
		//다형성
//		Cl101 cl2 = new Cl01(); 				
		Cl01 cl1 = new Cl101();
		cl1.func01();		//부모타입의 자식객체
		cl1.func02();
//		cl1.func03();	//타입이 부모라 부모타입에서 정의된것만 사용가능 -> 실행은 자식으로
		System.out.println(cl1.num1);		//메소드는 오버라이드지만 필드의 오버라이드는 아니라서 부모의num1값 나옴
//		System.out.println(cl1.num2);		//부모타입에는 num2가 없어서 실행불가
		
		System.out.println("child type>---------------------");		
		Cl101 cl2 = (Cl101)cl1;		//캐스팅
		System.out.println(cl2.num1);
		System.out.println(cl2.num2);
		cl2.func01();
		cl2.func02();
		cl2.func03();
		
		

		
		
	}

}
