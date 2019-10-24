class Ex10{

public static void main(String[] args){
	// 제어문
	// 2.반복문(for문)
	// for(초기화; 조건; 증감식){
	//	반복할일;
	// }
	// 초기화>조건검사>할일>증감식>조건검사>할일>증감식...
	int a = 9;
	System.out.println("구구단9단");
	
	for(int i=1; i<=9; i++){
		System.out.println(a+" X "+ i +" = "+(a*i));
	}
	
	System.out.println("------------------");

	System.out.println(a+" X 1 = "+(a*1));
	System.out.println(a+" X 2 = "+(a*2));
	System.out.println(a+" X 3 = "+(a*3));
	System.out.println(a+" X 4 = "+(a*4));	
	System.out.println(a+" X 5 = "+(a*5));
	System.out.println(a+" X 6 = "+(a*6));	
	System.out.println(a+" X 7 = "+(a*7));
	System.out.println(a+" X 8 = "+(a*8));
	System.out.println(a+" X 9 = "+(a*9));



}// main end

}// class end