class Ex03{
// 호출
// static - static -> 메서드명(...);
// static - non_static -> 참조변수.메서드명(...);
// non_static - non_static -> 메서드명(...);
// non_static - static -> 메서드명(...);
  public static void main(String[] args){
	Ex03 me = new Ex03();
	me.func3();
	//Ex03 me2 = new Ex03();
	//me2.func4();
	//me.func4();

  }// main end

  public static void func1(){
	System.out.println("fun1()...");

  }// func1 end

  public static void func2(){
	System.out.println("fun2()...");

  }// func2 end

  public void func3(){
	//func4();
	func2();
	System.out.println("fun3()...");

  }// func3 end

  public void func4(){
	System.out.println("fun4()...");

  }// func4 end



}