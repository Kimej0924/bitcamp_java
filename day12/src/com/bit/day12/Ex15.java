package com.bit.day12;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// �л������������α׷�(ver 0.1.0)
		Scanner sc;
		sc = new Scanner(System.in);
		String title = "�л������������α׷�(ver 0.1.0)";
		String bar = "-";
		for(int i=0; i<title.length()*3; i++){
			bar+="-";
		}
		
		String input=null;	//�Է��ϴ°�
		int num = 0;	//�й�
		String menu;
			menu="�й�\t|����\t|����\t|����\t|��Ž\t|�հ�\t|���\n"+bar;
		String data="";
		while(true){
			System.out.println("1.�Է�  2.����  3.����  4.����  0.����  >");
			input=sc.nextLine();
			if(input.equals("0")){
				break;
			}else if(input.equals("1")){
				num++;
				data+=num+"\t|";
				System.out.print(num+"�� ���������¿� > ");
				input=sc.nextLine();
				int kor = Integer.parseInt(input);
				data+=kor+"\t|";
				System.out.print(num+"�� ���������¿� > ");
				input=sc.nextLine();
				int eng = Integer.parseInt(input);
				data+=eng+"\t|";
				System.out.print(num+"�� ���������¿� > ");
				input=sc.nextLine();
				int math = Integer.parseInt(input);
				data+=math+"\t|";
				System.out.print(num+"�� ��Ž�����¿� > ");
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
				System.out.println("������ �л��� ��ȣ�� �Է��ϼ���");
			}else if(input.equals("4")){

			}else{
				System.out.println("�ٽô���");
			}
		}//while end
		System.out.println("���̳����");
	}

}
