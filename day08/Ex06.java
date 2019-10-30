package com.bit;

class Ex06{
  public static void main(String[] args){

	// 배열 - 자료구조때무네만들어졌어
	// 자료형[] 배열이름 = new 자료형[갯수];
	// 자료형[] 배열이름 = new 자료형[]{1,2,3,4,...,n};
	// 배열이름[인덱스번호]=값 	->호출 배열이름[인덱스번호]
	// 인덱스번호는 0부터 시작
	// 인덱스번호는 연속됨
	// 인덱스번호는 갯수-1 끝

//	int[] a=new int[5];	//배열선언
/*
	int a0=1;
	int a1=3;
	int a2=5;
	int a3=7;
	int a4=9;
*/
/*
	for(int i=0; i<5; i++){	//초기화
		a[i]=1+2*i;

		System.out.println(a[i]);
	}
*/
//	int[] a=new int[]{1,2,3,4,5};	//배열선언	

	int[] a={10,20,30,40,50};
	for(int i=1; i<5; i++){
		System.out.println(a[i]);
	}

  }
}