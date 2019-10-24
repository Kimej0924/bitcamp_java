/*
Q1. 
* * * *
* * * *
* * * *
* * * *

Q2.
1 2 3
4 5 6
7 8 9

Q3.
1 2 3 
2 3 4
3 4 5

*/
class Ex07{
	
public static void main(String[] args){
	
	System.out.println("Q1--------------------");
	int q1=1;
	while(q1<5){	
		int i =1;
		while(i<5){
			System.out.print("* ");
			i++;
		}
		System.out.println();
		q1++;
	}
	
	System.out.println("Q2--------------------");

/*	int q2=1;
	while(q2<=1){	
		int i1 =1;
		while(i1<=3){
			System.out.print(i1);
			i1++;
		}
		System.out.println();
		int i2 =4;
		while(i2<=6){
			System.out.print(i2);
			i2++;
		}
		System.out.println();
		int i3 =7;
		while(i3<=9){
			System.out.print(i3);
			i3++;
		}
		System.out.println();
		q2++;
	}
*/
	int q2=1;
	while(q2<=9){	
		System.out.print(q2+"  ");
		if(q2%3==0){System.out.println();}
		q2++;
	}


	System.out.println("Q3--------------------");

/*	int q3=1;
	while(q3<=1){	
		int i4 =1;
		while(i4<=3){
			System.out.print(i4);
			i4++;
		}
		System.out.println();
		int i5 =2;
		while(i5<=4){
			System.out.print(i5);
			i5++;
		}
		System.out.println();
		int i6 =4;
		while(i6<=6){
			System.out.print(i6);
			i6++;
		}
		System.out.println();
		q3++;
	}
*/

	int q3=1;
	while(q3<=3){	
		
		System.out.print((q3+0)+" "+(q3+1)+" "+(q3+2));
		System.out.println();	
		q3++;
	}






}//main end

}//class end