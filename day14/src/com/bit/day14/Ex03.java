package com.bit.day14;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		//List
		java.util.ArrayList list;		//�������� �پ ������ ����
		list = new ArrayList();
		// auto boxing
		list.add(1111);
		list.add(2222);
//		list.clear();		//���� ���� ����°�
		list.add(3333);
		list.add(4444);
		
		ArrayList list2 = (ArrayList)list.clone();
		
		list.add(1,5555);		//1�� �ε����� 5555 �����ֱ�
		list.add(list.size(),6666);		//���� ���ÿ� �ϳ� �þ�� �� �������� 6666�߰�
		
		list2.add(1,"�ѱ�");
//		list2.remove("�ѱ�");
		list2.remove(new Integer(2222));	//���ڴ� integer ������ ����� �����ϴ�
		list2.set(1, 99999);
		
		for(int i=0; i<list2.size(); i++){
			//unboxing : integer->int
			System.out.println(list2.get(i));
		}
		System.out.println("------------------------");
		System.out.println(list.contains(5555));		//5555�� ���ԵǾ��־� true
		System.out.println(list.contains(8888));		//8888�� �����ԵǾ��־� false
		
		System.out.println(list.indexOf(3333));			//3333�� �ε��� ��ȣ ��� 3  /�ߺ������� �� ������ �����ִ� �ε�����ȣ
		System.out.println(list.lastIndexOf(3333));		//�˻縦 ���ٷ� ���� �ߺ������� �� �ڿ��� ����� �ε�����ȣ
		System.out.println(list.isEmpty());
		ArrayList list3=new ArrayList();
		System.out.println(list3.isEmpty());	
		list3=null;					//null�� ���� ���°� �ƴϰ� ��ü�� ���°�(���������°���)
		
		System.out.println("------------------------");
//		int[] arr = (Integer[])list2.toArray();		//������Ʈ �迭�� ĳ�����ؼ� �ٲܼ� ���� ->���������ؼ� �ٲܼ��ۿ�����
		Object[] arr = list2.toArray();		//������Ʈ �迭�� ĳ�����ؼ� �ٲܼ� ���� ->���������ؼ� �ٲܼ��ۿ�����
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}

}
