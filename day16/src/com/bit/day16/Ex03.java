package com.bit.day16;

public class Ex03 {

	public static void main(String[] args) {
		StringBuilder msg1=new StringBuilder("builder");
		StringBuilder msg2=new StringBuilder(" string");
		// +
		System.out.println(msg1.append(msg2));
		System.out.println(msg1);
		System.out.println(msg1.delete(8,11));	//지울자리 start값,end값
		System.out.println(msg1.reverse());	//통째로 뒤집뒤집

	}

}
