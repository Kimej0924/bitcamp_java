/*  while문 활용
Q1. 1~10까지의 합을 구하시오.

Q2. 10~50의 짝수들의 합을 구하시오.

Q3. 1+3+5+7+9=25를 출력하시오.

Q4. 1~50중 3의 배수를 출력하시오.

Q5. 2의 1제곱, 2의 2제곱, 2의 3제곱, 2의 4제곱, 2의 5제곱을 출력하시오.
*/

class Ex04{
	
public static void main(String[] args){
     //Q1. 1~10까지의 합을 구하시오.
	int su1 = 1;
	int sum1 = 0;
	while(su1<=10){
		//System.out.println(su1);
		sum1+=su1;
		su1++;
	}
	System.out.println("\n Q1. 1~10까지의 합은? "+sum1);
	System.out.println("-------------------------------\n");

     //Q2. 10~50의 짝수들의 합을 구하시오.
	int su2 = 10;
	int sum2 = 0;
	while(su2<=50){
		if(su2%2==0){	//System.out.println(su2);
			sum2+=su2;
		}
		su2++;
	}
	System.out.println(" Q2. 10~50의 짝수들의 합은? "+sum2);
	System.out.println("-------------------------------\n");

     //Q3. 1+3+5+7+9=25를 출력하시오.
	System.out.print(" Q3. ");
	int su3 = 1;
	int sum3 = 0;
	while(su3<=9){
		if(su3%2!=0){	
			sum3+=su3;
			System.out.print(su3);
		}else{
			System.out.print("+");	//짝수위치에 더하기가들어가는것뿐
		}
		su3++;
	}
	System.out.println(" = "+sum3);
	System.out.println("-------------------------------\n");

     //Q4. 1~50중 3의 배수를 출력하시오.
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

     //Q5. 2의 1제곱, 2의 2제곱, 2의 3제곱, 2의 4제곱, 2의 5제곱을 출력하시오.
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