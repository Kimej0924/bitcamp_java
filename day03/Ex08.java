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
	
class Ex08{

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
	System.out.println("����\t|����\t|����\t|����\t|���\t|����");
	System.out.println("--------------------------------------------");
	System.out.println(kor+"\t|"+eng+"\t|"+math+"\t|"+total+"\t|"+avg+"\t"+grade);
	System.out.println("--------------------------------------------");

	
  }//main end

}//class end