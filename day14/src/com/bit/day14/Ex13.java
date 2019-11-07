package com.bit.day14;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex13 {
	
	public static String score (int a, Scanner sc){
		int kor = 0;		int eng = 0;		int math = 0;
		int sum = 0;		double evg = 0;
		String score = " "; 
		System.out.print(a+"번학생 국어점수 > ");
		kor = sc.nextInt() ;
		System.out.print(a+"번학생 영어점수 > ");
		eng = sc.nextInt() ;
		System.out.print(a+"번학생 수학점수 > ");
		math = sc.nextInt() ;
		
		sum = kor+eng+math;
		evg = sum*100/3/100.0;
		score =a+"\t|"+kor+"\t|"+eng+"\t|"+math+"\t|"+sum+"\t|"+evg;
		return score;
	}
	
	public static void main(String[] args) {
		int input = 0;
		int renum = 0;
		int cnt = 0;

		String menu = "학번\t|국어\t|영어\t|수학\t|총점\t|평균";
	
		java.util.Scanner sc = new Scanner(System.in);
		// 학생성적관리 프로그램 (ver 0.2.0)
		java.util.ArrayList list;
		list = new ArrayList();
		System.out.println("학생성적관리 프로그램 (ver 0.2.0)");

		while(true){
			System.out.println("1.입력  2.보기  3.수정  4.삭제  0.종료");
			input = sc.nextInt();
//			Ex13 me = new Ex13();
			
			switch(input){
			case 1:
				cnt++;
				list.add(score(cnt,sc));
				break;

			//보기
			case 2:
				System.out.println(menu);
				for(int i=0; i<list.size();i++){
					System.out.println(list.get(i));
				}
				break;
				
			//수정	
			case 3:
				System.out.print("수정할 학생번호를 입력 > ");
				input = sc.nextInt();


				renum = input-1;
				list.set(renum,score(input,sc));
				break;
			
			//삭제
			case 4:
				System.out.print("삭제할 학생번호를 입력 > ");
				input = sc.nextInt();
				renum = input-1;
				list.remove(renum);
			
			//이용종료	
			case 0:	
				break;
			}

			if(input==0){
				System.out.println("이용해주셔서 감사합니다");
				break;
			}
		}//while end
	}//main end
}//class end
