class Ex01{
/*
class 클래스명{}
클래스명
- 첫글자 숫자 특수문자 불가(예외 _ $)
- 첫글자가 대문자로 시작
- 두개 이상의 단어 사용시
	두번째 단어의 첫글자를 대문자
- 동일 패키지상의 클래스는 이름중복이 불가

클래스의 구성요소
	1. 메서드
오직 메인만을 출력하고 메인에서 호출받은 메서드를 출력한다
호출받은 시점에서만 일을 하게된다

*/	
public static void main(String[] args){
	System.out.println("시작");
	func1();
	System.out.println("끝");
		
}// main end


	// 메서드
	// 메서드명 중복 불가(메서드 오버로드 예외(func1(), func1(int a) 사용가능// int,double도 가능)
	// public static void 메서드명(매개변수[인자]){}	매개변수는 필요에따라 있을수도 없을수도있다
	// 메서드의 호출은
	// 인자유무,인자갯수,인자타입 일치해야 호출가능
public static void func1(){
	System.out.println("메서드1");
	func2();
	System.out.println("메서드1끝");
	
}// func1 end

public static void func2(){

	System.out.println("메서드2");

}// func2 end


}// class end