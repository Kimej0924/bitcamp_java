package com.bit.day10;

public class Ex09 {

	public static void main(String[] args) {
		int[] arr={9,7,5};
//					9	7
//					9	5
		int temp=0;
//		if(arr[0]>arr[1]){
//			temp=arr[0];
//			arr[0]=arr[1];
//			arr[1]=temp;
//		}		
//		if(arr[0]>arr[2]){
//			temp=arr[0];
//			arr[0]=arr[2];
//			arr[2]=temp;			
//		}
//			
//		if(arr[1]>arr[2]){
//			temp=arr[1];
//			arr[1]=arr[2];
//			arr[2]=temp;
//		}
		
		for(int i=0; i<arr.length-1; i++){				//2는 배열의크기-1
			for(int j=1+i; j<arr.length; j++){		//3은 배열의 개수
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;			//낮은숫자부터 정렬  sort
			}
			
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	
	}

}
