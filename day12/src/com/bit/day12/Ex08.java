package com.bit.day12;

abstract class Cl08 extends Object{
	static int su1=1111;
	int su2=2222;
	
	public Cl08(){
		super();
		System.out.println("creat Cl08 object...");
	}
	public static void func01(){
		System.out.println("func01...");
	}
	public abstract void func02();		//추상클래스 끝에는 ;붙어야함
}

public class Ex08 extends Cl08{

	public Ex08(){
		super();
		System.out.println("create Ex08 object...");
	}
	public static void main(String[] args) {
		System.out.println(Cl08.su1);
		Cl08.func01();
		Cl08 me = new Ex08();
		me.func02();

	}

	public void func02() {
		System.out.println("f2...");
		
	}

}
