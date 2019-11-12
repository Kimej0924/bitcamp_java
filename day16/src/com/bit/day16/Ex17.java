package com.bit.day16;

import java.util.Arrays;
import java.util.List;

public class Ex17 {

	public static void main(String[] args) {
		int[] arr1 = {1,3,6,23,7,5};
		int[] arr2 = {1,3,6,23,7,5};
		int[] arr3 = new int[5]; 
						
		Arrays.sort(arr2);
		System.out.println(Arrays.equals(arr1, arr2));
//		System.out.println(Arrays.deepEquals(arr1, arr2));	//object 타입만 받을수있으니까 할려면해보든가
		System.out.println(arr1.toString());						//binarySearch는 이진트리라 정렬없이 쓰면 안되
		System.out.println("idx:"+Arrays.binarySearch(arr2, 5));	//sort 하지 않았을경우 값이 엉망>sort 후사용해야함
		System.out.println(java.util.Arrays.toString(arr1));
		List<Integer> list1 = Arrays.asList(1,3,5,7,9);
		for(int i=0; i<list1.size();i++){
			System.out.println(list1.get(i));
			
		}

		System.out.println("-------------------------");
		Arrays.fill(arr3, 100);		//arr3 배열에 val 100으로 채워넣는거
		System.out.println(Arrays.toString(arr3));
		
		int[] arr4 = Arrays.copyOf(arr1, 3);	//타겟,길이 > 넘어버리면 나머지는 0으로 출력됨 적으면 적은만큼만
		System.out.println(Arrays.toString(arr4));
		
		int[] arr5 = Arrays.copyOfRange(arr1, 2, arr1.length);	//(타겟,시작위치,arr1마지막까지)
		System.out.println(Arrays.toString(arr5));
	}

}
