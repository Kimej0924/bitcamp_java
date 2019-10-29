class Ex03{

public static void main(String[] args){
	

	for(int i=0; i<5; i++){
		
		//if(i>2){return;}	//메인 메소드의 종료
		//if(i>2){break;}	// for문에서 break를 만나면 탈출
		if(i>2){continue;}	// 반복분내부에서만 사용가능 만나면 다시 for 조건검사하러 감
				// 반복문은 5번 다도는데 if에 걸려서 break와 같은 값출력되는거
		System.out.println(i+1+"번째 반복");

	}
	System.out.println("main end");

	








}// main end



}// class end