class Ex02{

	public static void main(String[] args){
		//����������	//��Ʈ���������� �ϳ� �� ���� /+2���Ǵ¼��� int���̵Ǵϱ�
		int a;		//��Ģ���꺸�� �����Ͼ�� �켱������
		a=100;

		System.out.println("a="+a);
		a=a+1;
		System.out.println("a="+a);
		a=a+1;
		System.out.println("a="+a);

		a++;	
		System.out.println("a="+a);
		++a;
		System.out.println("a="+a);

		a=++a;	//�������� �����ȴ�
		System.out.println("a="+a);
		a=a++;	//�̽��������� a�����������ʰ� ���������� �����Ѵ�
		System.out.println("a="+a);
		a+=1;		//a=a+1�� �ٿ��� ���� (a*=3, a/=2 �� ����)
		System.out.println("a="+a);

		System.out.println("-----------");
		
		int b=10;
		System.out.println((++b)+b+(++b));
		//System.out.println((11)+11+(12));	

		System.out.println("-----------");
		System.out.println(3>2);
		System.out.println(3<2);
		System.out.println(3>=2);
		System.out.println(3<=2);
		System.out.println(3+2-(100*2)>(2*2)-(9%2));
		int c=2;
		System.out.println(c==3-1);	//������
		System.out.println(c!=3-1);	//�ٸ���(==�� �ݴ�)

		System.out.println("=================");
		System.out.println(true&&true);	//and������ �ΰ��� true���� true
		System.out.println(true&&false);
		System.out.println(false&&false);		
		System.out.println(true||true);	//or������ ���� �ϳ�true�� true
		System.out.println(true||false);
		System.out.println(false||false);

		System.out.println("-----------");
		System.out.println(!true);
		System.out.println(!false);
		
		

	}//main end

}//class end