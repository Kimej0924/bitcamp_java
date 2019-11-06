package com.bit.day11;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		//학생성적관리프로그램(ver 0.1.1)	배열
/*		총인원>3
 * 		1.입력  2.보기  0.종료  > 1
 *  	1번학번 국어 > 90
 *  	1번학번 영어 > 90 
 *  	1번학번 수학 > 90 
 *		1.입력  2.보기  0.종료  > 1
 *  	2번학번 국어 > 80
 *  	2번학번 영어 > 80 
 *  	2번학번 수학 > 80
 *		1.입력  2.보기  0.종료  > 1
 *  	3번학번 국어 > 70
 *  	3번학번 영어 > 70 
 *  	3번학번 수학 > 70
 *		1.입력  2.보기  > 2
 *  	학번	|국어	|영어	|수학	|총점	|평균 
 *		1		|90		|90		|90		|90		|90
 *		2		|80		|80		|80		|80		|80
 *		3		|70		|70		|70		|70		|70
 *
 *		1. 문자열을 이용해서 푸는방법
 *		2. 배열을 이용해서 푸는방법
 */

		System.out.println("학생성적관리프로그램(ver 0.1.1)");
		int input=0;
		String kor=null;
		String eng=null;
		String math=null;
		String data="학번\t|국어\t|영어\t|수학\t|총점\t|평균";
		String[] arr=null;
		arr = new String[3];
		int sum = 0;
		double evg = 0;
		int cnt = 0;

		do{
			System.out.print("1.입력  2.보기  0.종료  >");
		
			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);
			input = sc.nextInt();
			switch(input){
			
			case 1:
				
				arr[cnt] = (cnt+1)+"\t|";
				System.out.print((cnt+1)+"번학번 국어 >");
				kor = sc1.nextLine();
				arr[cnt] = arr[cnt]+kor+"\t|";
				System.out.print((cnt+1)+"번학번 영어 >");
				eng = sc1.nextLine();
				arr[cnt] = arr[cnt]+eng+"\t|";
				System.out.print((cnt+1)+"번학번 수학 >");
				math = sc1.nextLine();
				arr[cnt] = arr[cnt]+math+"\t|";
				sum = Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math);
				arr[cnt] = arr[cnt]+sum+"\t|";				
				evg = sum*100/3/100.0;	
				arr[cnt] = arr[cnt]+evg+"\n";					
				cnt++;
				break;
			
			case 2:
				System.out.println(data);
				for(int i=0; i<cnt; i++){
				System.out.print(arr[i]);
				}
				break;
				
			case 0:
				System.out.println("이용해 주셔서 감사함다");			
				return;
			}
		}while(true);
		
		
		
	}

	
}