package com.bit.day14;

import java.util.Enumeration;

public class Ex10 {

	public static void main(String[] args) {
		java.util.Vector vec;
		vec = new java.util.Vector();
		
		vec.addElement("첫번쨰");
		vec.addElement("두번쨰");
		vec.addElement("세번쨰");
		vec.addElement("네번쨰");
		vec.addElement("다슷번쨰");
		
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
		
		vec.addElement("여섯번째");
		
		while(eles.hasMoreElements()){		//다음값이 있냐없냐
			System.out.println(eles.nextElement());	//값을 뽑아내는게 아니라 커서로 가리키는거 
			
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
