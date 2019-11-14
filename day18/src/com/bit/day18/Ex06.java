package com.bit.day18;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Ex06 extends Frame{
	public Ex06(){
		setLayout(new BorderLayout());
		Font title = new Font(Font.SERIF,1,22);
		Font subTitle = new Font(Font.SERIF,0,18);
		GridLayout subLayout = new GridLayout(5,1,10,10);
		
		Label la1= new Label("회원가입");
		Label laId = new Label("id");	TextField id = new TextField();
		Label laPw = new Label("pw");	TextField pw = new TextField();
		Label laName = new Label("이름");	TextField name = new TextField();
		Label hob = new Label("취미");
		Panel top = new Panel();
		Panel p1 = new Panel();
		p1.setLayout(subLayout);
		Panel p2 = new Panel();
		Panel p3 = new Panel();

		CheckboxGroup cbg=new CheckboxGroup();
		
		Checkbox box1 = new Checkbox("운동",false,cbg);
		Checkbox box2 = new Checkbox("독서",false,cbg);
		Checkbox box3 = new Checkbox("게임",false,cbg);
		
		la1.setFont(title);
		p1.setFont(subTitle);
		id.setFont(subTitle);
		
		top.add(la1);
		p1.add(laId);	p1.add(laPw);	p1.add(laName);	p1.add(hob);
//		p1.add(laPw);	p1.add(pw);
//		p1.add(laName);	p1.add(name);
//		
//		p2.add(hob); p2.add(box1);	p2.add(box2);	p2.add(box3);
		
		
		
		add(top,BorderLayout.NORTH);
		add(p1,BorderLayout.WEST);
		
//		add(p2);
//		add(p3);
		setBounds(1000, 200, 400, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex06();

	}

}
