class Ex01{
/*
class Ŭ������{}
Ŭ������
- ù���� ���� Ư������ �Ұ�(���� _ $)
- ù���ڰ� �빮�ڷ� ����
- �ΰ� �̻��� �ܾ� ����
	�ι�° �ܾ��� ù���ڸ� �빮��
- ���� ��Ű������ Ŭ������ �̸��ߺ��� �Ұ�

Ŭ������ �������
	1. �޼���
���� ���θ��� ����ϰ� ���ο��� ȣ����� �޼��带 ����Ѵ�
ȣ����� ���������� ���� �ϰԵȴ�

*/	
public static void main(String[] args){
	System.out.println("����");
	func1();
	System.out.println("��");
		
}// main end


	// �޼���
	// �޼���� �ߺ� �Ұ�(�޼��� �����ε� ����(func1(), func1(int a) ��밡��// int,double�� ����)
	// public static void �޼����(�Ű�����[����]){}	�Ű������� �ʿ信���� �������� ���������ִ�
	// �޼����� ȣ����
	// ��������,���ڰ���,����Ÿ�� ��ġ�ؾ� ȣ�Ⱑ��
public static void func1(){
	System.out.println("�޼���1");
	func2();
	System.out.println("�޼���1��");
	
}// func1 end

public static void func2(){

	System.out.println("�޼���2");

}// func2 end


}// class end