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
	
class Ex06{

  public static void main(String[] args){
	
	String title = "\n---�������----\n";
	int kor = 86;
	int eng = 93;
	int math = 74;
	int sum = kor+eng+math;
	double avg = sum/3.0;
	System.out.println(title);
	System.out.println("���� : "+kor);
	System.out.println("���� : "+eng);
	System.out.println("���� : "+math);

	System.out.println("�հ� : "+sum);
	System.out.println("��� : "+avg);

	System.out.println("------------------");
	if(kor<0||eng<0||math<0){
		System.out.println("������ �ٽ�Ȯ���ؿ�");
	}else{	

		if(avrg<=100&&avrg>=90){
			System.out.println("���� : A ");
		}else if(avrg<90&&avrg>=80){
			System.out.println("���� : B ");
		}else if(avrg<80&&avrg>=70){
			System.out.println("���� : C ");
		}else if(avrg<70&&avrg>=60){
			System.out.println("���� : D ");
		}else if(avrg<60&&avrg>=0){
			System.out.println("���� : F ");
		}else{
			System.out.println("��������");
		}
	}
	


  }//main end

}//class end