package com.bit.day14;

import java.util.Iterator;

public class Exre12 {

	public static void main(String[] args) {
		// �ζǹ�ȣ������(ver 0.1.0)
		// 1~45 �ߺ�x, ����o
		
		java.util.Set lotto = new java.util.TreeSet(); //�ߺ����� �Ÿ��� �����ؼ� ���� ���ö� �������?
		while(lotto.size()<6){
			lotto.add((int)(Math.random()*45)+1);
		}
		Iterator note = lotto.iterator();	//Iterator �ݺ��� ����
		while(note.hasNext()){				//hasNext�� �����Ͱ� ������ true ������ false
			System.out.println(note.next()+" ");	// next�� ���� �����͸� �����ϴ°�
		}
	}

}
