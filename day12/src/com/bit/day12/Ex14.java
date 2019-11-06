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
	      String table=bar+"\n학번\t국어\t영어\t수학\n"+bar;
	      String menu="1.입력 2.보기 3.수정 4.삭제 0.종료";
	      String title="학생성적관리프로그램(ver0.1.0)";
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
	            System.out.println(num+"학번데이터입력");
	            System.out.print("국어 : ");
	            input=sc.nextLine();
	            int kor=Integer.parseInt(input);
	            System.out.print("영어 : ");
	            input=sc.nextLine();
	            int eng=Integer.parseInt(input);
	            System.out.print("수학 : ");
	            input=sc.nextLine();
	            int math=Integer.parseInt(input);
	            data+="\n"+num+"\t"+kor+"\t"+eng+"\t"+math;
	         }else if (input.equals("2")) {
	            System.out.print(table);
	            System.out.println(data);
	            
	         }else if (input.equals("3")) {
	            System.out.println("수정");
	            
	         }else if (input.equals("4")) {
	            System.out.print("삭제할 학번을 입력하세요 >");
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
	      System.out.println("이용해주셔서 감사합니다.");
	   }
}

