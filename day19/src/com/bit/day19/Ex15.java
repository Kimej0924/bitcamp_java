package com.bit.day19;

import java.awt.Frame;

import javax.swing.JFrame;

public class Ex15 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		// 0 �ƹ��ϵ� ����
		// 1 JFrame HIDE_ON_CLOSE		:visible = false;
		// 2 JFrame DISPOSE_ON_CLOSE	:dispose
		// 3 JFrame EXIT_ON_CLOSE
		
		
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setBounds(1000,120,200,200);
		f.setVisible(true);

	}

}
