class Ex06{

  public static void main(String[] args){

	java.util.Scanner sc;
	sc = new java.util.Scanner(System.in);
	int a, b, su3;
	System.out.print("첫번째:");
	a=sc.nextInt();
	System.out.print("두번째:");
	b=sc.nextInt();
	
	System.out.print("1.+  2.-  3.×  4.÷ : ");
	su3=sc.nextInt();

	Ex04 me = new Ex04();

	if(su3==1){
		myPrint1(a, '+', b, plus(a,b));
	}else if(su3==2){
		myPrint1(a, '-', b, minus(a,b));
	}else if(su3==3){
		myPrint1(a, '×', b, multi(a,b));
	}else if(su3==4){
		if(a%b==0){
			myPrint1(a, '÷', b, div1(a,b));
		}else{
			myPrint1(a, '÷', b, div2(a,b));
		}
	
	}

  }// main end

  public static void myPrint1(int a, char ch, int b, int c){
	System.out.println(a+""+ch+b+"="+c);
  }

  public static void myPrint1(int a, char ch, int b, double c){
	System.out.println(a+""+ch+b+"="+c);
  }
  
  public static int plus(int a, int b){
	int c = a+b;
	return c;

  }// plus end


  public static int minus(int a, int b){
	int c = a-b;	
	return c;

  }// minus end


  public static int multi(int a, int b){
	int c = a*b;	
	return c;

  }// multi end


  public static int div1(int a, int b){
	int c = a/b;	
	return c;
	
  }// div1 end


  public static double div2(int a, int b){
	double c = a*1.0/b;	
	return c;
	
  }// div2 end



}// class end