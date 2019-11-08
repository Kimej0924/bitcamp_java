package com.bit.day15;

class Box2<T,V>{
	T su;
	V msg;		//2개이상일때는 만들었을 때 기준으로 순서맞춰줘야해
	
	public void setSu(T su){
		this.su = su;
	}
	public void setMsg(V msg){
		this.msg = msg;
	}
	
	public T getSu(){
		return su;
	}
	
	public V getMsg(){
		return msg;
	}
	
}


public class Ex04 {

	public static void main(String[] args) {
		Box2<Integer,String> box = new Box2<Integer,String>();	//모든 제네릭에서는 기본자료형이 안되 객체로 해야함
		
		box.setSu(1111);
		box.setMsg("환영합니다");
		
		int su=box.getSu();
		String msg = box.getMsg();
		
		System.out.println(su);
		System.out.println(msg);

	}

}
