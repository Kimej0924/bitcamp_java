//������ ������
//���ϴ� ������

class Ex08{

  public static void main(String[] args){
	java.util.Scanner sc = new java.util.Scanner(System.in);	//�Է¹����غ�
	System.out.print("���ϴ� ������ ���� = ");
	
	int su = sc.nextInt();						//�Է¹ޱ�
	System.out.println(su+" ��");					//�Է¹��������

	for(int i=1;i<=9;i++){
		System.out.println(su+"x"+i+"="+(su*i));
	}
	System.out.println("-----------------");

	System.out.println("������ ������ ��� 1���ϱ� ");

	int ran = (int)(Math.random()*9)+1;
	for(int i=1;i<=9;i++){
		System.out.println(ran+"x"+i+"="+(ran*i));
	}

  }// main end



}// class end