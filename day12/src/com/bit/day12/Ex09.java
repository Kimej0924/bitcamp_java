package com.bit.day12;

public class Ex09 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		try{
			show(arr);
		}catch(ArrayIndexOutOfBoundsException e){		//��ġ�ϴ� exception���� ������ ������ �ƴϸ� err
			System.out.println("����ȸ��");
		}
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);			//err �߻� ���������� �ϸ�err �ȹ߻�?
		
	}

	public static void show(int[] arr) throws ArrayIndexOutOfBoundsException{
		for(int i=0; i<4; i++){
			System.out.println(arr[i]);
		}
		ArrayIndexOutOfBoundsException ex;
		ex = new ArrayIndexOutOfBoundsException();
		throw ex;
	}
}
