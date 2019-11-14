package com.bit.day19;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class MyEvent implements WindowListener{
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


public class Ex14 extends Frame{

	public Ex14(){
//		addWindowListener(new MyEvent() {
//			public void windowClosing(WindowEvent e){
//				System.out.println("´Ý±â");
//			}
//			
//		});
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.out.println("´Ý´Ý´Ý´Ý´Ý´Ý");
			}
			
		});
		
		Button btn = new Button("¶ò¶Ë");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		add(btn);
		setBounds(1000,120,300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex14();

	}

}
