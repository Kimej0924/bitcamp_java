class Ex04{

  public static void main(String[] args){
	//���
	//1.���ǹ�(if��)
	//���� ~~�̶��
	//if(����-boolean){���๮;���๮;~}
	System.out.println("if�� ����");

	int a = 3;
	if(a>2){
		System.out.println("a�� 2���� Ů�ϴ�.");	
	}
	if(a<=2){
		System.out.println("a�� 2���� ũ���ʽ��ϴ�.");
	}
	System.out.println("if�� ��");
	System.out.println("--------------------");
	
	// if~else��(����~�̶��~�ϰ�, �ƴϸ�~�ض�)
	// if(����){���϶�����;}else{�����϶�����;}
	
	if(a>2){
		System.out.println("a�� 2���� Ů�ϴ�.");	
	}else{
		System.out.println("a�� 2���� ũ���ʽ��ϴ�.");
	}
	System.out.println("--------------------");
	/* 
	b=9;
	������ ����ϼ���
	����̰� Ȧ���Դϴ�.
	����̰� ¦���Դϴ�.
	�����̰� Ȧ���Դϴ�.
	�����̰� ¦���Դϴ�.
	*/

	int b = -5;

	if(b>0&&b%2==1){
		System.out.println("����̰� Ȧ���Դϴ�.");
	}
	if(b>0&&b%2==0){
		System.out.println("����̰� ¦���Դϴ�.");
	}
	if(b==0){
		System.out.println("0�Դϴ�.");
	}
	if(b<0&&b%(-2)==1){
		System.out.println("�����̰� Ȧ���Դϴ�.");
	}
	if(b<0&&b%(-2)==0){
		System.out.println("�����̰� ¦���Դϴ�.");

	}





  }//main end

}//class end