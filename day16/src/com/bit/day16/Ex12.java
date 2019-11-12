package com.bit.day16;

import java.util.Calendar;

public class Ex12 {

	public static void main(String[] args) {
		// 날짜시간
		Calendar cal=Calendar.getInstance();
		Calendar start = Calendar.getInstance();
		char[] ch={'일','월','화','수','목','금','토'};

		start.set(2019,10-1,21,9,10);	//원하는 날짜로 셋팅가능	
		

		System.out.println("오늘의 날짜시간");
		System.out.println(cal.get(cal.YEAR)+"년 "+(cal.get(cal.MONTH)+1)+"월 "+cal.get(cal.DATE)+"일");
		System.out.println(cal.get(cal.HOUR)+"시 "+cal.get(cal.MINUTE)+"분 "+cal.get(cal.SECOND)+"초");
		
		System.out.println(ch[cal.get(cal.DAY_OF_WEEK)-1]+"요일");
		
		System.out.println("------------------------");
		System.out.println("수업시작한지이이");

		int calDay=cal.get(cal.DAY_OF_YEAR);
		int calWeek=cal.get(cal.WEEK_OF_YEAR);
		int startDay=start.get(cal.DAY_OF_YEAR);
		int startWeek=start.get(cal.WEEK_OF_YEAR);
//		System.out.println(calDay);
//		System.out.println(startDay);
		
		System.out.println(calDay-startDay+1+"일째");
		System.out.println(calWeek-startWeek+1+"주차");
//		System.out.println(cal.get(cal.WEEK_OF_YEAR)+"주차");
//		System.out.println(cal.getTimeInMillis());
//		System.out.println(System.currentTimeMillis());
	}


}