package com.bit.day16;

public class Ex02 {

	public static void main(String[] args) {
		String msg="javaweb";
		char[] chs=msg.toCharArray();
		String msg2=new String(chs);
		StringBuilder build1=new StringBuilder("���ڿ�"); //���� �������� �� + 16���� �ʱ�capa->19
		StringBuffer buf1=new StringBuffer(build1);	//	5���� ���� 6�̵Ǵ¼��� 6�� �ι�� capa ����/ ������ ������ �ȵ�
		System.out.println(buf1);
		System.out.println("-----------------------");
		for(int i=0; i<17; i++){
			buf1.append('a');
//			buf1.trimToSize();	
			System.out.print(buf1.length()+":");
			System.out.println(buf1.capacity());		//�ʱ� capa = 16, ������ �ڱ� �ڽ��� 2��� ������ �÷�����
		}
		

	}

}
