package com.bit.day19;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;

public class Ex01 {

	public static void main(String[] args) {
		Frame frame = new Frame("�θ�â");
		frame.setBounds(1000, 120, 500, 400);
		frame.setVisible(true);
		
		////////////////////////
//		FileDialog dia = new FileDialog(frame,"��������",FileDialog.SAVE);
		Dialog dia = new Dialog(frame,true);	//false�϶��� �θ�â �ٷ����ٰ���, true�϶��� dia â �ݱ� ������ �θ�â ���ٺҰ�
		Button btn = new Button();
		dia.add(btn);
		dia.setLocation(1100,150);
		dia.setSize(400, 400);
		dia.setVisible(true);
//		System.out.println(dia.getDirectory());
//		System.out.println(dia.getFile());
//		
		dia.dispose(); //����
		
	}

}
