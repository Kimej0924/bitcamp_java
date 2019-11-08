package com.bit.day15;

public class Ex05 {

	public static void main(String[] args) {
//		Box<BaseBall> box = new Box<>();	//제네릭을 생략한거
//		Box<BaseBall> box = new Box();		//제네릭을 안쓴거
//		Box<BaseBall> box;
//		box = new Box<>();		//상위 꺼 풀어적은거
	
		Box<BaseBall> box;		
		box = new Box<BaseBall>();
		box.set(new BaseBall());
		box.get().play();
		
	}

}
