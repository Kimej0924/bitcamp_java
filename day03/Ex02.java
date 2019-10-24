class Ex02{

	public static void main(String[] args){
		//증감연산자	//비트단위에서의 하나 더 증감 /+2가되는순간 int형이되니까
		int a;		//사칙연산보다 먼저일어난다 우선순위임
		a=100;

		System.out.println("a="+a);
		a=a+1;
		System.out.println("a="+a);
		a=a+1;
		System.out.println("a="+a);

		a++;	
		System.out.println("a="+a);
		++a;
		System.out.println("a="+a);

		a=++a;	//쓸때부터 증가된다
		System.out.println("a="+a);
		a=a++;	//이시점에서는 a가증가하지않고 다음시점에 증가한다
		System.out.println("a="+a);
		a+=1;		//a=a+1을 줄여서 쓴거 (a*=3, a/=2 도 가능)
		System.out.println("a="+a);

		System.out.println("-----------");
		
		int b=10;
		System.out.println((++b)+b+(++b));
		//System.out.println((11)+11+(12));	

		System.out.println("-----------");
		System.out.println(3>2);
		System.out.println(3<2);
		System.out.println(3>=2);
		System.out.println(3<=2);
		System.out.println(3+2-(100*2)>(2*2)-(9%2));
		int c=2;
		System.out.println(c==3-1);	//같은지
		System.out.println(c!=3-1);	//다른지(==의 반대)

		System.out.println("=================");
		System.out.println(true&&true);	//and연산자 두개다 true여야 true
		System.out.println(true&&false);
		System.out.println(false&&false);		
		System.out.println(true||true);	//or연산자 둘중 하나true면 true
		System.out.println(true||false);
		System.out.println(false||false);

		System.out.println("-----------");
		System.out.println(!true);
		System.out.println(!false);
		
		

	}//main end

}//class end