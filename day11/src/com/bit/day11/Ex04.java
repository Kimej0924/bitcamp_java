package com.bit.day11;

public class Ex04 {

	public static void main(String[] args) {
		//java
		String target = "java";
		
		String result = null;
//		result = target.replace('v', 'V');			//replace 는 문자, 문자열 다 받고 뺄수 있다
		result = target.replace("av", "awebV");		//문자 수정 추가 삭제 다 가능

		
//	스트링클래스에서 대표적으로 사용되는것들	//
		System.out.println(result);
		System.out.println(target==result);			//수정한것은 새로 찍어내는거라 레퍼런스 비교하면 다름
		System.out.println(target);
		System.out.println(target.contains("av"));
		System.out.println(target.contains("aV"));		//해당 문자열을 포함하고 있는가
		System.out.println("--------------");
		System.out.println(target.endsWith("vaa"));		// ~로끝나냐 vaa로 끝나냐 
		System.out.println(target.startsWith("ja"));	// ~로시작하냐 ja로 시작하냐 	
		System.out.println(target.indexOf('a'));		// 해당 문자의 인덱스 번호를 부르는데 중복단어는 앞에값 인덱스번호
		System.out.println(target.indexOf("ja"));		// 해당 문자가 존재하지 않으면 -1 출력됨 / int로 받음(자동형변환)
		System.out.println("--------------");												// 문자열도 가능 > 인덱스 번호는 문자열의 맨 앞자리 번호 가져옴
		System.out.println(target.lastIndexOf('a'));	// 중복됬을때 뒤에서 부터 찾아내는거
		System.out.println(target.lastIndexOf("av"));
		System.out.println("--------------");			
		target="JavaWebSpring";
		//		01234
		//		1234567
//		String result2=target.substring(2);		//인덱스 번호 2부터 끝까지 출력
		String result2=target.substring(4,7);	//인덱스 번호 4~6까지 출력됨  (i=4; i<7; 같은 느낌)
		System.out.println(result2);	
		System.out.println("--------------");	
		System.out.println(target.toLowerCase());	//자동으로 전부 소문자로 만듦
		System.out.println(target.toUpperCase());	//자동으로 전부 대문자로 만듦		
		System.out.println(target);					//뒤에 toString()이 생략되어 있는거
		System.out.println(target.toString());		
		System.out.println("--------------");
		target="                 ab cd     df   ";
		System.out.println(target);
		System.out.println(target.trim()+"여기까지");	// .trim() 앞뒤공백제거 (내부의 것은 안됨)
		
		
	}

}
