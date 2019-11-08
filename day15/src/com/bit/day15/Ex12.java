package com.bit.day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Ex12 {
	// Map type - HashMap 최근에 나오는 패턴사용 랜덤으로 숫자가더잘나와,
	//			- Hashtable 예전스타일? 일련의 규칙이 조금 보임	
	// Map 을 사용해야겠다 - 기본적으로는 HashMap 사용
	public static void main(String[] args) {		
		Map<String,Integer> map;			
		map = new HashMap<String,Integer>();
		
		for(int i=0; i<5; i++){
			map.put("key"+i, i);
		}
		map.put("key1", null);		//key 입장에서는 덮어쓴거 ,value입장에선 값없어진거
		map.remove("key1");			//확실히 제거
		
		java.util.Set<String> keys=map.keySet();
		Iterator<String> ite=keys.iterator();
		while(ite.hasNext()){
			String key=ite.next();
			System.out.println(key+":"+map.get(key));
		}
		System.out.println("-------------------------");
		
		Set<Entry<String,Integer>> entrys;
		entrys=map.entrySet();
		Iterator<Entry<String,Integer>>ite2;
		ite2=entrys.iterator();
		while(ite2.hasNext()){
			Entry<String,Integer> entry = ite2.next();
			System.out.print(entry.getKey()+":");
			System.out.println(entry.getValue());
		}
		System.out.println("-------------------------");
		Set keys2=map.keySet();
		List<String> list = new ArrayList<>(keys2);		//복사해서 ArrayList 만들어서 사용하는거
		for(int i=0; i<list.size(); i++){
			String key=list.get(i);
			System.out.println(key+":"+map.get(key));
		}
	}

}
