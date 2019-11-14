package com.bit.day19;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ex06 implements MouseMotionListener{
	static Label target = new Label("▲");

	public static void main(String[] args) {
		Ex06 me = new Ex06();
		Frame frame = new Frame();
		Panel p = new Panel();
		p.setLayout(null);
		target.setSize(20, 20);
		target.addMouseMotionListener(me);
		p.add(target);
		frame.add(p);
		frame.setBounds(1000, 120, 500, 500);
		frame.setVisible(true);
		

	}

	public void mouseDragged(MouseEvent e) {
//		System.out.println("마우스드래그");
		System.out.println(e.getX()+":"+e.getY());
		target.setLocation(e.getX(), e.getY());
//		System.out.println(e.getXOnScreen()+":"+e.getYOnScreen());
	}

	public void mouseMoved(MouseEvent e) {
		System.out.println("마우스무빙무빙");
		
	}

}
