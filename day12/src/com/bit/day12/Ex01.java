package com.bit.day12;

class Cl01{		//�θ�Ŭ����
	int num1=1234;
	
	public Cl01(){
		
	}
	
	public void func01(){
		System.out.println("�θ�Ŭ������ func01...");
	}
	
	public final void func02(){
		System.out.println("�θ�Ŭ������ final func02...");
	}
	
}

class Cl101 extends Cl01{		//�θ�Ŭ������ ��ӹ��� �ڽ�Ŭ����
	int num1=1111;
	int num2=2222;
	
	//�������̵�(���������ڴ� �θ�Ŭ������ ���ų� ���� �� �����ɷ� ��밡��)
	public void func01(){
		System.out.println("�ڽ�Ŭ������ func01...");
	}
	
	public void func03(){
		System.out.println("�ڽ�Ŭ������ func03...");
	}
	
	
}


public class Ex01 {

	public static void main(String[] args) {
		// ���
		System.out.println("parent obj>---------------------");
		Cl01 parent = new Cl01();
		System.out.println(parent.num1);
		parent.func01();
		parent.func02();
		System.out.println("child obj>---------------------");	
		Cl101 child = new Cl101();		//�θ�Ŭ������ ��ӹ��� �ڽ�Ŭ������ ��ü����
		System.out.println(child.num2);
		child.func03();
		System.out.println(child.num1);
		child.func01();
		child.func02();
		System.out.println("parent type>---------------------");
		//������
//		Cl101 cl2 = new Cl01(); 				
		Cl01 cl1 = new Cl101();
		cl1.func01();		//�θ�Ÿ���� �ڽİ�ü
		cl1.func02();
//		cl1.func03();	//Ÿ���� �θ�� �θ�Ÿ�Կ��� ���ǵȰ͸� ��밡�� -> ������ �ڽ�����
		System.out.println(cl1.num1);		//�޼ҵ�� �������̵����� �ʵ��� �������̵�� �ƴ϶� �θ���num1�� ����
//		System.out.println(cl1.num2);		//�θ�Ÿ�Կ��� num2�� ��� ����Ұ�
		
		System.out.println("child type>---------------------");		
		Cl101 cl2 = (Cl101)cl1;		//ĳ����
		System.out.println(cl2.num1);
		System.out.println(cl2.num2);
		cl2.func01();
		cl2.func02();
		cl2.func03();
		
		

		
		
	}

}
