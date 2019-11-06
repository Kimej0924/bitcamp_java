package com.bit.day13;

public class Ex10 {
	public static void func04(){
		System.out.println("f4...");
	}

	public static void func01(final int a){		//final a라 Local클래스 실행 내에서 a를 출력하게 되면 해당 a값이 출력된다
		// ~jdk1.7 상수형 변수만 허용
		// jdk1.8
		final int b = 2222;		//final이라 사용가능한거 -> final 없으면 사용불가 err 
		class Local01{			//non-static class라 객체를 생성한 후에 사용이 가능하다
			int su1=1111;
//			static final int su2=2222;
			public Local01(){		//생성자 
				System.out.println("new Local class...");
			}
			
			public void func03(){
				System.out.println(b+"local func03...");
				func04();
			}
			
			
		}// Local end
		Local01 lo1=new Local01();		//객체 생성 후 Local class의 생성자를 실행하게됨
		System.out.println(lo1.su1);	//객체 생성 후 class로 가서 su1값을 가져오는거
		lo1.func03();
	}// func01 end
	
	public void func02(){
		class local02{
			
		}
	}
	
	
	public static void main(String[] args) {
			//로컬 클래스
		Ex10.func01(1234);
		Ex10.func01(1111);

	}

}
