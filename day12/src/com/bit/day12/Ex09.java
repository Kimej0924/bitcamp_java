package com.bit.day12;

public class Ex09 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		try{
			show(arr);
		}catch(ArrayIndexOutOfBoundsException e){		//일치하는 exception으로 던져야 잡힌다 아니면 err
			System.out.println("에러회피");
		}
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);			//err 발생 하위로진행 하면err 안발생?
		
	}

	public static void show(int[] arr) throws ArrayIndexOutOfBoundsException{
		for(int i=0; i<4; i++){
			System.out.println(arr[i]);
		}
		ArrayIndexOutOfBoundsException ex;
		ex = new ArrayIndexOutOfBoundsException();
		throw ex;
	}
}
