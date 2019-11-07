package com.bit.day14;

interface MyStack{
	void add(int val);
	int pull();
	
}
interface MyQueue{
	void add(int val);
	int pop();
}
class MyArrayList implements MyStack,MyQueue{
	// 캡슐화(정보의 은닉)	
	private int[] arr;	//필드의 직접접근을 불허하기 위해 private 사용 (보안성 상승)
						// 디폴트가 되면 메인에서 마음대로 생성사용가능해서 목적이 달라짐
	public MyArrayList(){
		arr=new int[]{};
	}
	
	public void add(int val){
		int[] temp=arr;
		arr=new int[arr.length+1];
		for(int i=0; i<temp.length; i++){
			arr[i]=temp[i];
		}
		arr[arr.length-1]=val;
	}
	
	public int size(){
		return arr.length;
	}
	
	public int get(int idx){
		return arr[idx];
	}
	
	public int pop(){
		int su = arr.length-1;
		int result =  arr[su];
		int[] temp = arr;
		arr = new int[su];
		for(int i=0; i<arr.length; i++){
			arr[i]=temp[i];
		}
		return result;
	}
	
	public int pull(){
		int result = arr[0];
		
		int[] temp=arr;
		arr = new int[arr.length-1];
		for(int i=0; i<arr.length; i++){
			arr[i]=temp[i+1];
		}
		return result;
	}
}
public class Ex01 {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
//		MyStack list = new MyArrayList();	MyStack안에 있는 add, pull만 사용가능	
//		MyQueue list = new MyArrayList();	MyQueue안에 있는 add, pop만 사용가능
		
//		list.arr=new int[2];
		list.add(123);
		list.add(25455);
		list.add(343);
		list.add(4232);
		list.add(5242);
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		System.out.println("--------------------");
		
//		while(list.size()!=0){
//			System.out.println(list.pop());
//		}
//		
//		System.out.println("--------------------");
			
//		while(list.size()!=0){
			System.out.println(list.pull());
			System.out.println(list.pull());
			System.out.println(list.pop());
			System.out.println(list.pull());
			System.out.println(list.pop());

			
			
			
			
//		}	
	}

}
