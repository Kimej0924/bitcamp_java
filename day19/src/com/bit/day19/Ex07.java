package com.bit.day19;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex07 extends Frame implements KeyListener{
	TextField tf = new TextField();

	public Ex07(){
		Panel p = new Panel();
		tf.addKeyListener(this);
		
		p.add(tf);
		add(p);
		setBounds(1000, 120, 500, 400);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new Ex07();
		

	}


	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("keyTyped"+","+e.getKeyChar()+","+e.getKeyCode());
//		System.out.println(tf.getText());
//		System.out.println(e.getSource());		//오브젝트로 나오는 텍스트필드 = e.getSource()
		TextField temp = (TextField)e.getSource();
		System.out.println(temp.getText());
	}


	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed"+","+e.getKeyChar()+","+e.getKeyCode());
//		System.out.println(tf.getText());
		System.out.println(tf);
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("keyReleased"+","+e.getKeyChar()+","+e.getKeyCode());
		System.out.println(tf.getText());
		
	}

}
