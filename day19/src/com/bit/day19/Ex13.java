package com.bit.day19;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex13 extends Frame implements ActionListener{

	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("수행");
	}
	
	public Ex13(){
		Panel p = new Panel();
		TextField tf = new TextField(10);
		tf.addActionListener(this);
		Checkbox box = new Checkbox();
//		box.addActionListener(this);		/기능없음
		Choice cho = new Choice();
		cho.add("item1");
		cho.add("item2");
//		cho.addActionListener(this);		/기능없음
		List list = new List();
		list.add("list1");
		list.add("list2");
		list.addActionListener(this);
		
		Button btn = new Button("button");
		btn.addActionListener(this);
		p.add(tf);
		p.add(box);
		p.add(cho);
		p.add(list);
		p.add(btn);
		add(p);
		setBounds(1000, 120, 500, 400);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new Ex13();

	}



}
