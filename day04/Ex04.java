/*  while�� Ȱ��
Q1. 1~10������ ���� ���Ͻÿ�.

Q2. 10~50�� ¦������ ���� ���Ͻÿ�.

Q3. 1+3+5+7+9=25�� ����Ͻÿ�.

Q4. 1~50�� 3�� ����� ����Ͻÿ�.

Q5. 2�� 1����, 2�� 2����, 2�� 3����, 2�� 4����, 2�� 5������ ����Ͻÿ�.
*/

class Ex04{
	
public static void main(String[] args){
     //Q1. 1~10������ ���� ���Ͻÿ�.
	int su1 = 1;
	int sum1 = 0;
	while(su1<=10){
		//System.out.println(su1);
		sum1+=su1;
		su1++;
	}
	System.out.println("\n Q1. 1~10������ ����? "+sum1);
	System.out.println("-------------------------------\n");

     //Q2. 10~50�� ¦������ ���� ���Ͻÿ�.
	int su2 = 10;
	int sum2 = 0;
	while(su2<=50){
		if(su2%2==0){	//System.out.println(su2);
			sum2+=su2;
		}
		su2++;
	}
	System.out.println(" Q2. 10~50�� ¦������ ����? "+sum2);
	System.out.println("-------------------------------\n");

     //Q3. 1+3+5+7+9=25�� ����Ͻÿ�.
	System.out.print(" Q3. ");
	int su3 = 1;
	int sum3 = 0;
	while(su3<=9){
		if(su3%2!=0){	
			sum3+=su3;
			System.out.print(su3);
		}else{
			System.out.print("+");	//¦����ġ�� ���ϱⰡ���°ͻ�
		}
		su3++;
	}
	System.out.println(" = "+sum3);
	System.out.println("-------------------------------\n");

     //Q4. 1~50�� 3�� ����� ����Ͻÿ�.
	System.out.print(" Q4. ");
	int a,b;
	a = 1;
	b = 50;
	while(a!=b+1){
		if(a%3==0){	
			System.out.print(a+"  ");
		}
		a++;
	}

	System.out.println("\n-------------------------------\n");

     //Q5. 2�� 1����, 2�� 2����, 2�� 3����, 2�� 4����, 2�� 5������ ����Ͻÿ�.
	System.out.print(" Q5. ");
	
	int temp, cnt;
	temp = 1;
	cnt=0;
	while(cnt<5){
		temp+=temp;
		System.out.print(temp+"  ");
		cnt++;
	}






}//main end

}//class end