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

class Ex11{
  public static void main(String[] args){
	java.util.Scanner sc = new java.util.Scanner(System.in);	//�Է¹����غ�
	System.out.println("���� ���� �� ����(ver 0.0.1)");
	while(true){
		System.out.print("1.���� 2.���� 3.�� 0.����  > ");
		int su = sc.nextInt();						//�Է¹ޱ�

			if(su==1||su==2||su==3){
				
				String c = func0(su);
				System.out.println(c);
			}
	
			if(su>3){
				System.out.println("�ٽ��Է¹ٶ��ϴ�.");							
			}else if(su==0){
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}			

	
	}// while end

  }// main end

   public static void func0(int su){		// su�� 1~3�� ���� �޾����� ����
		int com = (int)(Math.random()*3)+1;
		
		System.out.println("com : "+com+",\t you : "+su+"\n");
	/*	if(su==1){
			func1();
		}
		if(su==2){
			func2();	
		}
		if(su==3){
			func3();							
		}
	*/
	
   }// func1 end


   public static int func1(int su, int com){		// su = 1 ��������
		int c = 0;
		if(com==1){
			System.out.println("�̰���ϴ�");
		}
		if(com==2){
			System.out.println("�����ϴ�");	
		}
		if(com==3){
			System.out.println("�����ϴ�");							
		}
		return c;	

   }// func1 end

   public static int func2(int su, int com){		// su = 2 �������
		
		int c = 0;
		if(com==1){
			System.out.println("�̰���ϴ�");
		}
		if(com==2){
			System.out.println("�����ϴ�");	
		}
		if(com==3){
			System.out.println("�����ϴ�");							
		}
		return c;
	
   }// func2 end

   public static int func3(int su, int com){		// su = 3 ��������
		
		int c = 0;		
		if(com==1){
			System.out.println("�̰���ϴ�");
		}
		if(com==2){
			System.out.println("�����ϴ�");	
		}
		if(com==3){
			System.out.println("�����ϴ�");							
		}
		return c;
   }// func3 end



}// class end