class Receipt{

	public static void main(String[] args){
	
		System.out.println("\n비트편의점\n------------\n\n");

		System.out.println("제품	|단가	|수량	|합계	");
		System.out.println("-----------------------------------");

		int water = 900;
		int banana = 3500;
		int milk = 2000;

		int w1 = 2;
		int b1 = 1;
		int m1 =	3;

		int sum1 = water*w1;
		int sum2 = banana*b1;
		int sum3 = milk*m1;
		int totalSum = sum1+sum2+sum3;

		System.out.println("생수\t|"+water+"\t|"+w1+"\t|"+sum1);
		System.out.println("바나나\t|"+banana+"\t|"+b1+"\t|"+sum2);
		System.out.println("우유\t|"+milk+"\t|"+m1+"\t|"+sum3);

		System.out.println("-----------------------------------");

		System.out.println("합계\t|\t\t"+totalSum+"원");
	
	
	

	}//main end

}//class end