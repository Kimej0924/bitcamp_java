package com.bit.day12;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver 0.1.0)
		Scanner sc;
		sc = new Scanner(System.in);
		String title = "학생성적관리프로그램(ver 0.1.0)";
		String bar = "-";
		for(int i=0; i<title.length()*3; i++){
			bar+="-";
		}
		
		String input=null;	//입력하는값
		int num = 0;	//학번
		String menu;
			menu="학번\t|국어\t|영어\t|수학\t|과탐\t|합계\t|평균\n"+bar;
		String data="";
		while(true){
			System.out.println("1.입력  2.보기  3.수정  4.삭제  0.종료  >");
			input=sc.nextLine();
			if(input.equals("0")){
				break;
			}else if(input.equals("1")){
				num++;
				data+=num+"\t|";
				System.out.print(num+"번 국어점수는요 > ");
				input=sc.nextLine();
				int kor = Integer.parseInt(input);
				data+=kor+"\t|";
				System.out.print(num+"번 영어점수는요 > ");
				input=sc.nextLine();
				int eng = Integer.parseInt(input);
				data+=eng+"\t|";
				System.out.print(num+"번 수학점수는요 > ");
				input=sc.nextLine();
				int math = Integer.parseInt(input);
				data+=math+"\t|";
				System.out.print(num+"번 과탐점수는요 > ");
				input=sc.nextLine();
				int sci = Integer.parseInt(input);
				data+=sci+"\t|";
				
				int sum = kor+eng+math+sci;
				double evg = sum*100/4/100.0;
				
				data += sum+"\t|"+evg+"\n";
				System.out.println(data);
				
				
			}else if(input.equals("2")){
				System.out.println(menu);
				System.out.println(data);
			}else if(input.equals("3")){
				System.out.println("수정할 학생의 번호를 입력하세요");
			}else if(input.equals("4")){

			}else{
				System.out.println("다시눌러");
			}
		}//while end
		System.out.println("끝이났어요");
	}

}
