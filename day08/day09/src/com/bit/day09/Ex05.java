package com.bit.day09;

public class Ex05 {



	int choice = 6;
	static int[] num = new int[45];
	static int[] result = new int[45];
	public static void main(String[] args) {
		// �ڵ� �ζǹ�ȣ ������
		// �ζ� - ����� ���� 8�� 45�� ����� SBS
		// 3���� ���
		// 1. �������� - 
		// 2. ��ü���� -
		// 3. ���̵�� - 

		// 1. 1-45�� 6�� ����(����)
		// 2. �ߺ� X
		// 3. ����
		
		System.out.println("�ڵ� �ζǹ�ȣ �������α׷�");

		while(true){
			System.out.print("1.��ȣ����  2.��÷��ȣ  3.Ȯ��  4.���� >");
			java.util.Scanner sc;
			sc=new java.util.Scanner(System.in);
			int coin=1;	
			int select;
			select =sc.nextInt();

			Ex05 me= new Ex05();

			if(select==1){
				for(int k=0; k<coin; k++){				//insert coin
					me.mixChoice();
					me.sort();
					System.out.println("");
				}
			}
//			for(int i=0; i<6; i++){
//				System.out.println(num[i]);
//			}
			if(select==2){
				System.out.println("----��÷��ȣ-----");
				me.mixChoice();
				me.sort();	
				System.out.println("");
			}	
			
			if(select==3){
				
				System.out.println("������");
			}else if(select==4){
				System.out.println("�����մϴ�");
				break;
			}
		}//while end	
	}// main end
	
	
	public void mixChoice(){

		for(int i=0; i<45; i++){			//�迭������� 1~45�ֱ�
			num[i]= i+1;		
		}
		
		for(int i=0; i<100; i++){			//�迭 number mix
			
			int n = (int)(Math.random()*45)+1;
			int temp = num[0]; 
			num[0] = num[n-1];
			num[n-1] = temp;
		
		}
		
//		for(int i=0; i<choice; i++){		// number 6 choice
//			System.out.print(num[i]+"\t");
//		}
//		System.out.println("");
		
	}// mix and choice end
	
	
	public void sort(){						// ���� �ڸ�����
		int temp;	
		for(int j=0; j<choice; j++){
			for(int i=0; i<choice-1; i++){
				if(num[i]>num[i+1]){
				temp=num[i];
				num[i]=num[i+1];
				num[i+1]=temp;
				}

			}
		}

		for(int i=0; i<choice; i++){
			System.out.print(num[i]+"\t");
		}		
		
		
	}// sort end
}//class end


