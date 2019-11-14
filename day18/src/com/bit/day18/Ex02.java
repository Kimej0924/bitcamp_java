package com.bit.day18;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;

public class Ex02 {

	public static void main(String[] args) {
		Panel p1 = new Panel();
		java.awt.Frame frame = new Frame();
		java.awt.TextArea ta = new TextArea("",4,15,TextArea.SCROLLBARS_VERTICAL_ONLY);	//스크롤은 생성자에서만 설정가능
//		java.awt.TextArea ta = new TextArea("",4,15);
//		java.awt.TextArea ta = new TextArea();
		
//		ta.setColumns(15);			//가로넓이
//		ta.setRows(3);				//세로줄수
//		ta.setText("초기값");
//		ta.setVisible(false);
//		ta.setEditable(false);		//수정불가
//		ta.setEnabled(false);		//비활성화
		
		
		p1.add(ta);
		frame.add(p1);
		frame.setLocation(1050,120);
		frame.setSize(200,300);
		frame.setVisible(true);

	}

}
