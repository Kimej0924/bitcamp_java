class Receipt1{

	public static void main(String[] args){
	
		String title = "\n��Ʈ������\n------------\n\n";

		int item1 = 900;
		int item2 = 3500;
		int item3 = 2000;		//��ǰ�ܰ�

		int su1 = 2;
		int su2 = 1;
		int su3 =	3;		//���ż���

		int sum1 = item1*su1;
		int sum2 = item2*su2;
		int sum3 = item3*su3;
		int totalSum = sum1+sum2+sum3;	//�հ�

		System.out.println(title);
		System.out.println("��ǰ\t|�ܰ�\t|����\t|�հ�");
		System.out.println("-----------------------------------");
		System.out.println("����\t|"+item1+"\t|"+su1+"\t|"+sum1);
		System.out.println("�ٳ���\t|"+item2+"\t|"+su2+"\t|"+sum2);
		System.out.println("����\t|"+item3+"\t|"+su3+"\t|"+sum3);
		System.out.println("-----------------------------------");
		System.out.println("�հ�\t|\t\t"+totalSum+"��");
	
	
	

	}//main end

}//class end