package com.bit;


// Q7. sort(int a, int b, int c)을 만드시고
//	a=7, b=3, c=5 출력을 3<5<7
// Q8. int[] arr={7,3,5}를 arr={3,5,7}로 만드시오


class Ex09{
  public static void main(String[] args){
	int[] arr = new int[]{9,8,7};
	for(int i=0; i<arr.length; i++){
		System.out.print(arr[i]+" ");
	}	

	System.out.println("\n------------------"); 
	int temp;
	for(int j=0; j<arr.length; j++){
		for(int i=0; i<arr.length-1; i++){
			if(arr[i]>arr[i+1]){
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			}

		}
	}

	for(int i=0; i<arr.length; i++){
		System.out.print(arr[i]+" ");
	}
  }
}