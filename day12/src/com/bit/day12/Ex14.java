package com.bit.day12;

import java.util.Scanner;

public class Ex14 {

	  public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      
	      String data="";
	      //\n1\t|11\t|22\t|33
	      //\n2\t|22\t|24\t|26
	      //\n3\t|72\t|84\t|95
	      String bar="----------------------------------------------";
	      String table=bar+"\n�й�\t����\t����\t����\n"+bar;
	      String menu="1.�Է� 2.���� 3.���� 4.���� 0.����";
	      String title="�л������������α׷�(ver0.1.0)";
	      System.out.println(title);
	      System.out.println(bar);
	      String input=null;
	      int num=0;
	      while(true){
	         System.out.println(menu);
	         input=sc.nextLine();
	         if (input.equals("0")) {
	            break;
	         }else if (input.equals("1")) {
	            num++;
	            System.out.println(num+"�й��������Է�");
	            System.out.print("���� : ");
	            input=sc.nextLine();
	            int kor=Integer.parseInt(input);
	            System.out.print("���� : ");
	            input=sc.nextLine();
	            int eng=Integer.parseInt(input);
	            System.out.print("���� : ");
	            input=sc.nextLine();
	            int math=Integer.parseInt(input);
	            data+="\n"+num+"\t"+kor+"\t"+eng+"\t"+math;
	         }else if (input.equals("2")) {
	            System.out.print(table);
	            System.out.println(data);
	            
	         }else if (input.equals("3")) {
	            System.out.println("����");
	            
	         }else if (input.equals("4")) {
	            System.out.print("������ �й��� �Է��ϼ��� >");
	            input=sc.nextLine();
	            int enter=Integer.parseInt(input)+1;
	            input="\n"+input+"\t|";
	            int start=data.indexOf(input);
	            int end=data.indexOf('\n',start+1);
	            String target = null;
	            try{
	            	target=data.substring(start,end);
	            }catch(StringIndexOutOfBoundsException e){
	            	target=data.substring(start);
	            }
	            data=data.replace(target,"");
	         }
	         
	         
	         
	      }
	      System.out.println("�̿����ּż� �����մϴ�.");
	   }
}

