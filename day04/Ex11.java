/* 반복문쓰세요

Q1. 1~100까지의 합을 구하시오

Q2. 다음을 출력하시오
	1 3 5 7 9
Q3. 다음을 출력하시오
	2의1승 2의2승 2의 3승 2의4승 2의5승
Q4. 다음을 출력하시오
	2+4+6+8+10
Q5. 다음을 출력하시오
	2+4+6+8+10=000
*/
class Ex11{

public static void main(String[] args){

	System.out.println("Q1. 1~100까지의 합을 구하시오");
	int sum=0;
	for(int i=1;i<=100;i++){
		sum = sum+i;
	}
	System.out.println(sum);	
	
	System.out.println("---------------------------");

	System.out.println("Q2.");
	for(int i=1;i<10;i++){
		if(i%2!=0){
		System.out.print(i+"  ");
		}
	}
	System.out.println("\n---------------------------");

	System.out.println("Q3.");
	int q3 = 1;
	for(int i=1; i<=5; i++){
		q3 *= 2;
		
	}
	System.out.println(q3);	
	System.out.println("---------------------------");

	System.out.println("Q4.");
	for(int i=1; i<=4; i++){
		System.out.print(2*i+"+");		
	}
	for(int i=5; i<=5; i++){
		System.out.print(2*i);		
	}
	System.out.println("\n---------------------------");
	
	System.out.println("Q5.");
	int q5=0;
	for(int i=1; i<=4; i++){
		System.out.print(2*i+"+");		
	}
	for(int i=5; i<=5; i++){
		System.out.print(2*i+"=");	
	}	
	for(int i=1;i<=5;i++){
		q5 = q5+(2*i);
	}
	System.out.println(q5);




}// main end

}// class end