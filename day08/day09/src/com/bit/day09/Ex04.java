package com.bit.day09;

public class Ex04 {

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
		int coin;
		int ran;
		int[] num = new int[6];
		int max = 6;
		
		System.out.print("������ Ƚ���� �����ϼ���(�ִ�5) > ");
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		coin = sc.nextInt();
		Ex04 me = new Ex04();
		int a, b, c, d, e, f;

		
		
		for(int k=0; k<coin; k++){
			for(int i=0; i<max; i++){
				ran = (int)(Math.random()*45)+1;		//������ �̱�
				num[i]=ran;

		
				for(int j=0; j<i; j++){
					if(num[i]==num[j]){				//�ߺ�����
						i--;
						break;
					}
				}	
			}
			System.out.println();
			
//			for(int i=0; i<num.length; i++){
//			System.out.print(num[i]+"\t");			//������ �� 6�� ��� 
//			}

			a=num[0];	b=num[1];	c=num[2];	d=num[3];	e=num[4];	f=num[5];
			me.sort(a, b, c, d, e, f);
				
		}	
	
	// ��÷ ��ȣ �̾ƺ���
		
		System.out.println("\n\n----------------��÷��ȣ-------------------");		

		for(int i=0; i<max; i++){
			ran = (int)(Math.random()*45)+1;		//������ �̱�
			num[i]=ran;

	
			for(int j=0; j<i; j++){
				if(num[i]==num[j]){				//�ߺ�����
					i--;
					break;
				}
			}			
		}
		
//		for(int i=0; i<num.length; i++){
//		System.out.print(num[i]+"\t");			//������ �� 6�� ��� 
//		}		

		a=num[0];	b=num[1];	c=num[2];	d=num[3];	e=num[4];	f=num[5];
		me.sort(a, b, c, d, e, f);

	}//main end
	
	
	public void sort(int a, int b, int c, int d, int e, int f){
		for(int i=1; i<46; i++){
			if(a==i){System.out.print(a+"\t");}
			if(b==i){System.out.print(b+"\t");}
			if(c==i){System.out.print(c+"\t");}
			if(d==i){System.out.print(d+"\t");}
			if(e==i){System.out.print(e+"\t");}
			if(f==i){System.out.print(f+"\t");}			
		}		
		
	}//sort end

}//class end
