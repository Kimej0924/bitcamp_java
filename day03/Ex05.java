class Ex05{

  public static void main(String[] args){

	/* 
	a=9;
	다음을 출력하세요
	양수이고 홀수입니다.
	양수이고 짝수입니다.
	음수이고 홀수입니다.
	음수이고 짝수입니다.
	*/

	int a = -17;

	if(a>=0){
		System.out.print("양수이고 ");
	}
	if(a<0){
		System.out.print("음수이고 ");
	}

	if(a%2==0){
		System.out.println("짝수입니다.");
	}
	if(a%2!=0){
		System.out.println("홀수입니다.");		//==1로하면 출력이 안되요 0이 아니다라고 해야함
	}
	
	System.out.println("---------------");
	if(a>=0&&a%2==0){
	System.out.println("양수이고짝수입니다.");
	}
	if(a>=0&&a%2!=0){
	System.out.println("양수이고홀수입니다.");
	}
	if(a<0&&a%2==0){
	System.out.println("음수이고짝수입니다.");
	}
	if(a<0&&a%2!=0){	
	System.out.println("음수이고홀수입니다.");		//==1로하면 출력이 안되요 0이 아니다라고 해야함
	}

	System.out.println("---------------");
	if(a>=0){
		if(a%2==0){
		System.out.println("양수이고 짝수입니다.");
		}else{
		System.out.println("양수이고 홀수입니다.");
		}
	}else{
		if(a%2==0){
		System.out.println("음수이고 짝수입니다.");
		}else{
		System.out.println("음수이고 홀수입니다.");
		}
	}	

	System.out.println("---------------");

	if(a>=0&&a%2==0){
	System.out.println("양수이고짝수입니다.");
	}else if(a>=0&&a%2==1){
	System.out.println("양수이고홀수입니다.");
	}else if(a%2==0){
	System.out.println("음수이고짝수입니다.");
	}else{	
	System.out.println("음수이고홀수입니다.");
	}


  }//main end

}//class end