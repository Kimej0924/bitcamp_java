class Ex07{

	public static void main(String[] args){

		//������ ����
		
		char ch;
		ch = 'A';
		System.out.println("ch = " + ch);
		ch = '\uac01';
		System.out.println("ch = " + ch);
		ch = '��';
		System.out.println("ch = " + ch);
		ch = (char)97;		
		//�ڵ�����ȯ�� �Ǵ��� ������ ������ ������ ��������ȯ�� ���ִ°� �� ����
		System.out.println("ch = " + ch);
		ch = '1';		
		// ���� 1�� �ν��ϱ⶧���� 1�� �ش��ϴ°��� int �� ����ȯ�ϸ� 49�� ���
		System.out.println("ch = " + (int)ch);
		ch = '\\';		
		System.out.println("ch = " + ch);


		//���ڿ��� �Ϲ��ڷ����� �ƴϴ�
		String st="���ڿ��� \n \"����\"�ȿ� �ۼ�";
		System.out.println(st);

		st="PATH=\"C:\\Program Files\\Java\\jdk1.8.0_231\\bin\"";
		System.out.println(st);

	
	}// main end

}// class end