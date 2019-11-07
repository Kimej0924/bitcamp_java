package com.bit.day14;

public class Ex12 {

	public static void main(String[] args) {
		// 로또번호생성기(ver 0.1.0)
		
		//java.util.List list = null;
		int[] arr = new int[45];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = i+1;
			System.out.println(arr[i]);
		}
		int[] temp= new int[0]; 
		for(int i=0; i<99999; i++){
			int ran = (int)(Math.random()*45);
		
			temp = arr[i];
			arr[i] = arr[ran];
			arr[ran] = temp;
		}
		System.out.println(arr[i]);
	}

}
