package com.bit.day12;

public class Ex10 {
	public static void main(String[] args) {
		int[] arr1={2,3,0,6};
		
		
		for(int i=0; i<=arr1.length; i++){

			try{
				System.out.println(6/arr1[i]);
			}catch(ArithmeticException e){
				System.out.println("0으로 나누어서 오류");
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("인덱스번호 넘어감");				
			}catch(RuntimeException e){	
				System.out.println("에러해결...");
			}catch(Exception e){				//RuntimeException 상위에 Exception이 있다
			}	
			
		}
	}

}
