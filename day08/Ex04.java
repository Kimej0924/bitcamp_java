package com.bit;

class Ex04{ 

  public static void main(String[] args){

/*	Kia my = new Kia();
	my.show2(); 
	my.show(); 
	my.speedUp();
	my.show2(); 
	my.show(); 
	my.speedUp();
	my.show2(); 
	my.show(); 
	my.speedDown();
	my.show2(); 
	my.show(); 
	my.speedDown();
	my.show2(); 
	my.show(); 
*/
	Kia my = new Kia();
	//Car1 my = new Car1();
	my.show();	
	my.speedUp();
	my.show();
	my.speedUp();
	my.show();
	my.speedDown();
	my.show();
	my.speedDown();
	my.show();



  }


}


class Kia extends Car1{			//kia가 car1상속받을때 extends Car1
	String company = "기아";
	int durability = 0;	//내구성

	public Kia(){
		this("기아");
		System.out.println("0.Kia 객체 생성...");	
	}

	public Kia(String company){
		super("중고차");
		this.company=company;
		System.out.println("1.Kia 객체 생성...");
	}


	//메서드 오버라이드 : 상속받은 부모의 기능을 재정의해서 사용하는것 /대상은 non-static method
	public void show(){
		System.out.println("내구성 "+durability+"인 "+company+" 회사의 "+model+"가(이)"+speed+"km로 달린다");
	}	


}

class Car1{

	int speed;
	String model;

/*	public Car1(){
		this("승용차");

	}
*/

	public Car1(String model){	//객체생성
		System.out.println("Car 객체 생성...");		
		speed=0;
		this.model=model;
	

	}

	public void show(){
		System.out.println(model+"가(이)"+speed+"km로 달린다");
	}	

	public void speedUp(){
		speed+=10;
	}

	public void speedDown(){
		speed-=10;
	}

}