package com.bit.day20;

public class Car implements java.io.Serializable{
	private static final long serialVersionUID = 123456L;

	public int speed;
	transient public String color;		//transient 예외처리(읽어들일때 걸러 ->null로 출력됨)
	
	public Car(){
		speed=100;
		color="red";
	}
	
	public void func(){			//func()은 transient 처리 불가하다
		System.out.println("달린다");
	}
}
		