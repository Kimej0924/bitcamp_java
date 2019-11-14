package com.bit.day18;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

public class Ex03 extends Frame{

	public Ex03(){
		Panel p1 = new Panel();
		
		CheckboxGroup cbg=new CheckboxGroup();
		
		Checkbox box1 = new Checkbox("item1",false,cbg);
//		box1.setLabel("item1");
		Checkbox box2 = new Checkbox("item2",false,cbg);
//		box2.setLabel("item2");
		box2.setState(true);		//그룹으로 안묶었을때 체크나오게 하는거
		Checkbox box3 = new Checkbox("item3",false,cbg);
//		box3.setLabel("item3");
		
		
		
		p1.add(box1);
		p1.add(box2);
		p1.add(box3);
		
		add(p1);
		setLocation(200,200);
		setSize(400,300);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
			new Ex03();
	}

}
