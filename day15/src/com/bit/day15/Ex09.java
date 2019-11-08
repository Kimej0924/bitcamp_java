package com.bit.day15;

import java.util.Vector;

public class Ex09 {

	public static void main(String[] args) {
//		Vector vec1 = new Vector(3);				//()안에 숫자를 지정하면 그숫자로 첫사이즈 시작 이후 자신의 두배수
		Vector vec1 = new Vector(3,2);				//(,)안에 숫자를 지정하면 앞숫자 첫사이즈 뒷숫자 증가량설정
		
		for(int i=0; i<6; i++){				//기본값 i<10 : capa 10 / i<11~2 : capa 20 / i<21~40 : capa 40
			vec1.add(i);
		}
		vec1.trimToSize();
		System.out.println(vec1.capacity());	//사이즈는 10부터 시작, 자기자신의 두배수로로 증량된다

		System.out.println("--------------");
//		Vector vec2 = vec1;		//얕은복사라서 vec1.add(1111) 했을 시 add 가능
//		Vector vec2 = new Vector(vec1);		//깊은복사 vec1.add(1111) 했을 시 안나옴
//		vec1.add(1111);
		
		
		Vector vec2 = new Vector();
		vec2.add(1234);
//		vec2.addAll(vec1);
		for(int i=0; i<vec2.size(); i++){
			System.out.println(vec2.elementAt(i));
		}
		
	}

}
