package com.bit.day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// �л������������α׷�(ver.0.3.0)
		Map<String,String> map;
		map = new HashMap<String,String>();
		java.util.Scanner sc = new Scanner(System.in);
		int input;
		int cnt=0;

		String bar = "--------------------------------------------------";
		String menu = bar+"\n�й�\t|����\t|����\t|����\t|����\t|���\n"+bar;
		System.out.println("�л������������α׷�(ver.0.3.0)");
		
		
		do{
			System.out.print("1.�Է�  2.����  3.����  4.����  0.���� >");
			input= sc.nextInt();
			switch(input){

			case 1:
				cnt++;

				System.out.print(cnt+"���л� ���� > ");	
				int kor= sc.nextInt();
				System.out.print(cnt+"���л� ���� > ");						
				int eng= sc.nextInt();
				System.out.print(cnt+"���л� ���� > ");							
				int math= sc.nextInt();
				
				String score=cnt+"\t|"+kor+"\t|"+eng+"\t|"+math;	
				map.put(cnt+"��", score);
				
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
