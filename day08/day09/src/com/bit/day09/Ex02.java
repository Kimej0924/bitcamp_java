package com.bit.day09;

public class Ex02 {

	public static void main(String[] args) {
		// ���ڿ��� ����
		
//		abcd
//		�����ٶ�
//		1234
//		!@#$
		String msg="abcd\\�����ٶ�\n1234\n!@#$";  //���� ���� ǥ���Ҷ� ���������� ���� �����Ͱ�
		System.out.println(msg);
		
		String msg2="";		//msg2�� ��������
		int cnt=msg2.length();
		System.out.println(msg2+"�� ���ڼ��� "+cnt);
		boolean empty=false;
		if(cnt==0){empty=true;}
		System.out.println("���ڰ� ����°�? "+empty);
		empty=msg2.isEmpty();
		System.out.println("���ڰ� ����°�? "+empty);

		for(int i=0; i<msg.length(); i++){
			char ch=msg.charAt(i);			// ���ڿ��� ���ϴ� �ڸ��� ���ڸ� �̾Ƴ��°�
			System.out.print(ch);
		}		
			
//		System.out.println(msg.charAt(1));
//		System.out.println(msg.charAt(4));	// \n �ڸ�
//		System.out.println(msg.charAt(5));

		System.out.println("\n--------------");
		String msg3="921019";
		char[] arr3=msg3.toCharArray();		//���ڿ��� ���ڷ� �ɰ��°�(string->char)
		for(int i=0; i<arr3.length; i++){
			System.out.println(arr3[i]);
		}
	
		String msg4;
		msg4 = new String(arr3);
		System.out.println(msg4);
		System.out.println("--------------");
		
		
		int change = Integer.parseInt(msg4);		//string ���ڸ� int ���ڷ� ��ȯ
		
		System.out.println(change+"1="+(change+1));
		System.out.println("============");

		byte[] arr4=msg3.getBytes();
		for(int i=0; i<arr4.length; i++){
			System.out.println(arr4[i]);
		}
		
		for(int i=0; i<arr3.length; i++){
			System.out.println((int)arr3[i]);		//��,�� �� ���� ����ǥ���� Ȯ��
		}
		
		String msg5=new String(arr4);	//���ڸ� ���ڿ��� �����ؼ� 
		
			System.out.println(msg5);
			

	}

}
