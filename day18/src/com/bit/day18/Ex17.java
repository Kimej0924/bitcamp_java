package com.bit.day18;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;

public class Ex17 {

	public static void main(String[] args) {
		Frame frame = new Frame("力格乐澜");
		
		Panel p = new Panel();
		
		Menu mn1=new Menu();
		mn1.setLabel("File");
		
		
		MenuItem mn2Item1=new CheckboxMenuItem("Mode",true);
		MenuItem mn2Item2=new Menu("More");
		Menu mn2=new Menu("Edit");
		mn2.add(mn2Item1);
		mn2.add(mn2Item2);
		
		
		MenuItem mn3Item1=new MenuItem("");
		MenuItem mn3Item2=new MenuItem("About");
		mn3Item1.setLabel("Welcome");
		Menu mn3=new Menu("Help");
		mn3.add(mn3Item1);
		mn3.addSeparator();
		mn3.add(mn3Item2);
		
		
		MenuBar mb = new MenuBar();
		mb.add(mn1);
		mb.add(mn2);
		mb.add(mn3);
		
		frame.setMenuBar(mb);
		frame.add(p);
				
//		frame.setTitle("力格绝澜");
		frame.setLocation(1000, 120);
		frame.setSize(400, 300);
		frame.setVisible(true);
		System.out.println(p.getWidth());
		System.out.println(p.getHeight());

	}

}
