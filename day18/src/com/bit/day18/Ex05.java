package com.bit.day18;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;

public class Ex05 extends Frame{
	public Ex05(){
		setLayout(new BorderLayout());
		java.awt.Label la1 = new Label("문자열");
		
		Panel p1=new Panel();
		List list = new List(5,true);		// List(리스트의 사이즈,true[다중선택])
		list.addItem("item1");		//(나오는이름,순서설정)
		list.addItem("item2");
		list.addItem("item3");
		list.addItem("item4");
		list.add("item5");
		
		p1.add(la1);
		p1.add(list);
		add(p1);
		setBounds(1050,120,200,300);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new Ex05();

	}

}
