package com.bit.day16;

import java.util.Date;

public class Ex14 {

	public static void main(String[] args) {		//���س���1900���̾�
		java.util.Date now = null;
		java.util.Date now2 = null;
//		now = new Date(2002-1900,5-1,1,12,0);
		//24h->24*60*60*1000
		now = new Date(System.currentTimeMillis()+24L*60*60*1000*1);
		now2 = new Date(System.currentTimeMillis());
		System.out.println(now.after(now2));	//now�� �������� now2��~ true
		System.out.println(now.before(now2));	//now�� ������ now2��~ false
		System.out.println(now.compareTo(now2));	//now�������� now2�� �󸶸�ŭ ���̰� ����
		System.out.println(Date.parse("Sat, 12 Aug 1995 13:30:00 GMT"));	
		System.out.println(Date.parse("2002/01/01 12:00:00"));	
		System.out.println(now);
		System.out.println(now.getYear()+1900+"��");	//1900�� �ȴ��ϸ� 119�� ����
		System.out.println(now.getMonth()+1+"��");		//ó���� 0���Ͷ� 1����
		System.out.println(now.getDate()+"��");
		System.out.println(now.getDay()+"����");		//
		System.out.println(now.getHours()+"��");		//24�ð� ����
		System.out.println(now.getMinutes()+"��");
		System.out.println(now.getSeconds()+"��");

	}

}
