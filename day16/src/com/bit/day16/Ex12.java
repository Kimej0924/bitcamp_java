package com.bit.day16;

import java.util.Calendar;

public class Ex12 {

	public static void main(String[] args) {
		// ��¥�ð�
		Calendar cal=Calendar.getInstance();
		Calendar start = Calendar.getInstance();
		char[] ch={'��','��','ȭ','��','��','��','��'};

		start.set(2019,10-1,21,9,10);	//���ϴ� ��¥�� ���ð���	
		

		System.out.println("������ ��¥�ð�");
		System.out.println(cal.get(cal.YEAR)+"�� "+(cal.get(cal.MONTH)+1)+"�� "+cal.get(cal.DATE)+"��");
		System.out.println(cal.get(cal.HOUR)+"�� "+cal.get(cal.MINUTE)+"�� "+cal.get(cal.SECOND)+"��");
		
		System.out.println(ch[cal.get(cal.DAY_OF_WEEK)-1]+"����");
		
		System.out.println("------------------------");
		System.out.println("����������������");

		int calDay=cal.get(cal.DAY_OF_YEAR);
		int calWeek=cal.get(cal.WEEK_OF_YEAR);
		int startDay=start.get(cal.DAY_OF_YEAR);
		int startWeek=start.get(cal.WEEK_OF_YEAR);
//		System.out.println(calDay);
//		System.out.println(startDay);
		
		System.out.println(calDay-startDay+1+"��°");
		System.out.println(calWeek-startWeek+1+"����");
//		System.out.println(cal.get(cal.WEEK_OF_YEAR)+"����");
//		System.out.println(cal.getTimeInMillis());
//		System.out.println(System.currentTimeMillis());
	}


}