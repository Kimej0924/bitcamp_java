package com.bit.day14;

import java.util.Enumeration;

public class Ex10 {

	public static void main(String[] args) {
		java.util.Vector vec;
		vec = new java.util.Vector();
		
		vec.addElement("ù����");
		vec.addElement("�ι���");
		vec.addElement("������");
		vec.addElement("�׹���");
		vec.addElement("�ٽ�����");
		
		System.out.println(vec.elementAt(0));
		System.out.println(vec.elementAt(1));
		System.out.println(vec.elementAt(2));
		System.out.println(vec.elementAt(3));
		System.out.println(vec.elementAt(4));
		System.out.println("------------------");
		System.out.println(vec.firstElement());
		System.out.println(vec.lastElement());
		System.out.println("------------------");
		Enumeration eles = vec.elements();
		
		vec.addElement("������°");
		
		while(eles.hasMoreElements()){		//�������� �ֳľ���
			System.out.println(eles.nextElement());	//���� �̾Ƴ��°� �ƴ϶� Ŀ���� ����Ű�°� 
			
		}
		System.out.println("------------------");
		System.out.println(vec.firstElement());
		System.out.println(vec.lastElement());
		System.out.println("------------------");
		eles = vec.elements();
		
		while(eles.hasMoreElements()){		
			System.out.println(eles.nextElement());	
		}	
		
	}

}
