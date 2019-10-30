package com.bit;

class Ex01{
  static int b=1234;
  int a=100; 

  public static void main(String[] args){

	Ex01 me=new Ex01();
	//me.a++;
	me.plus(50,me);
	System.out.println("a="+me.a);


  }

  public void plus(){
 
	this.a++;	//this 생략가능 but 명세하므로써 원하는데로 접근가능해짐

  }

  public void plus(int a){

	this.a+=a;		//객체가가지고있는필드의100+=지역변수 a
			//this 생략가능 but 명세하므로써 원하는데로 접근가능해짐
  }

  public void plus(int a, Ex01 me){
	System.out.println(this==me);
	me.a+=a;		//객체가가지고있는필드의100+=지역변수 a
			//this 생략가능 but 명세하므로써 원하는데로 접근가능해짐
  }







}