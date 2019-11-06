package com.bit.day12;

//추상클래스(추상메서드를 0개이상 갖는 클래스)	//키워드 abstract
abstract class Cl03{
	int su1=1234;
	
	public static void func01(){
		System.out.println("Cl03 static func01()...");
	}
	
	public void func02(){
		System.out.println("Cl03 non-static func02()...");
	}
	
	//추상메서드(선언 o, 구현 x )
	public abstract void func03();	//추상메서드
	public void func04(){}	//구현된거 (추상메서드 x)
	
}

class Cl33 extends Cl03{		
	// 추상클래스의 상속은 나도 추상클래스가 되거나
	// 추상 메서드를 오버라이드 해야 함 (강제성 부여)
	public void func03(){
		
	}
	
}



public class Ex03 {

	public static void main(String[] args) {
		java.lang.Number num;
//		num = new Number(1111);		//객체생성이 불가능한 클래스(추상클래스)
		//다형성 수반해야함-상속받아서 생성해야함
//		Cl03 cl03 = new Cl03();		//추상 클래스는 객체생성이 불가능하다
		Cl33 cl33 = new Cl33();
	}

}
