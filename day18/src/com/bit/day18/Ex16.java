package com.bit.day18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex16 extends Frame{

	public Ex16(){
		Panel p = new Panel();
		p.setLayout(null);
//		setLayout(null);		//백지화되는거라 사이즈 위치 다 선정해줘야원하는자리가능
		Button btn1=new Button("버튼1");
		btn1.setSize(100, 100);
		btn1.setLocation(284, 261);
		p.add(btn1);
		add(p);
		setBounds(1000,120,400,400);
		setVisible(true);
		System.out.println(p.getWidth());
		System.out.println(p.getHeight());
	}
	
	public static void main(String[] args) {
		new Ex16();

	}

}
