class Receipt1{

	public static void main(String[] args){
	
		String title = "\n비트편의점\n------------\n\n";

		int item1 = 900;
		int item2 = 3500;
		int item3 = 2000;		//제품단가

		int su1 = 2;
		int su2 = 1;
		int su3 =	3;		//구매수량

		int sum1 = item1*su1;
		int sum2 = item2*su2;
		int sum3 = item3*su3;
		int totalSum = sum1+sum2+sum3;	//합계

		System.out.println(title);
		System.out.println("제품\t|단가\t|수량\t|합계");
		System.out.println("-----------------------------------");
		System.out.println("생수\t|"+item1+"\t|"+su1+"\t|"+sum1);
		System.out.println("바나나\t|"+item2+"\t|"+su2+"\t|"+sum2);
		System.out.println("우유\t|"+item3+"\t|"+su3+"\t|"+sum3);
		System.out.println("-----------------------------------");
		System.out.println("합계\t|\t\t"+totalSum+"원");
	
	
	

	}//main end

}//class end