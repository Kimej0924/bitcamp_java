package com.bit;
/*
Q1. 1~20까지 중, 배열을 이용해 짝수를 출력하시오
Q2. 1~20까지 중, 배열을 이용해 3의배수를 출력하시오
Q3. A~Z까지를 배열에 담아 출력하시오 
Q4. 배열을 이용하여 다음을 출력하시오
	*
	**
	***
	****
Q5. 배열을 이용하여 다음을 출력하시오
	a
	bc
	def
	ghij
Q6. 절대값을 구하는 메서드를 만드세요
Q7. sort(int a, int b, int c)을 만드시고
	a=7, b=3, c=5 출력을 3<5<7
Q8. int[] arr={7,3,5}를 arr={3,5,7}로 만드시오
*/

class Ex08{

  public static void main(String[] args){

	System.out.println("Q1. 1~20까지 중, 배열을 이용해 짝수를 출력하시오");

	int[] arrQ1 = new int[20];
	for(int i=0; i<arrQ1.length; i++){
		arrQ1[i]=1+i;
		if(arrQ1[i]%2==0){
			System.out.print(arrQ1[i]+" ");
		}
	}
	System.out.println();
	System.out.println("===============================================\n");


	System.out.println("Q2. 1~20까지 중, 배열을 이용해 3의배수를 출력하시오");
	
	int[] arrQ2 = new int[20];
	for(int i=0; i<arrQ2.length; i++){
		arrQ2[i]=1+i;
		if(arrQ2[i]%3==0){
			System.out.print(arrQ2[i]+" ");
		}
	}
	System.out.println();
	System.out.println("===============================================\n");


	System.out.println("Q3. A~Z까지를 배열에 담아 출력하시오");

	int totalEng = 'Z'-'A'+1;
	int[] arrQ3 = new int[totalEng];
	for(int i=0; i<arrQ3.length; i++){
		
		System.out.print((char)('A'+i)+" ");
	}
	System.out.println();
	System.out.println("===============================================\n");

	System.out.println("Q4. 배열을 이용하여 다음을 출력하시오");

	char[] arrQ4= new char[10];
	for(int i=0; i<4; i++){
		for(int j=0; j<i+1; j++){
			arrQ4[j]='*';
			System.out.print(arrQ4[j]);
		}
		System.out.println("");
	}

	System.out.println("===============================================\n");


	System.out.println("Q5. 배열을 이용하여 다음을 출력하시오");
	
	char[] arrQ5 = new char[totalEng];
	int q5 = 'A'-1;	
	for(int i=0; i<4; i++){
		for(int j=0; j<i+1; j++){
			
			q5 += 1;
			arrQ5[j]=(char)q5;
			System.out.print(arrQ5[j]);
		}
		System.out.println("");
	}

	System.out.println("===============================================\n");

	System.out.println("Q6. 절대값을 구하는 메서드를 만드세요");
	java.util.Scanner sc;
	sc = new java.util.Scanner(System.in);
	int q6 = sc.nextInt();		
		Ex08 me=new Ex08();
		me.abs(q6);

	System.out.println("===============================================\n");

	System.out.println("Q7. sort(int a, int b, int c)을 만드시고");
	System.out.println("	a=7, b=3, c=5 출력을 3<5<7 나오게 하세요");
	
	int a, b, c;
	a = 7;
	b = 3;
	c = 5;
	System.out.println("a="+a+", b="+b+", c="+c);
	me.sort(a,b,c);	
	System.out.println("");	

	System.out.println("===============================================\n");

	System.out.println("Q8. int[] arr={7,3,5}를 arr={3,5,7}로 만드시오");
	
	int[] arrQ8 = new int[]{7,3,5};
	//a0=7, a1=3, a2=5
	for(int i=0; i<3; i++){
		System.out.print(arrQ8[i]+" ");
	}

	System.out.println("\n--------------");

	me.sort(arrQ8[0],arrQ8[1],arrQ8[2]);	

	System.out.println("\n--------------");


  }// main end

	public void abs(int q6){
		
		if(q6>=0){
			System.out.println(q6+"의 절대값은 "+q6+"입니다.");
		}else{
			System.out.println(q6+"의 절대값은 "+(0-q6)+"입니다.");	
		}

	}//abs end


	public void sort(int a, int b, int c){
			
		for(int i=0; i<8; i++){
			if(a==i){System.out.print(a+" ");}
			if(b==i){System.out.print(b+" ");}
			if(c==i){System.out.print(c+" ");}
		}


	}//sort end




}// class end