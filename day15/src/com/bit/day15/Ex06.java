package com.bit.day15;

class Box3<T>{
	T su;
	public void setSu(T su){
		this.su=su;
	}
	public T getSu(){
		return su;
	}
}


public class Ex06 {
	//?는 제네릭을 나중에 결정짓는건데
	//super 집어넣을때 super 뒤에오는것(Number를)상속받는거 ->끄집어낼때는 와일드라 캐스팅이 필요하다
	//extend 집어넣을때 아무것도 결정된게 없고 끄집어낼때 상속받은거(반대개념)
	
	public static void main(String[] args) {
		Box3<? super Number> box = new Box3<>();	
		box.setSu(1111);
		box.setSu(3.14);
//		box.setSu("aaa");						//number에 대해서만 받을수있다아ㅣㅏㄴ러ㅏㅣㄴㄹ
		Number su = ((Box3<? extends Number>)box).getSu();		//결정 짓지 않아서 ()안에 뭐일지 모름->캐스팅 필요

	}

	public static void func(Box3<? extends Number> box){}
}
