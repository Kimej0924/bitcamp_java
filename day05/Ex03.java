class Ex03{

public static void main(String[] args){
	

	for(int i=0; i<5; i++){
		
		//if(i>2){return;}	//���� �޼ҵ��� ����
		//if(i>2){break;}	// for������ break�� ������ Ż��
		if(i>2){continue;}	// �ݺ��г��ο����� ��밡�� ������ �ٽ� for ���ǰ˻��Ϸ� ��
				// �ݺ����� 5�� �ٵ��µ� if�� �ɷ��� break�� ���� ����µǴ°�
		System.out.println(i+1+"��° �ݺ�");

	}
	System.out.println("main end");

	








}// main end



}// class end