class Ex04{

//주석 은 사람이 보기 위한거, 사이즈에 영향을 미치지 않고 출력도 X
//협업에서는 주석을 중요시 여김
//한줄주석
/* 여러줄
     다중주석 */

	public static void main(String[] args){
		//변수
		int a;		//변수의 선언 -> 메모리확보
		a = 3;		//변수의 초기화 -> 최초에 대입되는값
		a = (int)3.14;	//강제형변환

		System.out.println("a = " + a);

		a = 'a';		//자동형변환

		System.out.println("a = " + a);	//뒤에 a는 변수 호출


		int b;
		b=123;		//'='대입연산자 뒤에서 앞으로 대입하는거야
		int c = a+b;	//연산(a+b)을 먼저하고 c를 만든다음 거기다가 값을 쓰는거야
		System.out.println(a+b);	
		System.out.println(c);	

	}// main end

}// class end
