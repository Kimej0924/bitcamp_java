package com.bit;


class Ex55{		// final class 지점하면 상속받을때 안되 - 보안상의 문제같은거 할때
	final int su=1234;	// class 출력하게되면 내용다볼수있게되니까 
	public void func(){
		System.out.println("부모클래스의 기능");
	}

}


final class Ex05 extends Ex55{
  int su=4321;

  public final void func2(){func();}		//메소드에 final 붙었을때????/?//?//?

  public void func(){
	System.out.println("자식클래스의 기능...");
	System.out.println("su="+super.su);
	super.func();
  }


  public static void main(String[] args){

	Ex05 me = new Ex05();
	me.func();
	System.out.println(me.su);

	final int a;	//final - 상수형변수 변하지않는값
	a = 1234;
	
	System.out.println("a="+a);
	
  }

}