package com.bit.day14;

public class Ex07 {

	public static void main(String[] args) {
		// 정보의 집합(순서o) list
		// 정보의 집합(순서x) set 
		
		// 선입선출
		java.util.Queue que =null;
		que = new java.util.LinkedList();
		
//		que.add("첫번째");
//		que.add("두번째");
//		que.add("세번째");
//		que.add("네번째");
//		que.add("다섯번째");
		
		que.offer("첫번째");
		que.offer("두번째");
		que.offer("세번째");
		que.offer("네번째");
		que.offer("다섯번째");

		
		
		while(que.peek()!=null){
		System.out.println(que.poll());			
		}
	}

}
