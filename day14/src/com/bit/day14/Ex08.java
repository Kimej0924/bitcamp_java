package com.bit.day14;

public class Ex08 {

	public static void main(String[] args) {
		java.util.Deque que;
		que = new java.util.LinkedList();
		
		//queue
//		que.offer("ù��°");
//		que.offer("�ι�°");
//		que.offer("����°");
//		que.offer("�׹�°");
//		que.offer("�ټ���°");
		
//		while(que.peek()!=null){		//peek�� ���� ���������� �ٶ󺸴°�
//			System.out.println(que.poll());
//		}
		System.out.println("-------------------");
		que.offerFirst("ù��°");
		que.offerFirst("�ι�°");
		que.offerFirst("����°");
		que.offerFirst("�׹�°");
		que.offerFirst("�ټ���°");
		
		while(que.peekLast()!=null){
			System.out.println(que.pollLast());
		}
		System.out.println("-------------------");
		que.addLast("1��°");
		que.addLast("2��°");
		que.addLast("3��°");
		que.addLast("4��°");
		que.addLast("5��°");
		while(que.peekFirst()!=null){
			System.out.println(que.pollFirst());
		}
		
	}

}
