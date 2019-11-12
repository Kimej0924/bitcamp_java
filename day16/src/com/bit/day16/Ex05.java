package com.bit.day16;

public class Ex05 {

	public static void main(String[] args) {
		int[] source = {1,3,5,7,8,9,13,23,45,67,89,90};
//		int[] source = {5,7,8,9,13};
		int[] target= new int[source.length];	//복사할 곳의 사이즈가 복사할 개수보다 작으면안되 크면 디폴트값이메워줌
		
		//깊은복사
//		for(int i=0; i<target.length;i++){
//			target[i]=source[i];
//		}			
		//				(복사할소스,복사시작점,어디에복사할껀지,어디부터,몇개복사)
//		System.arraycopy(source, 0, target, 0, target.length);	//깊은복사
		System.arraycopy(source, 2, target, 2, 5);	//깊은복사
		source[3]=6;
		
		for(int i=0; i<target.length; i++){
			System.out.print(target[i]+"\t");
		}
		System.out.println("\n-----------------------------------");
		for(int i=0; i<target.length; i++){
			System.out.print(source[i]+"\t");
		}

	}

}
