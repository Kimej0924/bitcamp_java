package com.bit.day11;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		//�л������������α׷�(ver 0.1.1)	�迭
/*		���ο�>3
 * 		1.�Է�  2.����  0.����  > 1
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
 *		1.�Է�  2.����  > 2
 *  	�й�	|����	|����	|����	|����	|��� 
 *		1		|90		|90		|90		|90		|90
 *		2		|80		|80		|80		|80		|80
 *		3		|70		|70		|70		|70		|70
 *
 *		1. ���ڿ��� �̿��ؼ� Ǫ�¹��
 *		2. �迭�� �̿��ؼ� Ǫ�¹��
 */

		System.out.println("�л������������α׷�(ver 0.1.1)");
		int input=0;
		String kor=null;
		String eng=null;
		String math=null;
		String data="�й�\t|����\t|����\t|����\t|����\t|���";
		String[] arr=null;
		arr = new String[3];
		int sum = 0;
		double evg = 0;
		int cnt = 0;

		do{
			System.out.print("1.�Է�  2.����  0.����  >");
		
			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);
			input = sc.nextInt();
			switch(input){
			
			case 1:
				
				arr[cnt] = (cnt+1)+"\t|";
				System.out.print((cnt+1)+"���й� ���� >");
				kor = sc1.nextLine();
				arr[cnt] = arr[cnt]+kor+"\t|";
				System.out.print((cnt+1)+"���й� ���� >");
				eng = sc1.nextLine();
				arr[cnt] = arr[cnt]+eng+"\t|";
				System.out.print((cnt+1)+"���й� ���� >");
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
				System.out.println("�̿��� �ּż� �����Դ�");			
				return;
			}
		}while(true);
		
		
		
	}

	
}