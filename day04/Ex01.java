class Ex01{

public static void main(String[] args){
	// Q1. 1~100������ ���� ���ϼ���
	int sum = 0;
	for(int i=1; i<=100; i++){
		sum+=i;
	}
	System.out.println("1~100������ ����?"+sum);
	System.out.println("-------------------------");

	// Q2. ������ ����Ͻÿ�
	// 	1 3 5 7 9
	
	for(int i=1; i<=9; i+=2){
		System.out.print(i+" ");
	}
	System.out.println();
	for(int i=0; i<5; i++){
		// 1(1+2*0) 3(1+2*1) 5(1+2*2) 7(1+2*3) 9(1+2*4)
		System.out.print(1+2*i+" ");
	}
	System.out.println();
	for(int i=0; i<10; i++){
		if(i%2!=0){
		System.out.print(i+" ");
		}
	}	
	System.out.println();	
	System.out.println("-------------------------");

	// Q3. ������ ����Ͻÿ�
	//	2��1�� 2��2�� 2�� 3�� 2��4�� 2��5��
	//2	2*2	2*2*2	2*2*2*2		2*2*2*2*2
	//1*2	1*2*2	1*2*2*2	1*2*2*2*2	1*2*2*2*2*2
	for(int j=1; j<=5; j++){
		int temp = 1;
		for(int i=0; i<j; i++){
			temp =temp*2;	
		}
		System.out.print(temp+" ");
	}
	System.out.println();
	int su = 1;
	for(int i=1; i<=5; i++){
		su =su*2;	
		System.out.print(su+"  ");
	}	
	System.out.println();
	int a = 1;
	for(int i=0; i<5; i++){
		a=a+a;		//a+=a�� ����
		System.out.print(a+" ");
	}
	System.out.println();	
	System.out.println("-------------------------");

	//Q4. ������ ����Ͻÿ�
	//	2+4+6+8+10
	int sum2=0;
	for(int i=2; i<=10; i+=2){
		sum2+=i;
		System.out.print(i);
		if(i!=10){System.out.print("+");}
	}
	System.out.println("="+sum2);
	System.out.println("\n-------------------------");
	int sum3=0;
	int limit=100;
	int start=90;
	boolean boo=false;
	for(int i=start; i<=limit; i++){
		if(i%2==0){
			if(boo){
			System.out.print("+");
			}else{
			boo=true;
			}
			sum3+=i;
			System.out.print(i);
		}
	
	}
	System.out.println("="+sum3);



}//main end

}//class end