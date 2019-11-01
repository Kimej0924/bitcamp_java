package com.bit.day09;

public class Ex04 {

	public static void main(String[] args) {
		// 자동 로또번호 생성기
		// 로또 - 토요일 저녁 8시 45분 생방송 SBS
		// 3가지 방법
		// 1. 절차지향 - 
		// 2. 객체지향 -
		// 3. 아이디어 - 

		// 1. 1-45중 6개 선정(랜덤)
		// 2. 중복 X
		// 3. 정렬
		
		System.out.println("자동 로또번호 생성프로그램");
		int coin;
		int ran;
		int[] num = new int[6];
		int max = 6;
		
		System.out.print("구매할 횟수를 선택하세요(최대5) > ");
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		coin = sc.nextInt();
		Ex04 me = new Ex04();
		int a, b, c, d, e, f;

		
		
		for(int k=0; k<coin; k++){
			for(int i=0; i<max; i++){
				ran = (int)(Math.random()*45)+1;		//랜덤수 뽑기
				num[i]=ran;

		
				for(int j=0; j<i; j++){
					if(num[i]==num[j]){				//중복제거
						i--;
						break;
					}
				}	
			}
			System.out.println();
			
//			for(int i=0; i<num.length; i++){
//			System.out.print(num[i]+"\t");			//랜덤한 수 6개 출력 
//			}

			a=num[0];	b=num[1];	c=num[2];	d=num[3];	e=num[4];	f=num[5];
			me.sort(a, b, c, d, e, f);
				
		}	
	
	// 당첨 번호 뽑아보자
		
		System.out.println("\n\n----------------당첨번호-------------------");		

		for(int i=0; i<max; i++){
			ran = (int)(Math.random()*45)+1;		//랜덤수 뽑기
			num[i]=ran;

	
			for(int j=0; j<i; j++){
				if(num[i]==num[j]){				//중복제거
					i--;
					break;
				}
			}			
		}
		
//		for(int i=0; i<num.length; i++){
//		System.out.print(num[i]+"\t");			//랜덤한 수 6개 출력 
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
