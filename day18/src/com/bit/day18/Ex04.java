package com.bit.day18;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;

public class Ex04 extends Frame{

	public Ex04(){
		Panel p1 = new Panel();
		java.awt.Choice cho =  new Choice();
		cho.addItem("item1");
		cho.addItem("item2");
		cho.addItem("item3");
		cho.addItem("item4");
		cho.addItem("item5");

		
		p1.add(cho);
		add(p1);
		
		setBounds(1050,120,200,300);		//(나오는좌표,사이즈)
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex04();

	}

}
