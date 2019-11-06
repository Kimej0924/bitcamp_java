package com.bit.day12;

class BitException extends Exception{

	public BitException(){
		super("0으로 나누기는 안됨");
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
//			e.printStackTrace();		//자원적 여유있을때만 작동하고 err 발생시 바로 되는건아니래 err기록저장해놓는거
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
			err = new BitException("이건뭐야");
			throw err;
		}
		return a/b;
	}
}
