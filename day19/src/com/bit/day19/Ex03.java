package com.bit.day19;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Ex03 extends Frame{

	class MyCanvas extends Canvas{
		public void paint(Graphics g){
//			g.drawString("java", 100, 100);
			g.setColor(Color.RED);
			g.drawRect(10, 10, 297, 210);
			g.setColor(Color.BLUE);
			g.drawLine(100, 100, 150, 100);
			g.drawLine(100, 100, 50, 150);
			g.drawLine(50, 150, 100, 150);
			g.drawLine(150, 100, 100, 150);
//			g.drawArc(100, 100, 50, 25, 0, 180);
			g.drawOval(180, 150, 50, 50);
			g.fillOval(195, 165, 25, 25);
			g.draw3DRect(200, 50, 50, 50, true);
		}
		
	}
	
	public Ex03(){
		
		Canvas can = new MyCanvas();
		
		
		
		add(can);
			
		setBounds(1000, 120, 500, 500);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new Ex03();

	}

}
