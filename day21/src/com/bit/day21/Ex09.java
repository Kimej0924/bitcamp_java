package com.bit.day21;

public class Ex09 extends Thread{

	public Ex09(String name){
		super(name);
	}
	
	public static void main(String[] args) {
		System.out.println("���ν���");
		Ex09 me = new Ex09("1��°");
		Ex09 you = new Ex09("2��°");
		me.start();
		you.start();
		
		try {
			me.join();		//main�� ������� me�� ����ϴ°�
//			you.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("��������");
	}
	
	@Override
	public void run() {
		String name = getName();
		System.out.println(name+"����");
		for(int i=10; i>=0; i--){
			System.out.println(name+":"+i);
			try {
				Thread.sleep(1000);		//������ �����ϴ°��� ��������� �־� (�ּ��� �ð����൵ ����)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name+"����");
		
	}

}
