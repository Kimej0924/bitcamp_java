//랜덤한 구구단
//원하는 구구단

class Ex08{

  public static void main(String[] args){
	java.util.Scanner sc = new java.util.Scanner(System.in);	//입력받을준비
	System.out.print("원하는 구구단 수는 = ");
	
	int su = sc.nextInt();						//입력받기
	System.out.println(su+" 단");					//입력받은값출력

	for(int i=1;i<=9;i++){
		System.out.println(su+"x"+i+"="+(su*i));
	}
	System.out.println("-----------------");

	System.out.println("랜덤한 구구단 출력 1번하기 ");

	int ran = (int)(Math.random()*9)+1;
	for(int i=1;i<=9;i++){
		System.out.println(ran+"x"+i+"="+(ran*i));
	}

  }// main end



}// class end