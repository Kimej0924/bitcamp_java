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
	// ĸ��ȭ(������ ����)	
	private int[] arr;	//�ʵ��� ���������� �����ϱ� ���� private ��� (���ȼ� ���)
						// ����Ʈ�� �Ǹ� ���ο��� ������� ������밡���ؼ� ������ �޶���
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
//		MyStack list = new MyArrayList();	MyStack�ȿ� �ִ� add, pull�� ��밡��	
//		MyQueue list = new MyArrayList();	MyQueue�ȿ� �ִ� add, pop�� ��밡��
		
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
