package com.bit.day14;

public class Ex09 {

	public static void main(String[] args) {
		//stack
		java.util.Stack stack;
		stack = new java.util.Stack();

		stack.push("ù��°");
		stack.push("�ι�°");
		stack.push("����°");
		stack.push("�׹�°");
		stack.push("�ټ���°");
		
		System.out.println(stack.search("�׹�°"));
		
		while(!stack.empty()){
			System.out.println(stack.pop());
		}

	}

}
