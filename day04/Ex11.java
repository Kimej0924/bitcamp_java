/* �ݺ���������

Q1. 1~100������ ���� ���Ͻÿ�

Q2. ������ ����Ͻÿ�
	1 3 5 7 9
Q3. ������ ����Ͻÿ�
	2��1�� 2��2�� 2�� 3�� 2��4�� 2��5��
Q4. ������ ����Ͻÿ�
	2+4+6+8+10
Q5. ������ ����Ͻÿ�
	2+4+6+8+10=000
*/
class Ex11{

public static void main(String[] args){

	System.out.println("Q1. 1~100������ ���� ���Ͻÿ�");
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