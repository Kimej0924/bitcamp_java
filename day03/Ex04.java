class Ex04{

  public static void main(String[] args){
	//제어문
	//1.조건문(if문)
	//만약 ~~이라면
	//if(조건-boolean){실행문;실행문;~}
	System.out.println("if문 시작");

	int a = 3;
	if(a>2){
		System.out.println("a는 2보다 큽니다.");	
	}
	if(a<=2){
		System.out.println("a는 2보다 크지않습니다.");
	}
	System.out.println("if문 끝");
	System.out.println("--------------------");
	
	// if~else문(만약~이라면~하고, 아니면~해라)
	// if(조건){참일때실행;}else{거짓일때실행;}
	
	if(a>2){
		System.out.println("a는 2보다 큽니다.");	
	}else{
		System.out.println("a는 2보다 크지않습니다.");
	}
	System.out.println("--------------------");
	/* 
	b=9;
	다음을 출력하세요
	양수이고 홀수입니다.
	양수이고 짝수입니다.
	음수이고 홀수입니다.
	음수이고 짝수입니다.
	*/

	int b = -5;

	if(b>0&&b%2==1){
		System.out.println("양수이고 홀수입니다.");
	}
	if(b>0&&b%2==0){
		System.out.println("양수이고 짝수입니다.");
	}
	if(b==0){
		System.out.println("0입니다.");
	}
	if(b<0&&b%(-2)==1){
		System.out.println("음수이고 홀수입니다.");
	}
	if(b<0&&b%(-2)==0){
		System.out.println("음수이고 짝수입니다.");

	}





  }//main end

}//class end