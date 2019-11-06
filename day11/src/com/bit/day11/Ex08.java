package com.bit.day11;

public class Ex08 {

	public static void main(String[] args) {
		// 예외처리		- 에러의 상황을 회피
		int[] arr ={1,2,3};
		try{
			for(int i=0; i<5; i++){
				int su=arr[i];
				System.out.println(su);
			}			
		}catch(ArrayIndexOutOfBoundsException e){		//에러를 잡아냈을때만 실행하는거
				System.out.println("에러회피함");		//어디서 부터 어디까지 싸느냐에 따라 출력값이 달라짐
		}
			
		System.out.println("메인끝");

	}

}
