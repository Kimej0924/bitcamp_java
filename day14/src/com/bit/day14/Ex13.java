package com.bit.day14;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex13 {
	
	public static String score (int a, Scanner sc){
		int kor = 0;		int eng = 0;		int math = 0;
		int sum = 0;		double evg = 0;
		String score = " "; 
		System.out.print(a+"���л� �������� > ");
		kor = sc.nextInt() ;
		System.out.print(a+"���л� �������� > ");
		eng = sc.nextInt() ;
		System.out.print(a+"���л� �������� > ");
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

		String menu = "�й�\t|����\t|����\t|����\t|����\t|���";
	
		java.util.Scanner sc = new Scanner(System.in);
		// �л��������� ���α׷� (ver 0.2.0)
		java.util.ArrayList list;
		list = new ArrayList();
		System.out.println("�л��������� ���α׷� (ver 0.2.0)");

		while(true){
			System.out.println("1.�Է�  2.����  3.����  4.����  0.����");
			input = sc.nextInt();
//			Ex13 me = new Ex13();
			
			switch(input){
			case 1:
				cnt++;
				list.add(score(cnt,sc));
				break;

			//����
			case 2:
				System.out.println(menu);
				for(int i=0; i<list.size();i++){
					System.out.println(list.get(i));
				}
				break;
				
			//����	
			case 3:
				System.out.print("������ �л���ȣ�� �Է� > ");
				input = sc.nextInt();


				renum = input-1;
				list.set(renum,score(input,sc));
				break;
			
			//����
			case 4:
				System.out.print("������ �л���ȣ�� �Է� > ");
				input = sc.nextInt();
				renum = input-1;
				list.remove(renum);
			
			//�̿�����	
			case 0:	
				break;
			}

			if(input==0){
				System.out.println("�̿����ּż� �����մϴ�");
				break;
			}
		}//while end
	}//main end
}//class end
