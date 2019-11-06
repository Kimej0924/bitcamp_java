package com.bit.day12;

public class Ex06 implements Inter02,Inter03 {		//class 의 interface 상속은 키워드 implements
											//class 에서의 interface 상속은 다중상속을 허용
	public static void main(String[] args) {
		Inter02 me = new Ex06();
		me.func01();
	}

	public void func01() {
		System.out.println("구현");
		
	}

	public void func02() {
		// TODO Auto-generated method stub
		
	}

}
