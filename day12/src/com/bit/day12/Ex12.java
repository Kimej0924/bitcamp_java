package com.bit.day12;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner(System.in);
		int su=-1;
		int cnt=0;
		String msg=null;
		while(true){
			cnt++;
			if(cnt==10){
				cnt=0;
				System.out.println("�Ż�鿩");
				sc=new Scanner(System.in);
			}
		try{
			System.out.print("���� >");
			su=sc.nextInt();
			System.out.println("���� "+su);
		}catch(java.util.InputMismatchException e){
			System.out.println("��ĳ�ʳ����� ��������");
			
			sc=new Scanner(System.in);
		}
		}
	}

}
