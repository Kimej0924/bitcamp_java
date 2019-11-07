package com.bit.day14;

public class Ex08 {

	public static void main(String[] args) {
		java.util.Deque que;
		que = new java.util.LinkedList();
		
		//queue
//		que.offer("첫번째");
//		que.offer("두번째");
//		que.offer("세번째");
//		que.offer("네번째");
//		que.offer("다섯번째");
		
//		while(que.peek()!=null){		//peek는 제일 마지막에서 바라보는거
//			System.out.println(que.poll());
//		}
		System.out.println("-------------------");
		que.offerFirst("첫번째");
		que.offerFirst("두번째");
		que.offerFirst("세번째");
		que.offerFirst("네번째");
		que.offerFirst("다섯번째");
		
		while(que.peekLast()!=null){
			System.out.println(que.pollLast());
		}
		System.out.println("-------------------");
		que.addLast("1번째");
		que.addLast("2번째");
		que.addLast("3번째");
		que.addLast("4번째");
		que.addLast("5번째");
		while(que.peekFirst()!=null){
			System.out.println(que.pollFirst());
		}
		
	}

}
