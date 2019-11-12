package com.bit.day16;

import java.util.Calendar;

public class Ex11 {

	public static void main(String[] args) {
		// 날짜시간
		Calendar cal=Calendar.getInstance();

		char[] ch={'일','월','화','수','목','금','토'};

		cal.set(2002,5,1);	//원하는 날짜로 셋팅가능	
		
//		System.out.println(cal.YEAR);
//		System.out.println(cal.MONTH);	//월은 0~11까지 나옴
//		System.out.println(cal.DATE);
//		System.out.println(cal.get(1)+" "+cal.get(2)+" "+cal.get(5));
		System.out.println(cal.get(cal.MONTH)+1+"월 ");

		System.out.println(cal.get(cal.YEAR)+"년 "+(cal.get(cal.MONTH)+1)+"월 "+cal.get(cal.DATE)+"일");
		System.out.println(cal.get(cal.HOUR)+"시 "+cal.get(cal.MINUTE)+"분 "+cal.get(cal.SECOND)+"초");
		
		System.out.println(ch[cal.get(cal.DAY_OF_WEEK)-1]+"요일");
		
		System.out.println("------------------------");
		if(cal.get(cal.AM_PM)==0){
			System.out.println("a.m. ");
		}else{//am=0, pm=1
			System.out.print("p.m. ");
		}
		System.out.println(cal.get(cal.HOUR)+"시 "+cal.get(cal.MINUTE)+"분 "+cal.get(cal.SECOND)+"초");
//		System.out.println(cal.get(cal.AM)+". ");
//		System.out.println(cal.get(cal.AM_PM)+". ");
		
		System.out.println("------------------------");
		System.out.println(cal.get(cal.HOUR_OF_DAY)+"시 "+cal.get(cal.MINUTE)+"분 "+cal.get(cal.SECOND)+"초");
		
		System.out.println(365-cal.get(cal.DAY_OF_YEAR)+"일째");
		System.out.println(cal.get(cal.WEEK_OF_MONTH)+"주차");
		System.out.println(cal.get(cal.WEEK_OF_YEAR)+"주차");
		System.out.println(cal.getTimeInMillis());
		System.out.println(System.currentTimeMillis());
	}


}
