package com.bit.day12;

public class Ex10 {
	public static void main(String[] args) {
		int[] arr1={2,3,0,6};
		
		
		for(int i=0; i<=arr1.length; i++){

			try{
				System.out.println(6/arr1[i]);
			}catch(ArithmeticException e){
				System.out.println("0���� ����� ����");
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("�ε�����ȣ �Ѿ");				
			}catch(RuntimeException e){	
				System.out.println("�����ذ�...");
			}catch(Exception e){				//RuntimeException ������ Exception�� �ִ�
			}	
			
		}
	}

}
