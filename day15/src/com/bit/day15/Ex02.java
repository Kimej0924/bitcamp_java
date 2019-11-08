package com.bit.day15;

class Ball{
	String color="�ϴû�";
	
	public void play(){
		System.out.println("�����");
	}
	
	public void publicfunc01(){
		System.out.println("������1");
	}
	public void publicfunc02(){
		System.out.println("������2");
	}
}

class BaseBall extends Ball{
	String color="��ȫ��";
	
	public void play(){
		System.out.println("���� ����~");
	}
	
}

class Bowling extends Ball{
	public void play(){
		System.out.println("��������");
		super.play();
	}
}

class Box<T>{			//�ƹ��͵� ���ָ� Object�����		/ T:type  V:value  E:element
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
		
		Box<Ball> box = new Box<Ball>();	//�ڽ��� ����� ��ü���������� ��������� ����Ұ����� ���ϴ°� ���׸�
		box.set(ball1);								//�ڽ��ȿ��� �߱����� ����ִ�	
		box.set(ball3);								//�ڽ��ȿ��� �������� ����ִ�	
		Ball ball2=box.get();
		ball2.play();								//�� �������� �����
	
		
		
		
		System.out.println("----------------");
//		Box<Bowling> box = new Box<Bowling>();	//�ڽ��� ����� ��ü���������� ��������� ����Ұ����� ���ϴ°� ���׸�
//		box.set(ball3);								//�ڽ��ȿ��� �������� ����ִ�	�߱����� ������ ����
//		
//		Bowling ball2=box.get();
//		ball2.play();

	}

}
