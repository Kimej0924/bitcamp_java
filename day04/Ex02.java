	//구구단 2단~9단까지 출력하세요
	
class Ex02{
	
public static void main(String[] args){
	
	int start = 2;
	int limit = 9;
	int su = 9;
	System.out.println("구구단 "+start+"단~"+limit+"단\n");
	System.out.println("-----------------------------------------------------------------");
	for(int i=start; i<=limit; i++){
		System.out.print("  "+i+"단\t");
	}
	System.out.println("\n-----------------------------------------------------------------");
	
	int a = 1;
	for(int j=1; j<=su; j++){
		for(int dan=start; dan<=limit; dan++){		//2x1=2	3x1=3	4x1=4
			a=dan*j;
			System.out.print(dan+"X"+j+"="+a+"\t");		
		}
		System.out.println();
	}

	System.out.println("-----------------------------------------------------------------");

	
}//main end

}//class end