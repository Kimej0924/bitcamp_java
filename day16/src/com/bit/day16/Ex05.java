package com.bit.day16;

public class Ex05 {

	public static void main(String[] args) {
		int[] source = {1,3,5,7,8,9,13,23,45,67,89,90};
//		int[] source = {5,7,8,9,13};
		int[] target= new int[source.length];	//������ ���� ����� ������ �������� ������ȵ� ũ�� ����Ʈ���̸޿���
		
		//��������
//		for(int i=0; i<target.length;i++){
//			target[i]=source[i];
//		}			
		//				(�����Ҽҽ�,���������,��𿡺����Ҳ���,������,�����)
//		System.arraycopy(source, 0, target, 0, target.length);	//��������
		System.arraycopy(source, 2, target, 2, 5);	//��������
		source[3]=6;
		
		for(int i=0; i<target.length; i++){
			System.out.print(target[i]+"\t");
		}
		System.out.println("\n-----------------------------------");
		for(int i=0; i<target.length; i++){
			System.out.print(source[i]+"\t");
		}

	}

}
