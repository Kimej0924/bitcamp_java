package com.bit.day18;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;

public class Ex02 {

	public static void main(String[] args) {
		Panel p1 = new Panel();
		java.awt.Frame frame = new Frame();
		java.awt.TextArea ta = new TextArea("",4,15,TextArea.SCROLLBARS_VERTICAL_ONLY);	//��ũ���� �����ڿ����� ��������
//		java.awt.TextArea ta = new TextArea("",4,15);
//		java.awt.TextArea ta = new TextArea();
		
//		ta.setColumns(15);			//���γ���
//		ta.setRows(3);				//�����ټ�
//		ta.setText("�ʱⰪ");
//		ta.setVisible(false);
//		ta.setEditable(false);		//�����Ұ�
//		ta.setEnabled(false);		//��Ȱ��ȭ
		
		
		p1.add(ta);
		frame.add(p1);
		frame.setLocation(1050,120);
		frame.setSize(200,300);
		frame.setVisible(true);

	}

}
