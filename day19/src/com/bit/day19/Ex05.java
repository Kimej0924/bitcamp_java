package com.bit.day19;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex05 extends Frame implements MouseListener{

	class MyMouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("��ư��������");
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	public Ex05(){
		Panel p = new Panel();
		
		Button btn=new Button("��ư");
		MyMouse mouseAction=new MyMouse();
		btn.addMouseListener(mouseAction);
		p.addMouseListener(this);
		
		p.add(btn);
		add(p);
		setBounds(1000, 120, 400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex05();

	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("Ŭ��");
		
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("���콺��������");
		
	}

	public void mouseReleased(MouseEvent e) {
		System.out.println("���콺����������");
		
	}

	public void mouseEntered(MouseEvent e) {
		System.out.println("â�����콺���");
		
	}

	public void mouseExited(MouseEvent e) {
		System.out.println("â�������콺����");
		
	}

}
