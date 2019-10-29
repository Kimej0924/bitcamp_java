class Ex04{

  public static void main(String[] args){
	int a,b,c,result;
	a = 5;
	b = 2;
	c = 1;
	result = 0;
	char ch='?';

	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.print("첫번째:");
	a=sc.nextInt();
	System.out.print("두번째:");
	b=sc.nextInt();
	System.out.print("1.더하기  2.빼기:  3.곱하기:  4.나누기: ");
	c=sc.nextInt();

	Ex04 me = new Ex04();

	switch(c){
		case 1:
		me.plus(a,b);
		ch='+';
		break;
		case 2:
		me.minus(a,b);
		ch='-';
		break;
		case 3:
		me.multi(a,b);
		ch='*';
		break;
		case 4:
		me.div(a,b);
		ch='/';
		break;
	}

  }// main end

  
  public void plus(int a, int b){
	int c = a+b;
	System.out.println(a+"+"+b+"="+c);

  }// plus end


  public void minus(int a, int b){
	int c = a-b;
	System.out.println(a+"-"+b+"="+c);

  }// minus end


  public void multi(int a, int b){
	int c = a*b;
	System.out.println(a+"*"+b+"="+c);

  }// multi end


  public void div(int a, int b){
	if(a%b==0){
		int c = a/b;
		System.out.println(a+"÷"+b+"="+c);
	}else{
		double c=a*1.0/b;
		System.out.println(a+"÷"+b+"="+c);
	}
	
  }// div end


}// class end