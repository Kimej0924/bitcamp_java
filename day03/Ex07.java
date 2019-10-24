class Ex07{

  public static void main(String[] args){
	//제어문
	//조건문(switch문)
	/*swich(조건-값){
		case 값:
		실행문;
		break;
		case 값:
		실행문;
		break;
		case 값:
		실행문;
		break;
		default:
		실행문;
	}
	*/
	//case 안에서는 연산자 사용불가능! 일치하는 특정값이 있어야 실행됨
	char su='c';
	
	switch(su){
	   case 'a':
		System.out.println("a입니다");
		break;			
	   case 'b':
		System.out.println("b입니다");
		break;
	   case 'c':
		System.out.println("c입니다");
		break;
	   case 'd':
		System.out.println("d입니다");
		break;
	   default:
		System.out.println("모르겠습니다");
		break;


	}





  }//main end

}//class end