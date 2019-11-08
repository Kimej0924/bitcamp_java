package com.bit.day15;


public class Ex01 {

	public static void main(String[] args) {
		//제네릭
		java.util.List<String> list = null;
		list = new java.util.ArrayList<String>();		//스트링만 받을수 있는 자료구조
		
		list.add("하나");
		list.add("두울");
//		list.add(new Integer(3333));	// 숫자가 들어가면 오류
		list.add("세엣");
		list.add("네엣");

		for(int i=0; i<list.size(); i++){
			String obj = (String)list.get(i);
			System.out.println(list.get(i));
		}
	}

}
