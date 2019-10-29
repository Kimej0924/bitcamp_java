class Ex09{
  public static void main(String[] args){

	String star = "****";
	for(int i=0; i<4; i++){
		System.out.println(star);	
	}
	System.out.println("-----------------");

	for(int x=0; x<4; x++){
		for(int y=0; y<4; y++){
			System.out.print('¡Ù');	
		}
		System.out.println();
	}
	
	System.out.println("-----------------");
	star = "****n****n****n****";
	//	1234567890123456789
	
	//5ÀÇ ¹è¼ö	a3%5==0
	for(int a=1; a<20; a++){
		if(a%5==0){
			System.out.println();
		}else{
			System.out.print('*');
		}	

	}
	 
	System.out.println("\n-----------------");
	
	int su = 1;
	for(int x=0; x<3; x++){
		for(int y=0; y<3; y++){
			System.out.print(su++);	
		}
		System.out.println();
	}

	System.out.println("-----------------");
	su=1;
	for(int a=1; a<13; a++){
		if(a%4==0){
			System.out.println();
		}else{
			System.out.print(su++);
		}	

	}

	System.out.println("-----------------");

	int suu = 123;
	for(int i=0; i<3; i++){
		System.out.println(suu+333*i);	
	}

	System.out.println("-----------------");

	for(int x=0; x<3; x++){
		for(int y=0; y<3; y++){
			System.out.print(1+y+x);	
			
		}
		System.out.println();
	}
	
	System.out.println("-----------------");

	//star = "****n****n****n****";
	//	1234567890123456789

	for(int a=1; a<13; a++){
		if(a%4==0){
			System.out.println();
		}else{
			System.out.print(a%4+a/4);
		}	

	}

	System.out.println("-----------------");
	
	int su3 = 123;
	for(int i=0; i<3; i++){
		System.out.println(su3+111*i);	
	}

  }// main end


}// class end