package com.bit;

class Ex07{
  final int num;

  // 클래스의 구성요소
  // 1. 메서드
  // 2. 필드
  // 3. 생성자
  //	- 클래스명(){} 
  //	- 클래스명([참조변수]){} 
  //	- 클래스명([참조변수],[참조변수]){} 
  // 	- 존재x일때, 자동 default create
  //	- 존재o일때, default x
  //	- 하나의 객체에서 생성자의 호출은 한번만 이루어짐
  //	- 객체생성 시 하고싶은 일들을 명세(필드의 초기화)

  public Ex07(){
	num=1111;

  }

  public static void main(String[] args){

	//final int a = 1111;		//값을 바꾸지 못하는 변수 지정 final <-상수형 변수
	//a++;				//수행시 a++에서 오류떨어짐
	//System.out.println("a="+a);


	Ex07 me = new Ex07();
	System.out.println(me.num);
	/*S	
	me.func(4321);
	System.out.println(me.num);
	*/

  }// main end


  public void func(int a){

	num=a;

  }// func end



}// class end