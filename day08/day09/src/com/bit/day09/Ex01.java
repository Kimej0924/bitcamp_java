package com.bit.day09;

public class Ex01 {
	//"abcd" -> Ox0101
	public static void main(String[] args) {
		// ���ڿ� (String)
		String msg1;
		msg1="abcd"; //�ֵ���ǥ
		
		String msg2;
		msg2=new String("abcd"); // ""
		
		String msg3="abcd";
		String msg4="ab"+"cd";			// +�� ���ؼ� ������ ���� ��ü�� ��Ƴ��� �ϴ°�(�ڿ��Ҹ�������)
		String msg5="ab".concat("cd");	// .concat �� ���ϱ��� //ab �� cd�� �޼ҵ带 ���ؼ� ���������� ���������� ����
										// �׷��� ���ο� ��ü�� ���� ���� ��Ƴ��°� -> �ּҰ� �޶���
		System.out.println(msg1==msg2);
		System.out.println(msg1.equals(msg2));	//.equals�� ��(Ox0101)�� ���ϴ°�		
		
		System.out.println(msg1==msg3);
		System.out.println(msg1.equals(msg3));	
		
		System.out.println("abcd"==msg1);
		System.out.println("abcd"==msg2);
		System.out.println("abcd"==msg3);
		System.out.println("abcd"==msg4);	
		System.out.println("abcd"==msg5);

	}

}
