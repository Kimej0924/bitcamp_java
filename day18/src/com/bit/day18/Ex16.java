package com.bit.day18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex16 extends Frame{

	public Ex16(){
		Panel p = new Panel();
		p.setLayout(null);
//		setLayout(null);		//����ȭ�Ǵ°Ŷ� ������ ��ġ �� ��������߿��ϴ��ڸ�����
		Button btn1=new Button("��ư1");
		btn1.setSize(100, 100);
		btn1.setLocation(284, 261);
		p.add(btn1);
		add(p);
		setBounds(1000,120,400,400);
		setVisible(true);
		System.out.println(p.getWidth());
		System.out.println(p.getHeight());
	}
	
	public static void main(String[] args) {
		new Ex16();

	}

}
