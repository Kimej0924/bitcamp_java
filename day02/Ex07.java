class Ex07{

	public static void main(String[] args){

		//문자형 변수
		
		char ch;
		ch = 'A';
		System.out.println("ch = " + ch);
		ch = '\uac01';
		System.out.println("ch = " + ch);
		ch = 'ㄱ';
		System.out.println("ch = " + ch);
		ch = (char)97;		
		//자동형변환이 되더라도 오해의 소지가 있으면 강제형변환을 해주는게 더 낫다
		System.out.println("ch = " + ch);
		ch = '1';		
		// 문자 1로 인식하기때문에 1에 해당하는것은 int 로 형변환하면 49로 출력
		System.out.println("ch = " + (int)ch);
		ch = '\\';		
		System.out.println("ch = " + ch);


		//문자열은 일반자료형이 아니다
		String st="문자열은 \n \"내용\"안에 작성";
		System.out.println(st);

		st="PATH=\"C:\\Program Files\\Java\\jdk1.8.0_231\\bin\"";
		System.out.println(st);

	
	}// main end

}// class end