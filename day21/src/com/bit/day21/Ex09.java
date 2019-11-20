package com.bit.day21;

public class Ex09 extends Thread{

	public Ex09(String name){
		super(name);
	}
	
	public static void main(String[] args) {
		System.out.println("메인시작");
		Ex09 me = new Ex09("1번째");
		Ex09 you = new Ex09("2번째");
		me.start();
		you.start();
		
		try {
			me.join();		//main을 대상으로 me가 대기하는거
//			you.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인종료");
	}
	
	@Override
	public void run() {
		String name = getName();
		System.out.println(name+"시작");
		for(int i=10; i>=0; i--){
			System.out.println(name+":"+i);
			try {
				Thread.sleep(1000);		//교차로 실행하는것을 보장받을수 있어 (최소의 시간만줘도 가능)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name+"종료");
		
	}

}
