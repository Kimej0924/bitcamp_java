package com.bit.day11;

//public class Lec04{}			//파일명에 해당하는 class만 public이 올 수 있고
						//한 파일안에 public은 하나만 올수있다
//class Lec03{}			//다 그냥 class는 가능 (default) class
						

public class Lec02 {

		int su1=1234;		//접근제한자 public 어디서든지 접근해서 사용할수 있는거
		static int su2=4321;		//

		
		public void func01(){
			System.out.println("func01...");
		}
		
		public static void func02(){
			System.out.println("func02...");	
		}

	}

