/*
다음을 출력하시오
국어 : 86
영어 : 93
수학 : 74
합계 : 000
평균 : 00.00
학점 : B학점
	학점기준
	평균100~90이상 : A
	평균90미만~80이상 : B
	평균80미만~70이상 : C
	평균70미만~60이상 : D
	평균60미만 : F
*/
	
class Ex06rev{

  public static void main(String[] args){
	
	String title = "\n---학점계산----\n";
	int kor = 86;
	int eng = 93;
	int math = 74;
	int total = kor+eng+math;
	double avg = total/3.0;
	System.out.println(title);
	System.out.println("|국어|"+kor+"\t|");
	System.out.println("|영어|"+eng+"\t|");
	System.out.println("|수학|"+math+"\t|");
	System.out.println("------------------");
	System.out.println("|합계|"+total+"\t|");
	System.out.println("|평균|"+avg+"\t|");

	System.out.println("------------------");

	char grade='A';
	if(avg>=90){
		grade='A';
	}else if(avg>=80){
		grade='B';	//grade+=1;
	}else if(avg>=70){
		grade='C';	//grade+=2;	
	}else if(avg>=60){
		grade='D';	//grade+=3;	
	}else{
		grade='F';
	}

	System.out.println("|학점|"+grade+"학점\t|");
	System.out.println("------------------");

/*	if(kor<0||eng<0||math<0){
		System.out.println("점수를 다시확인해요");
	}else{	

		if(avg<=100&&avg>=90){
			System.out.println("학점 : A ");
		}else if(avg<90&&avg>=80){
			System.out.println("학점 : B ");
		}else if(avg<80&&avg>=70){
			System.out.println("학점 : C ");
		}else if(avg<70&&avg>=60){
			System.out.println("학점 : D ");
		}else if(avg<60&&avg>=0){
			System.out.println("학점 : F ");
		}else{
			System.out.println("점수오류");
		}
	}
	
*/

  }//main end

}//class end