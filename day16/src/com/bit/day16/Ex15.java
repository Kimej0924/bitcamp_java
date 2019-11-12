package com.bit.day16;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex15 {

	public static void main(String[] args) {
		Date now=new Date();
		System.out.println(now);
		
//		String myString = null;
//		DateFormat df = DateFormat.getDateInstance();
//		df = DateFormat.getDateInstance(DateFormat.LONG);
//		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
//		df = DateFormat.getDateInstance(DateFormat.SHORT);
//		df = DateFormat.getDateInstance(DateFormat.DEFAULT);
//		df = DateFormat.getDateInstance(DateFormat.FULL);
//		
//		myString = df.format(now);
//		
//		System.out.println(myString);
		
	
		java.text.SimpleDateFormat sdf = null;
		sdf = new SimpleDateFormat("yy-MM-dd hh:mm:ss");	//출력시 패턴 설정(월은 대문자M)(분은 소문자m)
		String msg = sdf.format(now);
		System.out.println(msg);
	}

}
