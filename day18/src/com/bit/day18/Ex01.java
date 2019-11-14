package com.bit.day18;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Ex01 extends Frame{

	public Ex01(){
		setLayout(new BorderLayout());
		Font font = new Font(Font.SERIF,0,22);	//(글씨체, 굵기/기울기설정, 글씨크기)
		
		Panel top = new Panel();
		java.awt.TextField tf=new TextField();	//()안에 숫자는 가로폭 지정(글자의갯수를 기준)
//		tf.setText("이것은 키패드입니다");
//		tf.setEditable(false);		//텍스트필드에 나온값을 수정할수 없다 글자는 활성화 되있음/true면 수정가능
//		tf.setEnabled(false);		//텍스트필드에 나온값을 수정할수 없다 글자자체 비활성화상태/true면 수정가능
//		tf.setVisible(false);		//add 해도 화면에 안나옴 / true상태에서 출력됨
//		tf.setFont(font);			//글씨크기에 따라 세로폭이 조정된다
//		tf.setSize(20, 100);		//setSize로 사이즈 조정이 안된다(상대관리-배치관리자가조종)
		tf.setColumns(20);			//사이즈 가로폭 지정
//		tf.setEchoChar('#');		//입력값이 무엇이든 표시되는 값이 항상#	
		
		top.add(tf);
		add(top,BorderLayout.NORTH);
		
		Panel p1= new Panel();
		GridLayout layout = new GridLayout(4,3);
		p1.setLayout(layout);
		
		
		Button[] btns=new Button[12];
		String[] nums={"7","8","9",
						"4","5","6",
						"1","2","3",
						"*","0","#"};
		
		for(int i=0; i<btns.length; i++){
			btns[i]=new Button();
			btns[i].setLabel(nums[i]);
			btns[i].setFont(font);
			p1.add(btns[i]);
		}
		add(p1,BorderLayout.CENTER);
		setLocation(1050,120);
		setSize(200,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex01();
		

	}

}
