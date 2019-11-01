package com.bit.day09;

public class Ex03 {

	public static void main(String[] args) {
		// 주민번호 체크
		// 주민번호 입력>100101-3123456
		// 2019-2000-10+1
		// 당신은 10세 남성입니다
		
		// 주민번호 입력>020101-4123456		14개 6+"-"+7
		// 2019-2000-2+1
		// 당신은 18세 여성입니다
		
		// 주민번호 입력>890101-2123456
		// 2019-1900-99+1
		// 당신은 31세 여성입니다	
		
		// 주민번호입력>9901012123456
		// 다음양식에 맞게 다시 입력하세요(000000-0000000)
		
		// 주민번호입력>990101-212345
		// 다시확인하시고 정확히 입력해 주세요
		
		
		System.out.println("주민번호 체크 프로그램");

		while(true){

			java.util.Scanner sc;
			sc = new java.util.Scanner(System.in);
			String input = null;
			int age=2019+1;
			char gender='남';
			
			System.out.print("주민번호입력 >");			
			input = sc.nextLine();	
			char[] arr=input.toCharArray();
			for(int i=0; i<arr.length; i++){
				//System.out.println(arr[i]);
				if(i<6){
					if(arr[i]=='-'){				// 앞6자리에 - 들어갔을때
						System.out.println("다시확인하시고 정확히 입력해주세요");	
						break;
						}
				}else if(i==6&&arr[i]!='-'){		// - 자리에 다른값이 들어갔을때
					System.out.println("다시확인하시고 정확히 입력해주세요");
					break;
				}else if(i>6&&i<14){				// 뒤7자리에 - 들어갔을때
					if(arr[i]=='-'){
						System.out.println("다시확인하시고 정확히 입력해주세요");
						break;
						}					
				}else if(i>=arr.length){			// 입력 자리수를 초과했을때
					System.out.println("다시확인하시고 정확히 입력해주세요");
					break;
				}else{
					char ch1=input.charAt(0);
					if(ch1=='0'||ch1=='1'){
						age-=2000;
					}else{
						age-=1900;
					}
					char ch2=input.charAt(1);
					age-=(ch1-'0')*10+(ch2-'0');
					
					char ch8=input.charAt(7);
					
					switch(ch8){
					
						case '1':
						case '3':
							gender='남';
							break;
						case '2':
						case '4':
							gender='여';
							break;
					}
					
					System.out.println("당신은 "+age+"세 "+gender+"성입니다.");
				}
						
			}
		}
				
	}					
}


