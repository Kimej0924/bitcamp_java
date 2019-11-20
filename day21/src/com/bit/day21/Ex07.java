package com.bit.day21;

public class Ex07 implements Runnable{

	public static void main(String[] args) {
		// 스레드제어 - 우선순위
		Ex07 me = new Ex07();
		Thread thr1 = new Thread(me, "첫번쨰");
		Thread thr2 = new Thread(me, "두번쨰");
		Thread thr3 = new Thread(me, "세번쨰");
		
//		thr1.setPriority(1);	//우선순위를 낮춤
//		thr2.setPriority(5);	//default 5
//		thr3.setPriority(10);	//우선순위를 높여줌 - 먼저 실행해서 먼저 끝날 확률을 높여줌
		thr1.setPriority(Thread.MIN_PRIORITY);
		thr2.setPriority(Thread.NORM_PRIORITY);
		thr3.setPriority(Thread.MAX_PRIORITY);
		thr1.start();
		thr2.start();
		thr3.start();
		
	}

	@Override
	public void run() {
		Thread thr = Thread.currentThread();
		String name = thr.getName();
		System.out.println(name + "시작"+thr.getPriority()/*순위*/);
		for(int i=0; i<50; i++){
			System.out.println(name+i);
		}
		System.out.println(name+"종료");
	}
}
