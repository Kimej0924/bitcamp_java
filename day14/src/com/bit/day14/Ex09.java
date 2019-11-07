package com.bit.day14;

public class Ex09 {

	public static void main(String[] args) {
		//stack
		java.util.Stack stack;
		stack = new java.util.Stack();

		stack.push("첫번째");
		stack.push("두번째");
		stack.push("세번째");
		stack.push("네번째");
		stack.push("다섯번째");
		
		System.out.println(stack.search("네번째"));
		
		while(!stack.empty()){
			System.out.println(stack.pop());
		}

	}

}
