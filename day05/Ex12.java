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

class Ex12{
  public static void main(String[] args){
	java.util.Scanner sc = new java.util.Scanner(System.in);	//입력받을준비
	System.out.println("가위 바위 보 게임(ver 0.0.1)");
	
	int win=0;
	int draw=0;
	int lose=0;
	int total=0;
	double rate=0;
	while(true){
		System.out.print("1.가위 2.바위 3.보 0.종료  > ");
		int su = sc.nextInt();						//입력받기
		int com = (int)(Math.random()*3)+1;
		String comStr="", suStr="";

			if(su==1||su==2||su==3){
				if(com==1){
					comStr="가위";
				}else if(com==2){
					comStr="바위";
				}else{
					comStr="보";
				}
				
				if(su==1){
					suStr="가위";
				}else if(su==2){
					suStr="바위";
				}else if(su==3){
					suStr="보";
				}
				System.out.println("com : "+comStr+"\t you : "+suStr);
				
				if((su==1&&com==3)||(su==2&&com==1)||(su==3&&com==2)){
					System.out.println("이겼습니다.");
					win++;
				}else if(su==com){
					System.out.println("비겼습니다.");
					draw++;				
				}else{
					System.out.println("졌습니다.");
					lose++;	
				}
					
			}
	
			if(su>3){
				System.out.println("다시입력바랍니다.");							
			}else if(su==0){
					
				System.out.println("이용해주셔서 감사합니다.");
				System.out.println("///////////////////////////////");
				total= win+draw+lose;
				rate = (int)win*100/total;
				System.out.print("총"+total+"회 ");				
				System.out.print("승률"+rate+"%");				
				System.out.println("("+win+"승"+draw+"무"+lose+"패"+")");
				System.out.println("///////////////////////////////");	
				break;
			}			

	
	}// while end

  }// main end

  

}// class end