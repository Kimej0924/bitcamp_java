package com.bit.day21;

public class Ex06 implements Runnable{

	public static void main(String[] args) {
		Ex06 work = new Ex06();
		Thread thr1 = new Thread(work,"1��");
		Thread thr2 = new Thread(work,"2��");
		
		thr1.start();
		thr2.start();
		
	}
	
	@Override
	public void run() {
		Thread thr = Thread.currentThread();
		String name = null;
		name=thr.getName();
		System.out.println(name + "���������");
		for(int i=0; i<10; i++){
			System.out.println(name+"i");
		}
		System.out.println(name + "����������");
	}

}
