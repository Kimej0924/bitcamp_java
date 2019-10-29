/*
Q1.	Q2.	Q3.	Q4.
*	****	   *	****
**	***	  **	 ***
***	**	 ***	  **
****	*	****	   *
Q5.
   *
  ***
 *****
*******
Q6.
1/2 + 2/3 + 3/4 + ... + 999999/1000000
*/

class Ex08{

  public static void main(String[] args){

	System.out.println("Q1.");
	//Q1.
	//*
	//**
	//***
	//****
	for(int i=0; i<4; i++){
		for(int j=0; j<i+1; j++){
		System.out.print("*");
		}
	System.out.println("");	
	}

	System.out.println("Q2.");
	//Q2.
	//****
	//***
	//**
	//*
	for(int i=0; i<4; i++){
		for(int j=0; j<4-i; j++){
			System.out.print("*");
		}
		System.out.println("");	
	}

	System.out.println("Q3.");
	//Q3.
	//   *
	//  **
	// ***
	//****
	for(int i=1; i<=4; i++){
		for(int j=1; j<=4-i; j++){
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++){
			System.out.print("*");
		}
		System.out.println();	
	}

	System.out.println("Q4.");
	//Q4.
	//****
	// ***
	//  **
	//   *
	for(int i=0; i<4; i++){
		for(int j=0; j<i; j++){
			System.out.print(" ");
		}
		for(int k=0; k<4-i; k++){
			System.out.print("*");
		}
		System.out.println();
	}

	System.out.println("Q5.");
	//   *
	//  ***
	// *****
	//*******
/*	for(int i=0; i<4; i++){
		for(int j=0; j<4-i; j++){
			System.out.print(" ");
		}
		for(int k=0; k<2*i+1; k++){
			System.out.print("*");
		}
		System.out.println();
	}
*/

	for(int j=0; j<4; j++){
		for(int i=0; i<4; i++){
			//if(i<4){@;}else{*;}
			if(i<4-j-1){
			System.out.print('@');
			}else{
			System.out.print('*');
			}
		}
	

		for(int i=0; i<3; i++){
			if(i<0+j){
			System.out.print('*');
			}
		}

		System.out.println();
	}


	System.out.println("Q6.1/2 + 2/3 + 3/4 + ... + 999999/1000000");
	//1/2 + 2/3 + 3/4 + ... + 999999/1000000
	double result1=0.0;
	for(int i=1; i<1000000; i++){
		result1+=(1-1.0/(i+1));		//result=result+(1-1.0/(i+1));
		//result1=result1+(i*1.0/(i+1));		//result+=(i*1.0/(i+1));
	}
	System.out.println("="+result1);

/*	System.out.println("------------------------");

	System.out.println("Q6.1/2 + 2/3 + 3/4 + ... + 999999/1000000");
	//1/2 + 2/3 + 3/4 + ... + 999999/1000000
	double result=0.0;
	double sol=0.0;
	for(int i=1; i<1000000; i++){
		result=result+(1.0/(i+1));		//result+=(i*1.0/(i+1));

	}
		sol=999999-result;
	System.out.println("="+sol);

	System.out.println("------------------------");

	double result2=999999.0;
	for(int i=1; i<1000000; i++){
		result2-=1.0/(i+1);		//result=result+(1-1.0/(i+1));
		//result1=result2+(i*1.0/(i+1));		//result+=(i*1.0/(i+1));
	}
	System.out.println("="+result2);
*/


  }// main end
}// class end