package com.bit.day11;

import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		//�л������������α׷�(ver 0.1.0)	���ڿ�
/* 		1.�Է�  2.����  0.����  > 1
 *  	1���й� ���� > 90
 *  	1���й� ���� > 90 
 *  	1���й� ���� > 90 
 *		1.�Է�  2.����  0.����  > 1
 *  	2���й� ���� > 80
 *  	2���й� ���� > 80 
 *  	2���й� ���� > 80
 *		1.�Է�  2.����  0.����  > 1
 *  	3���й� ���� > 70
 *  	3���й� ���� > 70 
 *  	3���й� ���� > 70
 *		1.�Է�  2.����  0.����  > 2
 *  	�й�	|����	|����	|����	|����	|��� 
 *		1		|90		|90		|90		|90		|90
 *		2		|80		|80		|80		|80		|80
 *		3		|70		|70		|70		|70		|70
 *
 *		1. ���ڿ��� �̿��ؼ� Ǫ�¹��
 *		2. �迭�� �̿��ؼ� Ǫ�¹��
 */
		
		
		System.out.println("�л������������α׷�(ver 0.1.0)");
		int input=0;
		String kor=null;
		String eng=null;
		String math=null;
		String data="�й�\t|����\t|����\t|����\t|����\t|���\n";
		
		int sum = 0;
		double evg = 0;
		int cnt = 1;
		
		
		while(true){
			System.out.print("1.�Է�  2.����  3.����  4.����  0.����  >");
		
			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);
			input = sc.nextInt();
			switch(input){
			
			case 1:
				data = data+cnt+"\t|";
				System.out.print(cnt+"���й� ���� >");
				kor = sc1.nextLine();
				data = data+kor+"\t|";
				System.out.print(cnt+"���й� ���� >");
				eng = sc1.nextLine();
				data = data+eng+"\t|";
				System.out.print(cnt+"���й� ���� >");
				math = sc1.nextLine();
				data = data+math+"\t|";
				sum = Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math);
				data = data+sum+"\t|";				
				evg = sum/3.0;	
				data = data+evg+"\n";					
				cnt++;
				break;
			
			case 2:
				System.out.println(data);
				break;
				
				
			case 3:
				System.out.print("���� �� �й��� �����ϼ��� > ");	
				int reset=sc.nextInt();
				String[] reword=data.split("\n");
				for(int i=0; i<reword.length; i++){
					System.out.print(reword[i]);					
				}
		
				
				
				
				
			case 4:
				
				
			case 0:
				System.out.println("�̿��� �ּż� �����Դ�");			
				break;
			}
		}
		
		
		
	}

	
}
