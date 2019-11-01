package com.bit.day09;

public class Ex05 {



	int choice = 6;
	static int[] num = new int[45];
	static int[] result = new int[45];
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

		while(true){
			System.out.print("1.번호추출  2.당첨번호  3.확인  4.종료 >");
			java.util.Scanner sc;
			sc=new java.util.Scanner(System.in);
			int coin=1;	
			int select;
			select =sc.nextInt();

			Ex05 me= new Ex05();

			if(select==1){
				for(int k=0; k<coin; k++){				//insert coin
					me.mixChoice();
					me.sort();
					System.out.println("");
				}
			}
//			for(int i=0; i<6; i++){
//				System.out.println(num[i]);
//			}
			if(select==2){
				System.out.println("----당첨번호-----");
				me.mixChoice();
				me.sort();	
				System.out.println("");
			}	
			
			if(select==3){
				
				System.out.println("몇개맞춰써");
			}else if(select==4){
				System.out.println("종료합니다");
				break;
			}
		}//while end	
	}// main end
	
	
	public void mixChoice(){

		for(int i=0; i<45; i++){			//배열순서대로 1~45넣기
			num[i]= i+1;		
		}
		
		for(int i=0; i<100; i++){			//배열 number mix
			
			int n = (int)(Math.random()*45)+1;
			int temp = num[0]; 
			num[0] = num[n-1];
			num[n-1] = temp;
		
		}
		
//		for(int i=0; i<choice; i++){		// number 6 choice
//			System.out.print(num[i]+"\t");
//		}
//		System.out.println("");
		
	}// mix and choice end
	
	
	public void sort(){						// 숫자 자리정렬
		int temp;	
		for(int j=0; j<choice; j++){
			for(int i=0; i<choice-1; i++){
				if(num[i]>num[i+1]){
				temp=num[i];
				num[i]=num[i+1];
				num[i+1]=temp;
				}

			}
		}

		for(int i=0; i<choice; i++){
			System.out.print(num[i]+"\t");
		}		
		
		
	}// sort end
}//class end


