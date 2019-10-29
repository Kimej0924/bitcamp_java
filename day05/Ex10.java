/*
Q1. A~Z까지 출력하시오.

Q2. A(a) B(b)... Z(z)출력하시오

Q3. 다음을 출력하시오
★
★ ★
★ ★ ★
★ ★ ★ ★

1
2 3
4 5 6
7 8 9 0

1
1 2
1 2 3
1 2 3 4

1
2 1
3 2 1
4 3 2 1

A
B c
D E F
G H I J

*/
class Ex10{
  public static void main(String[] args){


	System.out.println("------Q1. A~Z까지 출력하시오.------");
	// A 65
	// Z
		
	for(int i='A'; i<'Z'+1; i++){
		System.out.print((char)i+" ");
	}
	
	System.out.println("\n--------------------------------------------");

	int cnt1=0;
	while(true){
		System.out.print((char)('A'+cnt1));
		if((char)('A'+cnt1)=='Z'){break;}
		cnt1++;
	}
	System.out.println("\n--------------------------------------------");
	

	System.out.println("-Q2. A(a) B(b)... Z(z)출력하시오.-");

	int total='Z'-'A'+1;
	int gap = 'a'-'A';
	for(int i=0; i<total; i++){
		System.out.print((char)('A'+i)+"("+(char)('A'+i+gap)+")");
	}
	System.out.println("\n--------------------------------------------");

	for(int i=0; i<26; i++){
		System.out.print((char)(65+i)+"("+(char)(97+i)+")"+" ");
	}
	System.out.println("\n");

	System.out.println("------ Q3 - 1------");

	for(int i=1; i<5; i++){
		for(int j=0; j<i; j++){
			System.out.print('★');
		}
		System.out.println();
	}


	System.out.println("------ Q3 - 2------");

	int su = 1;
	for(int i=1; i<5; i++){
		for(int j=1; j<=i; j++){
			int c = su++%10;
			System.out.print(c);
		}
		System.out.println();
	}

	System.out.println("\n--------------------------------------------");
	int temp=1;
	int enter=1;
	for(int i=1; i<11; i++){
		System.out.print(i);
		if(i==temp){
			enter++;
			temp+=enter;
			System.out.println();
		}
	


	}				//물어보기ㅜㅜㅠ퓨ㅜㅠㅜ//



	System.out.println("\n--------------------------------------------");


	System.out.println("------ Q3 - 3------");


	for(int i=1; i<5; i++){
		for(int j=0; j<i; j++){
			System.out.print(j+1);
		}
		System.out.println();
	}
	System.out.println("\n--------------------------------------------");

	int temp1=1;
	int enter1=1;
	int sss=1;
	for(int i=1; i<11; i++){
		System.out.print(su++);
		if(i==temp1){
			sss=1;
			enter1++;
			temp1+=enter1;
			System.out.println();
		}
	


	}
	System.out.println("\n--------------------------------------------");
	//1	=""+1
	//12	=""+1+2
	//123	=""+1+2+3
	//1234	=""+1+2+3+4
	String temp2=" ";
	for(int i=1; i<5; i++){
		temp2+=i;
		System.out.println(temp2);
	}


	System.out.println("------ Q3 - 4------\n");	
	//4321출력하기

	for(int j=1; j<5; j++){
		for(int i=j; i>0; i--){
			System.out.print(i);
		}
		System.out.println();
	}
	System.out.println("\n--------------------------------------------");

	String temp3=" ";
	for(int i=1; i<5; i++){
		temp3=i+temp3;
		System.out.println(temp3);
	}

	System.out.println("\n--------------------------------------------");


	System.out.println("------ Q3 - 5------");

	int eng = 1;
	for(int i=1; i<5; i++){
		for(int j=0; j<i; j++){
			System.out.print((char)('A'-1+eng++));
		}
		System.out.println();
	}






  }// main end


}// class end