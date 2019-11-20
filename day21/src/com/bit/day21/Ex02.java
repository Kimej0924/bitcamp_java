package com.bit.day21;
// 스레드 / 사용?
// 1.스레드 클래스를 상속받는거
public class Ex02 extends Thread{

	public static void main(String[] args) {
		//스레드
		Ex02 thr1 = new Ex02();
		thr1.start();
		
		
		for(int i=0; i<500; i++){
			System.out.println("실행1");
		}
		System.out.println("메인스레드 종료");
	
	}

	@Override
	public void run() {
		for(int i=0; i<500; i++){
			System.out.println("실행2");
		}
		System.out.println("스레드 종료");

	}
}
