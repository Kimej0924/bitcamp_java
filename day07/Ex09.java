package com.bit;

/*
학생성적관리프로그램(ver 0.0.2)
-------------------------------

학생 3명을 관리하는 프로그램
학생 학번 국어 영어

1.입력 2.보기 0.종료 >1
1번학번 국어 : 99
1번학번 영어 : 88

1.입력 2.보기 0.종료 >1
2번학번 국어 : 87
2번학번 영어 : 54

1.입력 2.보기 0.종료 >1
3번학번 국어 : 99
3번학번 영어 : 89

1.입력 2.보기 0.종료 >2
----------------------------------------
학번	|국어	|영어	|합계	|평균
----------------------------------------
1	|			|
2	|			|
3	|			|
----------------------------------------
*/

class Ex09{
	
	public static void main(String[] args){
		int count;
		count = 0;
		System.out.println("    학생성적관리프로그램(ver 0.0.2)   ");
		System.out.println("----------------------------------------");	
		while(true){
			
			System.out.print("1.입력   2.보기   0.종료  >> ");
			java.util.Scanner sc = new java.util.Scanner(System.in);
			int sel = sc.nextInt();
			if(sel==1){
				count++;
				Select my = new Select(count);
				
			}else if(sel==2){
				System.out.println("----------------------------------------");
				System.out.println("학번\t|국어\t|영어\t|합계\t|평균");
				System.out.println("----------------------------------------");
				Choice my = new Choice(count);
				System.out.println("----------------------------------------");	

			}else if(sel==0){
				System.out.println("이용해주셔서감사합니다.");

				break;
		
			}
		}


	}// main end



}// class end

class Select{
	public Select(int count){

		Score my = new Score();		
		if(count==1){
			my.scorePrint(1, 99, 88);
		}else if(count==2){
			my.scorePrint(2, 87, 54);		
		}else if(count==3){
			my.scorePrint(3, 99, 89);		
		}else{
			System.out.println("입력정원을 초과하였습니다.");
		}
	}
}//select end

class Choice{
	public Choice(int count){
			Score my = new Score();		
		if(count==1){
			my.scoreShow(1, 99, 88);
		}else if(count==2){
			my.scoreShow(1, 99, 88);
			my.scoreShow(2, 87, 54);		
		}else if(count>=3){
			my.scoreShow(1, 99, 88);
			my.scoreShow(2, 87, 54);
			my.scoreShow(3, 99, 89);		
		}		

	}
}//choice end



class Score{

	String name;
	int kor;
	int eng;
	int sum;
	double avg;

	public void scorePrint(int a, int b, int c){
		//name=a;
		//kor=b;
		//eng=c;

		System.out.println(a+"번학번  국어 :"+b);
		System.out.println(a+"번학번  영어 :"+c);
		
	}// scorePrint end


	public void scoreShow(int a, int b, int c){
		//name=a;
		//kor=b;
		//eng=c;	
		sum=b+c;
		avg=sum/2.0;		
		System.out.println(a+"\t|"+b+"\t "+c+"\t "+sum+"\t|"+avg);
	}//scoreShow end


}// Score end
