package com.bit.day20;

public class Car implements java.io.Serializable{
	private static final long serialVersionUID = 123456L;

	public int speed;
	transient public String color;		//transient ����ó��(�о���϶� �ɷ� ->null�� ��µ�)
	
	public Car(){
		speed=100;
		color="red";
	}
	
	public void func(){			//func()�� transient ó�� �Ұ��ϴ�
		System.out.println("�޸���");
	}
}
		