package com.bit.day11;

public class Ex05 {

	public static void main(String[] args) {
		String target1="java";
		String target2="java";
		System.out.println(target1.compareTo(target2));		//�ΰ� ������ 0 ��µ�
		target2="javaWeb";									//�ٸ��� �󸶸�ŭ �ٸ���(���ڿ��� ������ ����)�� �˷��ش�
		System.out.println(target1.compareTo(target2));		//target1�� ��ũ�� +1,+2,...�� ��µ�
 		target2="javb";										//���� ���̰˻�->���̰����� �迭���˻�(���ڿ��� ���ڷ� �� �˻�)
		System.out.println(target1.compareTo(target2));		//���� �ش��ϴ� ���̰� �����
 		target2="jaVa";	
		System.out.println(target1.compareTo(target2));		//V �� v �� ���� ���̰� ��µǴ°�
	}

}
