package com.bit.day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exre13 {

	public static void main(String[] args) {
		// �л������������α׷�(ver.0.3.0)
		ArrayList data = new ArrayList();
		Scanner sc = new Scanner(System.in);
		String title = "�л������������α׷�(ver.0.3.0)";
		String bar = "--------------------------------------------------";
		String menu = "�й�\t|����\t|����\t|����\t|����\t|���";
		String input=null;
		int su = -1;
		int cnt = 3;
		int num = 19000;
		System.out.println(bar);
		System.out.println(title);
		System.out.println(bar);
		
		while(true){
			try{
			System.out.println("1.�Է�  2.����  3.����  4.����  0.����");
			input=sc.nextLine();
			su=Integer.parseInt(input);
			}catch(NumberFormatException e){
				if(cnt==0){break;}
				System.out.println("���ڸ� �Է��ϼ���");
				cnt--;
				continue;
			}
			if(su==0){break;}
			else if(su==1){
				num++;
				data.add(num);
				System.out.print("����>");
				input=sc.nextLine();
				su=Integer.parseInt(input);
				data.add(su);
				System.out.print("����>");
				input=sc.nextLine();
				su=Integer.parseInt(input);
				data.add(su);
				System.out.print("����>");
				input=sc.nextLine();
				su=Integer.parseInt(input);
				data.add(su);

			}
			else if(su==2){
				System.out.println(bar);
				System.out.println(menu);
				System.out.println(bar);
				for(int i=0; i<data.size(); i+=4){
					System.out.print(data.get(i));
					System.out.print("\t|");
					System.out.print(data.get(i+1));
					System.out.print("\t|");
					System.out.print(data.get(i+2));
					System.out.print("\t|");
					System.out.println(data.get(i+3));
				}
//				for(int i=0; i<data.size(); i++){
//					System.out.print(data.get(i++));
//					System.out.print("\t|");
//					System.out.print(data.get(i++));
//					System.out.print("\t|");
//					System.out.print(data.get(i++));
//					System.out.print("\t|");
//					System.out.println(data.get(i));
//					
//					
//				}
			}
			else if(su==3){
				System.out.println("������ �й�>");
				input=sc.nextLine();
				su=Integer.parseInt(input);
				int idx=data.indexOf(su);	

				System.out.print("����>");
				input=sc.nextLine();
				su=Integer.parseInt(input);
				data.remove(idx+1);
				data.add(idx+1,su);
				System.out.print("����>");
				input=sc.nextLine();
				su=Integer.parseInt(input);
				data.remove(idx+2);
				data.add(idx+2,su);
				System.out.print("����>");
				input=sc.nextLine();
				su=Integer.parseInt(input);
				data.remove(idx+3);
				data.add(idx+3,su);



			}

			else if(su==4){
				System.out.println("������ �й�>");
				input=sc.nextLine();
				su=Integer.parseInt(input);
				int idx=data.indexOf(su);
				data.remove(idx);
				data.remove(idx);
				data.remove(idx);
				data.remove(idx);
//				for(int i=0; i<4; i++){
//					data.remove(idx);
//				}
			}

			else{
				cnt--;
				System.out.println("0~4������ ���ڸ� �ٽ� �Է��ϼ���");
			}
		}
		System.out.println("�����ߴ� ���");

	}

}
