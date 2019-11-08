package com.bit.day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// 학생성적관리프로그램(ver.0.3.0)
		Map<String,String> map;
		map = new HashMap<String,String>();
		java.util.Scanner sc = new Scanner(System.in);
		int input;
		int cnt=0;

		String bar = "--------------------------------------------------";
		String menu = bar+"\n학번\t|국어\t|영어\t|수학\t|총점\t|평균\n"+bar;
		System.out.println("학생성적관리프로그램(ver.0.3.0)");
		
		
		do{
			System.out.print("1.입력  2.보기  3.수정  4.삭제  0.종료 >");
			input= sc.nextInt();
			switch(input){

			case 1:
				cnt++;

				System.out.print(cnt+"번학생 국어 > ");	
				int kor= sc.nextInt();
				System.out.print(cnt+"번학생 영어 > ");						
				int eng= sc.nextInt();
				System.out.print(cnt+"번학생 수학 > ");							
				int math= sc.nextInt();
				
				String score=cnt+"\t|"+kor+"\t|"+eng+"\t|"+math;	
				map.put(cnt+"번", score);
				
				break;
				
			case 2:
				java.util.Set<String> stuedents=map.keySet();
				Iterator<String> ite=stuedents.iterator();
				System.out.println(menu);
				while(ite.hasNext()){
					String key=ite.next();
					System.out.print(map.get(key)+"\t");
					System.out.println();
				}
				
				break;
			case 3:

				break;
			case 4:

				break;
			case 0:

				break;




			}

			
		}while(input!=0);

	}

}
