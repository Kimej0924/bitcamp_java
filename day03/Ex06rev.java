/*
������ ����Ͻÿ�
���� : 86
���� : 93
���� : 74
�հ� : 000
��� : 00.00
���� : B����
	��������
	���100~90�̻� : A
	���90�̸�~80�̻� : B
	���80�̸�~70�̻� : C
	���70�̸�~60�̻� : D
	���60�̸� : F
*/
	
class Ex06rev{

  public static void main(String[] args){
	
	String title = "\n---�������----\n";
	int kor = 86;
	int eng = 93;
	int math = 74;
	int total = kor+eng+math;
	double avg = total/3.0;
	System.out.println(title);
	System.out.println("|����|"+kor+"\t|");
	System.out.println("|����|"+eng+"\t|");
	System.out.println("|����|"+math+"\t|");
	System.out.println("------------------");
	System.out.println("|�հ�|"+total+"\t|");
	System.out.println("|���|"+avg+"\t|");

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

	System.out.println("|����|"+grade+"����\t|");
	System.out.println("------------------");

/*	if(kor<0||eng<0||math<0){
		System.out.println("������ �ٽ�Ȯ���ؿ�");
	}else{	

		if(avg<=100&&avg>=90){
			System.out.println("���� : A ");
		}else if(avg<90&&avg>=80){
			System.out.println("���� : B ");
		}else if(avg<80&&avg>=70){
			System.out.println("���� : C ");
		}else if(avg<70&&avg>=60){
			System.out.println("���� : D ");
		}else if(avg<60&&avg>=0){
			System.out.println("���� : F ");
		}else{
			System.out.println("��������");
		}
	}
	
*/

  }//main end

}//class end