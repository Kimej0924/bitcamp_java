class Ex02{
 // 클래스의 구성요소
 // 메서드
 // 변수(속성: 전역적)
 // 클래스변수, 전역변수, static변수
   static int su = 1000;
 // 인스턴스 필드,(객체)필드,non-static변수
   int su3=4321;
   String msg=null;	//참조변수의 디폴트 자료형은 null이다
   public static void main(String[] args){
	//지역변수
	int su2=1234;	
	System.out.println("su="+su);
	func1();
	Ex02 me = new Ex02();
	System.out.println("me.su3="+me.su3);	

   }// main end


   public static void func1(){
	int su = 9999; 		//전역과 지역이 겹치면 지역이 우선순위
	System.out.println("f1-su="+su);

   }



}// class end

