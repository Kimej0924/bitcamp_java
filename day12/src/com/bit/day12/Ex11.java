package com.bit.day12;

class BitException extends Exception{

	public BitException(){
		super("0���� ������� �ȵ�");
	}
	public BitException(String msg){
		super(msg);
	}
}

public class Ex11 {
	public static void main(String[] args) {
//		try{
//			int su=2/0;
//		}catch(ArithmeticException e){
//			System.out.println(e);
//			System.out.println(e.toString());
//			System.out.println(e.getMessage());
//			e.printStackTrace();		//�ڿ��� ������������ �۵��ϰ� err �߻��� �ٷ� �Ǵ°ǾƴϷ� err��������س��°�
//		}
		try{
		int result = div(6,0);
		System.out.println(result);
		}catch(BitException e){
			e.printStackTrace();
		}
	}

	public static int div(int a, int b) throws BitException{
		if(b==0){
			BitException err;
			err = new BitException("�̰ǹ���");
			throw err;
		}
		return a/b;
	}
}
