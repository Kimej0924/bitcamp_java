package com.bit.day10;

public class Ex03 {

	public static void main(String[] args) {
		// Double
		Double su1;
		Double su2;
		
		su1=new Double(3.14);
		su2=new Double("3");
		System.out.println(su1);
		System.out.println(su2);
		
		Double su3 = 2.0/0;
		Double su4 = 0.0/0.0;
		
		System.out.println(su3);
		System.out.println(su4);
		
		System.out.println(su3.isInfinite());
		System.out.println(su3.isNaN());	
		System.out.println(su4.isInfinite());
		System.out.println(su4.isNaN());	
	}

}
