/*
가위 바위 보 게임(ver 0.0.1)

1.가위 2.바위 3.보 0.종료   > 1
com : 바위,	you : 가위
졌습니다.

1.가위 2.바위 3.보 0.종료   > 2
com : 바위,	you : 바위
비겼습니다.

1.가위 2.바위 3.보 0.종료   > 0
이용해주셔서 감사합니다.
/////////////////////////////
총00회  승률 00%(0승0무0패)
/////////////////////////////
*/

class Ex11{
  public static void main(String[] args){
	java.util.Scanner sc = new java.util.Scanner(System.in);	//입력받을준비
	System.out.println("가위 바위 보 게임(ver 0.0.1)");
	while(true){
		System.out.print("1.가위 2.바위 3.보 0.종료  > ");
		int su = sc.nextInt();						//입력받기

			if(su==1||su==2||su==3){
				
				String c = func0(su);
				System.out.println(c);
			}
	
			if(su>3){
				System.out.println("다시입력바랍니다.");							
			}else if(su==0){
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}			

	
	}// while end

  }// main end

   public static void func0(int su){		// su가 1~3의 수를 받았을때 실행
		int com = (int)(Math.random()*3)+1;
		
		System.out.println("com : "+com+",\t you : "+su+"\n");
	/*	if(su==1){
			func1();
		}
		if(su==2){
			func2();	
		}
		if(su==3){
			func3();							
		}
	*/
	
   }// func1 end


   public static int func1(int su, int com){		// su = 1 묵냈을때
		int c = 0;
		if(com==1){
			System.out.println("이겼습니다");
		}
		if(com==2){
			System.out.println("졌습니다");	
		}
		if(com==3){
			System.out.println("비겼습니다");							
		}
		return c;	

   }// func1 end

   public static int func2(int su, int com){		// su = 2 찌냈을때
		
		int c = 0;
		if(com==1){
			System.out.println("이겼습니다");
		}
		if(com==2){
			System.out.println("졌습니다");	
		}
		if(com==3){
			System.out.println("비겼습니다");							
		}
		return c;
	
   }// func2 end

   public static int func3(int su, int com){		// su = 3 빠냈을때
		
		int c = 0;		
		if(com==1){
			System.out.println("이겼습니다");
		}
		if(com==2){
			System.out.println("졌습니다");	
		}
		if(com==3){
			System.out.println("비겼습니다");							
		}
		return c;
   }// func3 end



}// class end