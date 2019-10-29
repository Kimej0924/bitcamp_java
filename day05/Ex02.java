class Ex02{

public static void main(String[] args){
	
	System.out.println("메인 로딩...");
	int a, b, c;
	a = 3;
	b = 2; 
	c = plus(a,b);
	System.out.println(a+"+"+b+"="+c);

	if(c>0){return;}		//{System.exit(0);} 같은건데 메리트가없다(VM종료를 의미)
	System.out.println("메인 언로딩...");

}// main end

public static int plus(int a, int b){
	int c;
	c=a+b;
	return c;

}// plus end



}// class end