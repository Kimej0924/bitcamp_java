package com.bit.day09;

public class Ex03 {

	public static void main(String[] args) {
		// �ֹι�ȣ üũ
		// �ֹι�ȣ �Է�>100101-3123456
		// 2019-2000-10+1
		// ����� 10�� �����Դϴ�
		
		// �ֹι�ȣ �Է�>020101-4123456		14�� 6+"-"+7
		// 2019-2000-2+1
		// ����� 18�� �����Դϴ�
		
		// �ֹι�ȣ �Է�>890101-2123456
		// 2019-1900-99+1
		// ����� 31�� �����Դϴ�	
		
		// �ֹι�ȣ�Է�>9901012123456
		// ������Ŀ� �°� �ٽ� �Է��ϼ���(000000-0000000)
		
		// �ֹι�ȣ�Է�>990101-212345
		// �ٽ�Ȯ���Ͻð� ��Ȯ�� �Է��� �ּ���
		
		
		System.out.println("�ֹι�ȣ üũ ���α׷�");

		while(true){

			java.util.Scanner sc;
			sc = new java.util.Scanner(System.in);
			String input = null;
			int age=2019+1;
			char gender='��';
			
			System.out.print("�ֹι�ȣ�Է� >");			
			input = sc.nextLine();	
			char[] arr=input.toCharArray();
			for(int i=0; i<arr.length; i++){
				//System.out.println(arr[i]);
				if(i<6){
					if(arr[i]=='-'){				// ��6�ڸ��� - ������
						System.out.println("�ٽ�Ȯ���Ͻð� ��Ȯ�� �Է����ּ���");	
						break;
						}
				}else if(i==6&&arr[i]!='-'){		// - �ڸ��� �ٸ����� ������
					System.out.println("�ٽ�Ȯ���Ͻð� ��Ȯ�� �Է����ּ���");
					break;
				}else if(i>6&&i<14){				// ��7�ڸ��� - ������
					if(arr[i]=='-'){
						System.out.println("�ٽ�Ȯ���Ͻð� ��Ȯ�� �Է����ּ���");
						break;
						}					
				}else if(i>=arr.length){			// �Է� �ڸ����� �ʰ�������
					System.out.println("�ٽ�Ȯ���Ͻð� ��Ȯ�� �Է����ּ���");
					break;
				}else{
					char ch1=input.charAt(0);
					if(ch1=='0'||ch1=='1'){
						age-=2000;
					}else{
						age-=1900;
					}
					char ch2=input.charAt(1);
					age-=(ch1-'0')*10+(ch2-'0');
					
					char ch8=input.charAt(7);
					
					switch(ch8){
					
						case '1':
						case '3':
							gender='��';
							break;
						case '2':
						case '4':
							gender='��';
							break;
					}
					
					System.out.println("����� "+age+"�� "+gender+"���Դϴ�.");
				}
						
			}
		}
				
	}					
}


