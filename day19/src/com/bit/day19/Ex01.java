package com.bit.day19;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;

public class Ex01 {

	public static void main(String[] args) {
		Frame frame = new Frame("부모창");
		frame.setBounds(1000, 120, 500, 400);
		frame.setVisible(true);
		
		////////////////////////
//		FileDialog dia = new FileDialog(frame,"파일저장",FileDialog.SAVE);
		Dialog dia = new Dialog(frame,true);	//false일때는 부모창 바로접근가능, true일때는 dia 창 닫기 전까지 부모창 접근불가
		Button btn = new Button();
		dia.add(btn);
		dia.setLocation(1100,150);
		dia.setSize(400, 400);
		dia.setVisible(true);
//		System.out.println(dia.getDirectory());
//		System.out.println(dia.getFile());
//		
		dia.dispose(); //종료
		
	}

}
