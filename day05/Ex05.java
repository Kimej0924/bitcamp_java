class Ex05{

  public static void main(String[] args){
		// ran>=0 && ran<1
	double ran;
	ran=Math.random();
	double a = ran*10;
	int b = (int)a/1;
	int c = (int)ran*10/1;

	System.out.println("ran = "+ran);
	System.out.println("����ȯran = "+c);
	if(a/1>0){
		System.out.println("ran ���� 1�ڸ� ���� �Ǽ�"+a);
	}
	if(b>0){
		System.out.println("ran ���� 1�ڸ� "+b);
	}
	
	
	



  }// main end



}// class end