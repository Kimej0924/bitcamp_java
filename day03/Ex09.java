/*
������ ����Ͻÿ�
���� : 86
���� : 93
���� : 74
�հ� : 000
��� : 00.00
���� : B����
	��������
	���100~90�̻� : A	F-2-1-1-1
	���90�̸�~80�̻� : B	F-2-1-1
	���80�̸�~70�̻� : C	F-2-1
	���70�̸�~60�̻� : D	F-2
	���60�̸� : F		
*/
	
class Ex09{

  public static void main(String[] args){
	
	String title = "�����������α׷�(ver.0.0.1)";
	int kor,eng,math;
	kor = 86;
	eng = 93;
	math = 74;
	int total = kor+eng+math;
	double avg = total*100/3/100.0;	//�Ҽ�2°¥������ ����Ϸ���
	char grade='F';
	
	switch(total/3/10){
	   case 10:
	   case 9:
		grade-=1;
	   case 8:
		grade-=1;
	   case 7:
		grade-=1;
	   case 6:
		grade-=2;
	   default :
	}
	
	System.out.println("\n\n"+title+"\n");
	System.out.println("-----------------");
	System.out.println("����\t|����\t|����\t|����\t|���\t|����");
	System.out.println("--------------------------------------------");
	System.out.println(kor+"\t|"+eng+"\t|"+math+"\t|"+total+"\t|"+avg+"\t"+grade);
	System.out.println("--------------------------------------------");

	
  }//main end

}//class end