package com.bit.day09;

public class Exre03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 주민번호 체크
		// 주민번호 입력>100101-3123456
		// 당신은 00세 남성입니다
				
		// 주민번호 입력>020101-4123456		14개 6+"-"+7
		// 당신은 00세 여성입니다
		
		// 주민번호 입력>990101-2123456
		// 당신은 00세 여성입니다	
		
		// 주민번호입력>9901012123456
		// 다음양식에 맞게 다시 입력하세요(000000-0000000)
		
		// 주민번호입력>990101-212345
		// 다시확인하시고 정확히 입력해 주세요
		
		
		System.out.println("주민번호 체크 프로그램");
			while(true){
			System.out.println("주민등록번호를 입력해 주세요");
			java.util.Scanner sc;
			sc = new java.util.Scanner(System.in);
			String input = sc.nextLine();
			
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
					System.out.println("정상처리");	
					switch(arr[0]){
					case '0':	case '1':
						System.out.println("2000년생");
						break;
						
					case '2':	case '3':	case '4':	case '5':
					case '6':	case '7':	case '8':	case '9':		
						System.out.println("19"+arr[0]+"0년생");
						break;
						
					}
				}
				
			}

			
		}
				
						

	}

}
