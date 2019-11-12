package com.bit.day17;

import java.awt.Frame;

import javax.swing.JFrame;

public class Ex16 {

	public static void main(String[] args) {
		java.awt.Frame frame1=new Frame();			//운영체제에 종속적
		javax.swing.JFrame frame2 = new JFrame();	//자바에서 만드르낸거
		frame1.setVisible(true);
		frame2.setVisible(true);

	}

}
