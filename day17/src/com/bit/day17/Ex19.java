package com.bit.day17;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex19 {

	public static void main(String[] args) {
		Frame frame = new Frame();
		GridLayout layout = new GridLayout(4,1,10,10);
		frame.setLayout(layout);
		
		Panel p1 = new Panel(new GridLayout(1,3));
		Panel p2 = new Panel(new GridLayout(1,3));
		Panel p3 = new Panel(new GridLayout(1,3));
		Panel p4 = new Panel(new GridLayout(1,3));
		
		String[] btn=new String[12];
		String num = null;
		
		Button btn1=new Button("1"); 
		Button btn2=new Button("2"); 
		Button btn3=new Button("3"); 
		Button btn4=new Button("4"); 
		Button btn5=new Button("5"); 
		Button btn6=new Button("6"); 
		Button btn7=new Button("7"); 
		Button btn8=new Button("8"); 
		Button btn9=new Button("9"); 
		Button btn10=new Button("0"); 
		Button btn11=new Button("*"); 
		Button btn12=new Button("#"); 
		
		p1.add(btn7);	p1.add(btn8);	p1.add(btn9);
		p2.add(btn4);	p2.add(btn5);	p2.add(btn6);
		p3.add(btn1);	p3.add(btn2);	p3.add(btn3);
		p4.add(btn11);	p4.add(btn10);	p4.add(btn12);

		frame.add(p1);
		frame.add(p2);
		frame.add(p3);
		frame.add(p4);


		frame.setLocation(800, 300);
		frame.setSize(200, 250);
		frame.setVisible(true);

	}

}
