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
	
class Ex08{

  public static void main(String[] args){
	
	String title = "성적관리프로그램(ver.0.0.1)";
	int kor,eng,math;
	kor = 86;
	eng = 93;
	math = 74;
	int total = kor+eng+math;
	double avg = total*100/3/100.0;	//소수2째짜리까지 출력하려면
	char grade='F';
	
	switch(total/3/10){			

	   case 10:
	   case 9:
		grade='A';
		break;
	   case 8:
		grade='B';
		break;
	   case 7:
		grade='C';
		break;
	   case 6:
		grade='D';
		break;
	   default:
		grade='F';
		break;
	}
	
	System.out.println("\n\n"+title+"\n");
	System.out.println("-----------------");
	System.out.println("국어\t|영어\t|수학\t|총점\t|평균\t|학점");
	System.out.println("--------------------------------------------");
	System.out.println(kor+"\t|"+eng+"\t|"+math+"\t|"+total+"\t|"+avg+"\t"+grade);
	System.out.println("--------------------------------------------");

	
  }//main end

}//class end