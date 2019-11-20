package com.bit.day21;

public class Ex08 extends Thread{

	public static void main(String[] args) {
		Ex08 me = new Ex08();
		me.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.interrupt();
//		me.stop();
	}
	@Override
	public void run() {
		Thread thr = Thread.currentThread();
		String name = thr.getName();
		System.out.println(name+"실행");
		try {
			Thread.sleep(5000);		//시간의 단위는 1/1000초  -> 5000이 5초
		} catch (InterruptedException e) {
//			e.printStackTrace();
		}
		System.out.println(name+"종료");

	}

}
