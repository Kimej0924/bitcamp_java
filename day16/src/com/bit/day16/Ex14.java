package com.bit.day16;

import java.util.Date;

public class Ex14 {

	public static void main(String[] args) {		//기준년이1900년이야
		java.util.Date now = null;
		java.util.Date now2 = null;
//		now = new Date(2002-1900,5-1,1,12,0);
		//24h->24*60*60*1000
		now = new Date(System.currentTimeMillis()+24L*60*60*1000*1);
		now2 = new Date(System.currentTimeMillis());
		System.out.println(now.after(now2));	//now의 다음날이 now2냐~ true
		System.out.println(now.before(now2));	//now의 전날이 now2냐~ false
		System.out.println(now.compareTo(now2));	//now기준으로 now2가 얼마만큼 차이가 나냐
		System.out.println(Date.parse("Sat, 12 Aug 1995 13:30:00 GMT"));	
		System.out.println(Date.parse("2002/01/01 12:00:00"));	
		System.out.println(now);
		System.out.println(now.getYear()+1900+"년");	//1900을 안더하면 119가 나와
		System.out.println(now.getMonth()+1+"월");		//처음이 0부터라 1더줌
		System.out.println(now.getDate()+"일");
		System.out.println(now.getDay()+"요일");		//
		System.out.println(now.getHours()+"시");		//24시간 기준
		System.out.println(now.getMinutes()+"분");
		System.out.println(now.getSeconds()+"초");

	}

}
