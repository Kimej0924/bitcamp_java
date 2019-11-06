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
				System.out.println("신상들여");
				sc=new Scanner(System.in);
			}
		try{
			System.out.print("숫자 >");
			su=sc.nextInt();
			System.out.println("수는 "+su);
		}catch(java.util.InputMismatchException e){
			System.out.println("스캐너나갔어 새로적어");
			
			sc=new Scanner(System.in);
		}
		}
	}

}
