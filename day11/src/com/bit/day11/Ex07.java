package com.bit.day11;

import java.util.*;
public class Ex07 {


	public static void main(String[] args) {
		String target = "java Db           web    Spring android";
		
		java.util.StringTokenizer stk;
		stk = new StringTokenizer(target," ");
		
		int cnt = stk.countTokens();
		System.out.println("¸î°³:"+cnt);
		
		while(stk.hasMoreElements()){
			System.out.println(stk.nextElement());

		}
	}
}
