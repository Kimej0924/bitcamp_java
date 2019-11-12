package com.bit.day16;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 성적관리프로그램(ver 0.4.0)
		// use StringBuffer Class
		// 1.입력 2.보기 3.수정 4.삭제 0.종료>
		
		java.util.Scanner sc = new Scanner(System.in);
		StringBuffer st1 = new StringBuffer();
		StringBuffer st2 = new StringBuffer();
		String title = "성적관리프로그램(ver 0.4.0)";
		String bar = "---------------------------------";
		String menu = "1.입력  2.보기  3.수정  4.삭제  0.종료 >";
		String name = "학번\t|국어\t|영어\t|수학\t";
		String[] subject={"국어", "영어", "수학"};
		
		int input =0;
		int cnt=19000;
				
		System.out.println(title);
		System.out.println(bar);
		
		while(true){
			System.out.print(menu);
			input = sc.nextInt();
			if(input==0){break;}
			if(input==1){
				cnt++;
				st1.append(cnt);
				for(int i=0; i<subject.length; i++){
					System.out.print(cnt+"번 학생"+subject[i]+" > ");
					input=sc.nextInt();					
					st1.append("\t|");
					st1.append(input);
				}
				st1.append("\n");
//				System.out.println(st1);
				
				continue;
			}
			if(input==2){
				System.out.println(bar);
				System.out.println(name);
				System.out.println(bar);
				System.out.println(st1);
				continue;
			}
			if(input==3){
				System.out.print("수정할 학번 >");
				input = sc.nextInt();
				int idx=st1.indexOf("\n"+input+"\t|");
				int end=st1.indexOf("\n",idx+1);
				String str="\n"+input;
				for(int i=0; i<subject.length; i++){
					System.out.print(subject[i]+" > ");
					input=sc.nextInt();
					
					str+="\t|"+input;
				}
				st1.replace(idx, end, str);
				continue;
				
				

			}
			if(input==4){
				System.out.print("삭제할 학번 > ");
				input = sc.nextInt();
				int idx=st1.indexOf("\n"+input+"\t|");
				int end=st1.indexOf("\n",idx+1);
				st1.delete(idx, end);
			
			}else{
				System.out.println("잘못입력했어요 다시입력하세요");
				continue;
			}
		}
		System.out.println("이용해주셔서 감사합니다");
	}

}
