package com.bit.day10;

public class Lotto1 {

	public static void main(String[] args) {
		System.out.println("�ζǹ�ȣ������(ver 0.0.1)");
		//1~45 
		//0~44	+1
		int[] lotto = new int[6];
		
		for(int i=0; i<6; i++){
			lotto[i]=(int)(Math.random()*45)+1;			
			for(int j=0 ; j<i ; j++){
				if(lotto[i]==lotto[j]){
					System.out.println("�ߺ��߻�");
					i--;
					break;
				}
			}
		}
		int temp=0;
		for(int i=0; i<lotto.length-1; i++){
			for(int j=i+1; j<lotto.length; j++){
				if(lotto[i]>lotto[j]){
					temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
			
		for(int i=0; i<lotto.length; i++){
			System.out.print(lotto[i]+" ");
		}
		

	}

}
