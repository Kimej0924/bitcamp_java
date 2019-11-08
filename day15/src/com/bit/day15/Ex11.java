package com.bit.day15;

import java.util.HashMap;

public class Ex11 {

	public static void main(String[] args) {
		// Map
		java.util.HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value1");		//value값의 중복 가능

//		map.put("key1", 12234);			//key값은 중복이 없음 - 중복 시에는 마지막 설정값이 출력됨
//		map.put(1234, true);			//key값, value값은 문자,숫자 boolean,null 등등 다들어갈수있다
//		map.put(null, 132452);			//제네릭 스트링 부여시 상위3개 숫자들어가서 오류뜸
		map.put(null, "바꿈");			
		System.out.println(map.get("key3"));
		System.out.println(map.get("key1"));
		System.out.println(map.get("key4"));
		System.out.println(map.get(null));		//해당 null은 키이름임- 마지막값 바꿈이 호출됨
		System.out.println(map.get("없음"));	//없음을 호출하면 null이(디폴트값) 호출됨
		
		
	}

}
