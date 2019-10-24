class Ex08{
//boolean(x)
//byte < short < char <= int < long < float < double
//오른쪽방향은 오토캐스팅 일어나고 왼쪽으로는 강제형변환 해야한다.
//표현의 범위가 오른쪽으로 갈수록 커진다(메모리의 사이즈가 아님)
//char는 연산이 안되 -> 숫자로 인식되니까 int로 바뀌어서 숫자로 출력됨
	public static void main(String[] args){

	// Boolean형 변수(참거짓)
		boolean a;
		boolean b;
		a = true;
		b = false;

		System.out.println('a'-'b');
		System.out.println('b'-'a');
		System.out.println('a'+'b');

	
	}// main end

}// class end