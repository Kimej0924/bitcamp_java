package com.bit.day09;

public class Exre03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �ֹι�ȣ üũ
		// �ֹι�ȣ �Է�>100101-3123456
		// ����� 00�� �����Դϴ�
				
		// �ֹι�ȣ �Է�>020101-4123456		14�� 6+"-"+7
		// ����� 00�� �����Դϴ�
		
		// �ֹι�ȣ �Է�>990101-2123456
		// ����� 00�� �����Դϴ�	
		
		// �ֹι�ȣ�Է�>9901012123456
		// ������Ŀ� �°� �ٽ� �Է��ϼ���(000000-0000000)
		
		// �ֹι�ȣ�Է�>990101-212345
		// �ٽ�Ȯ���Ͻð� ��Ȯ�� �Է��� �ּ���
		
		
		System.out.println("�ֹι�ȣ üũ ���α׷�");
			while(true){
			System.out.println("�ֹε�Ϲ�ȣ�� �Է��� �ּ���");
			java.util.Scanner sc;
			sc = new java.util.Scanner(System.in);
			String input = sc.nextLine();
			
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
					System.out.println("����ó��");	
					switch(arr[0]){
					case '0':	case '1':
						System.out.println("2000���");
						break;
						
					case '2':	case '3':	case '4':	case '5':
					case '6':	case '7':	case '8':	case '9':		
						System.out.println("19"+arr[0]+"0���");
						break;
						
					}
				}
				
			}

			
		}
				
						

	}

}
