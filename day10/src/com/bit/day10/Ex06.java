package com.bit.day10;

public class Ex06 {

	   public static void main(String[] args) {
	      //�ֹι�ȣ 000000-0000000
		  char[] su={'0','1','2','3','4','5','6','7','8','9'};
		  char[] han={'��','��','��','��','��','��','��','ĥ','��','��'};
	      java.util.Scanner sc = new java.util.Scanner(System.in);
	      String input=null;
	      int age=0;
	      char gender='��';
	      do{
	         System.out.println("�ֹι�ȣ �Է� > ");
	         input=sc.nextLine();
	         char[] inputArray=input.toCharArray();
	         
	         for(int i=0; i<input.length(); i++){
//	        	 input.charAt(i)
	        	 for(int j=0; j<han.length; j++){
	        		 if(han[j]==inputArray[i]){
	        			 inputArray[i]=su[j]; 			 //������ ���� inputArray[i]=(char)('0'+j);
	        		 }
	        	 }
	         }
	         input=new String(inputArray);
	         System.out.println("�Է��Ͻ� ��ȣ�� "+input);
	         char ch6=input.charAt(6);
	         if(ch6!='-'){
	            
	            continue;
	         }
	         if(input.length()!=14){
	         
	            continue;
	         }
//	         boolean chk=false;
//	         for(int i=0; i<input.length(); i++){
//	            if(i==6){continue;}
//	            if(!Character.isDigit(input.charAt(i))){
//	               chk=true;
//	            }
//	         }
//	         if (chk) {
//	            continue;
//	         }
	         
	         //���� �Ǻ�
	         char ch0=input.charAt(0);
	         char ch1=input.charAt(1);
	         String year="";
	         if(ch0=='0'||ch0=='1'){
	            year="20"+ch0+ch1;
	         }else{
	            year="19"+ch0+ch1;
	         }

	         //���� �Ǻ�
	         char ch7 = input.charAt(7);
	         if(ch7=='1'||ch7=='3'){
	            gender='��';
	         }else if(ch7=='2'||ch7=='4'){
	            
	         }else{
	            continue;// �Է� Ʋ���� �����
	         }
	         
	         age=2019-Integer.parseInt(year)+1;
	         System.out.println("����� "+age+"�� "+gender+"���Դϴ�.");
	         break;
	      }while(true);
	      
	   }
	   
}
	   

