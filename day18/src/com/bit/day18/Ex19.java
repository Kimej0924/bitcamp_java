package com.bit.day18;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex19 extends Frame{
	
	public Ex19(){
		Toolkit kit=Toolkit.getDefaultToolkit();	
		Dimension dim = kit.getScreenSize();	//해상도 사이즈
		
		File file = new File("cat.jpg");
		InputStream is = null;
		byte[] buf = new byte[(int)file.length()];
		try {
			is=new FileInputStream(file);
			is.read(buf);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Image img=kit.createImage(buf);
		Icon icon = new ImageIcon(img);
		JButton btn = new JButton(icon);
		add(btn);
		setSize(500,500);
		setLocation(0+dim.width/2-this.getWidth()/2,0+dim.height/2-this.getHeight()/2);
		setVisible(true);
		

		System.out.print("x:"+dim.width);
		System.out.println("y:"+dim.height);
	}
		
	public static void main(String[] args) {
		new Ex19();
		

	}

}
