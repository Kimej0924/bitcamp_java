package com.bit.day13;

class MyArray{
	//ArrayList
	Object[] arr;
		
	public MyArray(){
		arr=new Object[]{};
	}
	public int size(){
		return arr.length;		
	}
	
	public void add(Object val){
		Object[] temp=arr;
		arr=new Object[arr.length+1];
		for(int i=0; i<temp.length; i++){
			arr[i]=temp[i];
		}
		arr[arr.length-1]=val;
	}
	
	public Object get(int idx){
		return arr[idx];
	}
		
	public void remove(int idx){
		Object[] temp = arr;
		arr=new Object[arr.length-1];
		
		for(int i=0; i<idx; i++){
			arr[i]=temp[i];
		}
		for(int i=idx; i<arr.length; i++){
			arr[i]=temp[i+1];
		}
	}
	
}

public class Ex13 {


	public static void main(String[] args) {
		MyArray list = new MyArray();
		System.out.println("SIZE:"+list.size());
		list.add(1);
		System.out.println("SIZE:"+list.size());
		list.add(2);
		System.out.println("SIZE:"+list.size());
		list.add(7);
		System.out.println("SIZE:"+list.size());
		list.add(1111);
		System.out.println("SIZE:"+list.size());
		list.remove(2);
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
			
		}




	}

}
