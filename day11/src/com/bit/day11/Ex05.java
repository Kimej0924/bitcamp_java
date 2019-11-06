package com.bit.day11;

public class Ex05 {

	public static void main(String[] args) {
		String target1="java";
		String target2="java";
		System.out.println(target1.compareTo(target2));		//두개 같으면 0 출력됨
		target2="javaWeb";									//다르면 얼마만큼 다른지(문자열의 길이의 차이)를 알려준다
		System.out.println(target1.compareTo(target2));		//target1이 더크면 +1,+2,...로 출력됨
 		target2="javb";										//선행 길이검사->길이같으면 배열값검사(문자열을 문자로 뜯어서 검사)
		System.out.println(target1.compareTo(target2));		//값에 해당하는 차이가 몇개인지
 		target2="jaVa";	
		System.out.println(target1.compareTo(target2));		//V 와 v 의 값의 차이가 출력되는거
	}

}
