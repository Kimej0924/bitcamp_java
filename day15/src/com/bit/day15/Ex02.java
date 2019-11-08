package com.bit.day15;

class Ball{
	String color="하늘색";
	
	public void play(){
		System.out.println("구루미");
	}
	
	public void publicfunc01(){
		System.out.println("공통기능1");
	}
	public void publicfunc02(){
		System.out.println("공통기능2");
	}
}

class BaseBall extends Ball{
	String color="분홍색";
	
	public void play(){
		System.out.println("던져 던져~");
	}
	
}

class Bowling extends Ball{
	public void play(){
		System.out.println("핀을향해");
		super.play();
	}
}

class Box<T>{			//아무것도 안주면 Object적용됨		/ T:type  V:value  E:element
	T ball;
	
	
	public void set(T ball){	
		this.ball=ball;
	}
	
	public T get(){
		return this.ball;
	}
	
}


public class Ex02 {


	public static void main(String[] args) {
		BaseBall ball1 = new BaseBall();
		Bowling ball3 = new Bowling();
		
//		Box box = new Box();
//		box.set(ball1);
//		
//		BaseBall ball2=(BaseBall)box.get();		
//		ball2.play();
		
		Box<Ball> box = new Box<Ball>();	//박스를 만드는 객체생성시점에 어떤목적으로 사용할것인지 정하는게 제네릭
		box.set(ball1);								//박스안에는 야구공이 들어있다	
		box.set(ball3);								//박스안에는 볼링공이 들어있다	
		Ball ball2=box.get();
		ball2.play();								//맨 하위뽈이 적용됨
	
		
		
		
		System.out.println("----------------");
//		Box<Bowling> box = new Box<Bowling>();	//박스를 만드는 객체생성시점에 어떤목적으로 사용할것인지 정하는게 제네릭
//		box.set(ball3);								//박스안에는 볼링공만 들어있다	야구공을 넣으면 오류
//		
//		Bowling ball2=box.get();
//		ball2.play();

	}

}
