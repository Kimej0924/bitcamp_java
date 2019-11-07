package com.bit.day14;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		//List
		java.util.ArrayList list;		//열람에서 뛰어난 성능을 가짐
		list = new ArrayList();
		// auto boxing
		list.add(1111);
		list.add(2222);
//		list.clear();		//상위 내용 지우는거
		list.add(3333);
		list.add(4444);
		
		ArrayList list2 = (ArrayList)list.clone();
		
		list.add(1,5555);		//1번 인덱스에 5555 끼워넣기
		list.add(list.size(),6666);		//들어감과 동시에 하나 늘어나서 맨 마지막에 6666추가
		
		list2.add(1,"한글");
//		list2.remove("한글");
		list2.remove(new Integer(2222));	//숫자는 integer 적용후 지우기 가능하다
		list2.set(1, 99999);
		
		for(int i=0; i<list2.size(); i++){
			//unboxing : integer->int
			System.out.println(list2.get(i));
		}
		System.out.println("------------------------");
		System.out.println(list.contains(5555));		//5555가 포함되어있어 true
		System.out.println(list.contains(8888));		//8888이 안포함되어있어 false
		
		System.out.println(list.indexOf(3333));			//3333의 인덱스 번호 출력 3  /중복값있을 시 최초의 값이있는 인덱스번호
		System.out.println(list.lastIndexOf(3333));		//검사를 꺼꾸로 진행 중복값있을 시 뒤에서 가까운 인덱스번호
		System.out.println(list.isEmpty());
		ArrayList list3=new ArrayList();
		System.out.println(list3.isEmpty());	
		list3=null;					//null은 값이 없는게 아니고 객체가 없는거(지워버리는거지)
		
		System.out.println("------------------------");
//		int[] arr = (Integer[])list2.toArray();		//오브젝트 배열을 캐스팅해서 바꿀순 없다 ->깊은복사해서 바꿀수밖에없음
		Object[] arr = list2.toArray();		//오브젝트 배열을 캐스팅해서 바꿀순 없다 ->깊은복사해서 바꿀수밖에없음
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}

}
