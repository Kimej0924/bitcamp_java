package com.bit.day12;

//public class Ex05 extends Machine {			//���߻���� �ȵ� extends Machine, Cl01 (�Ұ�)

//�������̽�
interface Inter01{		//���� �߻�޼��常�� ���� ->����� ���ؼ��� �ǹ̰� �ִ�
	//����� ����ƽ ����
	public static final int num1 = 1111;
	public final int num2 = 2222;
	public int num3 = 3333;
	int num4 = 4444;
	
	public abstract void func01();
	public void func02();		//abstract �� ��� �̰� �߻�޼���� (abstract)�����Ȱ�
	void func03();				//public �� ��� �����Ȱ���
}
public class Ex05 implements Inter01{
	
	public static void main(String[] args) {
		Inter01 me = new Ex05();
		me.func01();
		System.out.println(Inter01.num1);
		System.out.println(Inter01.num2);
//		Inter01.num3++;		//������ final�� �ִ� -> ����
		System.out.println(Inter01.num3);
		

	}
	
	public void func01(){
		System.out.println("Ex05���� ������ func01...");
	}
	
	public void func02(){

	}
	
	public void func03(){

	}

}
