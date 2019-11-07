package com.bit.day14;

import java.util.Iterator;

public class Exre12 {

	public static void main(String[] args) {
		// 로또번호생성기(ver 0.1.0)
		// 1~45 중복x, 정렬o
		
		java.util.Set lotto = new java.util.TreeSet(); //중복값을 거르고 정리해서 저장 나올땐 순서대로?
		while(lotto.size()<6){
			lotto.add((int)(Math.random()*45)+1);
		}
		Iterator note = lotto.iterator();	//Iterator 반복자 생성
		while(note.hasNext()){				//hasNext는 데이터가 있으면 true 없으면 false
			System.out.println(note.next()+" ");	// next는 다음 데이터를 리턴하는거
		}
	}

}
