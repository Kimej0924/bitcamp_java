package com.bit.day11;

public class Ex04 {

	public static void main(String[] args) {
		//java
		String target = "java";
		
		String result = null;
//		result = target.replace('v', 'V');			//replace �� ����, ���ڿ� �� �ް� ���� �ִ�
		result = target.replace("av", "awebV");		//���� ���� �߰� ���� �� ����

		
//	��Ʈ��Ŭ�������� ��ǥ������ ���Ǵ°͵�	//
		System.out.println(result);
		System.out.println(target==result);			//�����Ѱ��� ���� ���°Ŷ� ���۷��� ���ϸ� �ٸ�
		System.out.println(target);
		System.out.println(target.contains("av"));
		System.out.println(target.contains("aV"));		//�ش� ���ڿ��� �����ϰ� �ִ°�
		System.out.println("--------------");
		System.out.println(target.endsWith("vaa"));		// ~�γ����� vaa�� ������ 
		System.out.println(target.startsWith("ja"));	// ~�ν����ϳ� ja�� �����ϳ� 	
		System.out.println(target.indexOf('a'));		// �ش� ������ �ε��� ��ȣ�� �θ��µ� �ߺ��ܾ�� �տ��� �ε�����ȣ
		System.out.println(target.indexOf("ja"));		// �ش� ���ڰ� �������� ������ -1 ��µ� / int�� ����(�ڵ�����ȯ)
		System.out.println("--------------");												// ���ڿ��� ���� > �ε��� ��ȣ�� ���ڿ��� �� ���ڸ� ��ȣ ������
		System.out.println(target.lastIndexOf('a'));	// �ߺ������� �ڿ��� ���� ã�Ƴ��°�
		System.out.println(target.lastIndexOf("av"));
		System.out.println("--------------");			
		target="JavaWebSpring";
		//		01234
		//		1234567
//		String result2=target.substring(2);		//�ε��� ��ȣ 2���� ������ ���
		String result2=target.substring(4,7);	//�ε��� ��ȣ 4~6���� ��µ�  (i=4; i<7; ���� ����)
		System.out.println(result2);	
		System.out.println("--------------");	
		System.out.println(target.toLowerCase());	//�ڵ����� ���� �ҹ��ڷ� ����
		System.out.println(target.toUpperCase());	//�ڵ����� ���� �빮�ڷ� ����		
		System.out.println(target);					//�ڿ� toString()�� �����Ǿ� �ִ°�
		System.out.println(target.toString());		
		System.out.println("--------------");
		target="                 ab cd     df   ";
		System.out.println(target);
		System.out.println(target.trim()+"�������");	// .trim() �յڰ������� (������ ���� �ȵ�)
		
		
	}

}
