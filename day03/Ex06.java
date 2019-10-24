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
	
class Ex06{

  public static void main(String[] args){
	
	String title = "\n---학점계산----\n";
	int kor = 86;
	int eng = 93;
	int math = 74;
	int sum = kor+eng+math;
	double avg = sum/3.0;
	System.out.println(title);
	System.out.println("국어 : "+kor);
	System.out.println("영어 : "+eng);
	System.out.println("수학 : "+math);

	System.out.println("합계 : "+sum);
	System.out.println("평균 : "+avg);

	System.out.println("------------------");
	if(kor<0||eng<0||math<0){
		System.out.println("점수를 다시확인해요");
	}else{	

		if(avrg<=100&&avrg>=90){
			System.out.println("학점 : A ");
		}else if(avrg<90&&avrg>=80){
			System.out.println("학점 : B ");
		}else if(avrg<80&&avrg>=70){
			System.out.println("학점 : C ");
		}else if(avrg<70&&avrg>=60){
			System.out.println("학점 : D ");
		}else if(avrg<60&&avrg>=0){
			System.out.println("학점 : F ");
		}else{
			System.out.println("점수오류");
		}
	}
	


  }//main end

}//class end