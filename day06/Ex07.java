/*
가위 바위 보 게임(ver 0.0.1)

1.가위  2.바위  3.보  0.종료 > 1
*/

class Ex07{

  public static void main(String[] args){
	System.out.println("가위 바위 보 게임(ver 0.0.1)");

	java.util.Scanner sc;
	sc = new java.util.Scanner(System.in);
	int input = 0;
	int ran = 0;
	int cnt = 0;
	int result1, result2, result3;
	result1=0;
	result2=0;
	result3=0;

	while(true){
		System.out.print("1.가위  2.바위  3.보  0.종료 >> ");
		input = sc.nextInt();
		// ran=1,2,3 1~3
		// 0<=Math.random()>1
		// 0*10+1<ran=Math.random()*10+1<1*10+1	1~10
		// 0*3<=Math.random()*3<1*3
		ran=(int)(Math.random()*3)+1;

		if(input==1 || input==2 || input==3){cnt++;}

		if(input==1){
			System.out.println("you = 가위");
		}else if(input==2){
			System.out.println("you = 바위");
		}else if(input==3){
			System.out.println("you = 보");
		}	

		if(ran==1){
			System.out.println("com = 가위");
		}else if(ran==2){
			System.out.println("com = 바위");
		}else if(ran==3){
			System.out.println("com = 보");
		}


		if(input==0){
			break;
		}else if(input==ran){
			System.out.println("비김");
			result2++;
		}else if((input==1&&ran==3) || (input==2&&ran==1) || (input==3&&ran==2)){
			System.out.println("you 승");
			result1++;
		}else if((input==1&&ran==2) || (input==2&&ran==3) || (input==3&&ran==1)){
			System.out.println("com 승");
			result3++;
		}








/*		if(input==1){
			System.out.println("you:가위");
			if(ran==1){
				System.out.println("com:가위");
				System.out.println("비겼다");				
			}else if(ran==2){
				System.out.println("com:바위");	
				System.out.println("com 승");	
			}else if(ran==3){
				System.out.println("com:보");
				System.out.println("you 승");	
			}

		}else if(input==2){
			System.out.println("you:바위");
			if(ran==1){
				System.out.println("com:가위");
				System.out.println("you 승");				
			}else if(ran==2){
				System.out.println("com:바위");	
				System.out.println("비겼다");	
			}else if(ran==3){
				System.out.println("com:보");
				System.out.println("com 승");	
			}

		}else if(input==3){
			System.out.println("you:보");
			if(ran==1){
				System.out.println("com:가위");
				System.out.println("com 승");				
			}else if(ran==2){
				System.out.println("com:바위");	
				System.out.println("you 승");	
			}else if(ran==3){
				System.out.println("com:보");
				System.out.println("비겼다");	
			}

		}else if(input==0){
			break;

		}else{

		}
*/
	}
	System.out.println(cnt+"회 중,"+result1*10000/cnt/100.0+"%("+result1+"승"+result2+"무"+result3+"패)");
	System.out.println("이용해 주셔서 감사합니다");









  }// main end



}// class end