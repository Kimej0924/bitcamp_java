/*
���� ���� �� ����(ver 0.0.1)

1.���� 2.���� 3.�� 0.����   > 1
com : ����,	you : ����
�����ϴ�.

1.���� 2.���� 3.�� 0.����   > 2
com : ����,	you : ����
�����ϴ�.

1.���� 2.���� 3.�� 0.����   > 0
�̿����ּż� �����մϴ�.
/////////////////////////////
��00ȸ  �·� 00%(0��0��0��)
/////////////////////////////
*/

class Ex12{
  public static void main(String[] args){
	java.util.Scanner sc = new java.util.Scanner(System.in);	//�Է¹����غ�
	System.out.println("���� ���� �� ����(ver 0.0.1)");
	
	int win=0;
	int draw=0;
	int lose=0;
	int total=0;
	double rate=0;
	while(true){
		System.out.print("1.���� 2.���� 3.�� 0.����  > ");
		int su = sc.nextInt();						//�Է¹ޱ�
		int com = (int)(Math.random()*3)+1;
		String comStr="", suStr="";

			if(su==1||su==2||su==3){
				if(com==1){
					comStr="����";
				}else if(com==2){
					comStr="����";
				}else{
					comStr="��";
				}
				
				if(su==1){
					suStr="����";
				}else if(su==2){
					suStr="����";
				}else if(su==3){
					suStr="��";
				}
				System.out.println("com : "+comStr+"\t you : "+suStr);
				
				if((su==1&&com==3)||(su==2&&com==1)||(su==3&&com==2)){
					System.out.println("�̰���ϴ�.");
					win++;
				}else if(su==com){
					System.out.println("�����ϴ�.");
					draw++;				
				}else{
					System.out.println("�����ϴ�.");
					lose++;	
				}
					
			}
	
			if(su>3){
				System.out.println("�ٽ��Է¹ٶ��ϴ�.");							
			}else if(su==0){
					
				System.out.println("�̿����ּż� �����մϴ�.");
				System.out.println("///////////////////////////////");
				total= win+draw+lose;
				rate = (int)win*100/total;
				System.out.print("��"+total+"ȸ ");				
				System.out.print("�·�"+rate+"%");				
				System.out.println("("+win+"��"+draw+"��"+lose+"��"+")");
				System.out.println("///////////////////////////////");	
				break;
			}			

	
	}// while end

  }// main end

  

}// class end