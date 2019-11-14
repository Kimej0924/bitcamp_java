package com.bit.day19;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Ex02 extends Frame{

	public Ex02(){
		Color color1 = new Color(130,193,230);		//(r,g,b)색깔 조합하면 원하는색이나오겠지
		Color color2 = new Color(244,132,222);		//(r,g,b)색깔 조합하면 원하는색이나오겠지
		Font font = new Font(Font.SERIF,Font.BOLD,20);
		Panel p = new Panel();
		Label la = new Label("문자열\r\nabcd\t1234");
		la.setFont(font);
		la.setBackground(color2);
		p.setBackground(color1);
		p.add(la);
		add(p);
		setBounds(1000, 120, 500, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex02();

	}

}
