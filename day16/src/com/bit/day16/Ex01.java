package com.bit.day16;

public class Ex01 {

	public static void main(String[] args) {
		//StirngBuffer  StirngBuilder  ���� �ϳ� 
		//���ڿ��� �ٷ�� Ŭ����
		//�����ϴ� ���� ���ο� ��ü�� ���°� �ƴ϶� �ڱ��ڽ���(�ϳ��� ��ü) �ٲ�°� - �ڿ��Ҹ��پ�� 
		//������ ������ �������
		
		String msg0="java"+"web";
		String msg1="java".concat("web");

		
		StringBuffer msg2=new StringBuffer("BUFFER");	//������ �����ڸ� ���ؼ� �Ҽ� �־�
//		StringBuffer msg3="buffer class";		//StringBuffer msg3=new String("buffer class"); �̰Ǿȵ�
		
		StringBuffer msg3=new StringBuffer(" class");
		StringBuffer msg4=new StringBuffer("�� +");
		
		System.out.println(msg0=="javaweb");
		System.out.println(msg0==msg1);
		
		System.out.println("---------------------");
//		System.out.println(msg2+msg3);		//+�� ���ϴ°� StringŬ���������� ����
		System.out.println(msg2.append(msg3).append(msg4));
		
		System.out.println("---------------------");
		System.out.println(msg2);	//StringBuffer�� append �� ������ �ڱ��ڽ��� �ٲ��
		
		

	}

}
