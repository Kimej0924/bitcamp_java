class Ex05{

  public static void main(String[] args){
		// ran>=0 && ran<1
	double ran;
	ran=Math.random();
	double a = ran*10;
	int b = (int)a/1;
	int c = (int)ran*10/1;

	System.out.println("ran = "+ran);
	System.out.println("형변환ran = "+c);
	if(a/1>0){
		System.out.println("ran 정수 1자리 포함 실수"+a);
	}
	if(b>0){
		System.out.println("ran 정수 1자리 "+b);
	}
	
	
	



  }// main end



}// class end