package com.bit.day16;

import java.util.Calendar;

public class Ex11 {

	public static void main(String[] args) {
		// ��¥�ð�
		Calendar cal=Calendar.getInstance();

		char[] ch={'��','��','ȭ','��','��','��','��'};

		cal.set(2002,5,1);	//���ϴ� ��¥�� ���ð���	
		
//		System.out.println(cal.YEAR);
//		System.out.println(cal.MONTH);	//���� 0~11���� ����
//		System.out.println(cal.DATE);
//		System.out.println(cal.get(1)+" "+cal.get(2)+" "+cal.get(5));
		System.out.println(cal.get(cal.MONTH)+1+"�� ");

		System.out.println(cal.get(cal.YEAR)+"�� "+(cal.get(cal.MONTH)+1)+"�� "+cal.get(cal.DATE)+"��");
		System.out.println(cal.get(cal.HOUR)+"�� "+cal.get(cal.MINUTE)+"�� "+cal.get(cal.SECOND)+"��");
		
		System.out.println(ch[cal.get(cal.DAY_OF_WEEK)-1]+"����");
		
		System.out.println("------------------------");
		if(cal.get(cal.AM_PM)==0){
			System.out.println("a.m. ");
		}else{//am=0, pm=1
			System.out.print("p.m. ");
		}
		System.out.println(cal.get(cal.HOUR)+"�� "+cal.get(cal.MINUTE)+"�� "+cal.get(cal.SECOND)+"��");
//		System.out.println(cal.get(cal.AM)+". ");
//		System.out.println(cal.get(cal.AM_PM)+". ");
		
		System.out.println("------------------------");
		System.out.println(cal.get(cal.HOUR_OF_DAY)+"�� "+cal.get(cal.MINUTE)+"�� "+cal.get(cal.SECOND)+"��");
		
		System.out.println(365-cal.get(cal.DAY_OF_YEAR)+"��°");
		System.out.println(cal.get(cal.WEEK_OF_MONTH)+"����");
		System.out.println(cal.get(cal.WEEK_OF_YEAR)+"����");
		System.out.println(cal.getTimeInMillis());
		System.out.println(System.currentTimeMillis());
	}


}
