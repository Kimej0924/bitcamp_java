package com.bit.day13;

interface Inter{
	void func01();
}
interface Inter02{
	void func02();
	void func03();
}

abstract class Cl11{
	void func04(){}
	abstract void func05();
}
public class Ex11 {
	public static final int su1 = 111;
	public static final String msg = "뭐하냐";
	public static final String msg2 = new String("집가고싶다");
	
	public static final Object obj2 = new Object(){
		public String toString(){
			return "어모니머스";
		}
	};
	
	public static Inter func(){
//		class Local11 implements Inter{
//			public void func01(){
//				System.out.println("Local func01...");
//			}
//		}//local end
		
//		Local11 me = new Local11();
//		me.func01();
//		(new Local11()).func01(); 상기 생성과 같은표현
		
//		(new (class Local11{
//			void func01(){
//				System.out.println("Local func01...");
//			})()).func01();
		
		Inter local = new Inter (){		//인터페이스를 생성하는게 아니라 인터페이스를 상속받는 클래스인데 이름이 없는거야
			public void func01(){
				System.out.println("Local func01...");
			}
		};
		
		return local;
	}//func01 end
	
	public static void main(String[] args) {
		// 
		Inter obj=func();
		obj.func01();
		
		Inter02 ele2 = new Inter02 (){
			public void func02(){
				
			}
			public void func03(){
				
			}
			
		
		};
		
		Cl11 cl = new Cl11(){
			void func05(){
				
			}
		};
		
		
		Object obj2 = new Object(){
			public String toString(){
				return "어모니머스";
			}
		};
		System.out.println(obj2);
	}//main end

}
