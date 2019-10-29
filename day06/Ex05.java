class Ex05{

  public static void main(String[] args){

	//int a = 1234;
	int a;
	a = 1234;

	//new Ex05(); 객체를 생성하는 코드 // 그걸 앞에 Ex05 me가 받는거임
	//참조변수의 타입은 클래스명이다!(Ex05 me)
	Ex05 me;
	me = new Ex05();
	System.out.println(me);
	me = new Ex05();
	System.out.println(me);	

  }

  public void func(){
	System.out.println("My Function...");


  }
}