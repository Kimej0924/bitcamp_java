package com.bit.day10;

public class Ex01 {

	public static void func1(Object a){}
	
	public static void main(String[] args) {
		// ����Ŭ����(�⺻�ڷ����� ��ü Ÿ��)
		// �⺻�ڷ����� ��ü�� �δ°�
		int a=100;
		java.lang.Integer su1;
		su1=new Integer(100);
		Integer su2=new Integer("200");		//���䷡�� //�ڽ�
		Integer su3=100;		//����	//��ڽ�
		
		int b = su1+1;
		func1(10);
		System.out.println(su1+su2);

		System.out.println(Integer.MAX_VALUE);	//�� �빮��   ���������(final) > ������ �Ұ��� 
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		Integer su4 = new Integer("100");
		byte by1=su4.byteValue();
		System.out.println(su4+":"+by1);
		
		System.out.println(su1==su4);	//���۷�����
		System.out.println(su1.equals(su4));	//value�� ��
		String msg="1234";
		Integer su5=Integer.valueOf(msg);	//msg���� ���ڷθ� �̷�����־����
		System.out.println(su5);
		System.out.println(su5.intValue());
		
		int su6=Integer.max(2,3);
		System.out.println(su6);
		
		int su7=Integer.parseInt(msg);		//���ڿ��� ���ڷ� ��ȯ�ϴ°�
		int su8=Integer.valueOf(msg);
		int su9=Integer.reverse(1);
		System.out.println(su9);
		int su10=7;
		System.out.println(su10+"�� 2����:"+Integer.toBinaryString(su10));
		System.out.println(su10+"�� 8����:"+Integer.toOctalString(su10));
		System.out.println(su10+"�� 16����:"+Integer.toHexString(su10));
		
		int su11=Integer.compare(28, 28);	//�տ��� ũ�� 1, �ڿ���ũ�� -1, ������ 0 ���
		int su12=su4.compareTo(100);		//su4�� ũ�� 1, ��ȣ���� ���� ũ�� -1, ������ 0
		System.out.println(su12);
	}

}
