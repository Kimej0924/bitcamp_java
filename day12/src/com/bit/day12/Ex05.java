package com.bit.day12;

//public class Ex05 extends Machine {			//다중상속이 안되 extends Machine, Cl01 (불가)

//인터페이스
interface Inter01{		//오직 추상메서드만을 가짐 ->상속을 통해서만 의미가 있다
	//상수형 스테틱 변수
	public static final int num1 = 1111;
	public final int num2 = 2222;
	public int num3 = 3333;
	int num4 = 4444;
	
	public abstract void func01();
	public void func02();		//abstract 가 없어도 이건 추상메서드야 (abstract)생략된거
	void func03();				//public 이 없어도 생략된거임
}
public class Ex05 implements Inter01{
	
	public static void main(String[] args) {
		Inter01 me = new Ex05();
		me.func01();
		System.out.println(Inter01.num1);
		System.out.println(Inter01.num2);
//		Inter01.num3++;		//생략된 final이 있다 -> 오류
		System.out.println(Inter01.num3);
		

	}
	
	public void func01(){
		System.out.println("Ex05에서 구현한 func01...");
	}
	
	public void func02(){

	}
	
	public void func03(){

	}

}
