package com.bit.day21;
// ������ / ���?
// 1.������ Ŭ������ ��ӹ޴°�
public class Ex02 extends Thread{

	public static void main(String[] args) {
		//������
		Ex02 thr1 = new Ex02();
		thr1.start();
		
		
		for(int i=0; i<500; i++){
			System.out.println("����1");
		}
		System.out.println("���ν����� ����");
	
	}

	@Override
	public void run() {
		for(int i=0; i<500; i++){
			System.out.println("����2");
		}
		System.out.println("������ ����");

	}
}
