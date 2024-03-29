package com.bit.day18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;

public class Ex13 extends Frame{
	//그리드백으로 자르고 x,y좌표를 주고 몇칸사용할지 결정
	//가중치는 나중에 보면서 생각
	public Ex13(){
		Panel main = new Panel();
		
		GridBagLayout gbl=new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		main.setLayout(gbl);
		
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		Button btn3 = new Button("3");
		Button btn4 = new Button("4");
		Button btn5 = new Button("5");
		Button btn6 = new Button("6");
	
		
		gbc.fill=GridBagConstraints.BOTH;	//버튼이 가운데만있는지 가로,세로,양옆으로 채우는지
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.weightx=1.0;		//가중치
		gbc.weighty=1.0;
		
		gbl.setConstraints(btn1, gbc);
		
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.weightx=1.0;		//가중치
		gbc.weighty=1.0;
		gbl.setConstraints(btn2, gbc);
		
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.gridx=2;
		gbc.gridy=0;
		gbc.weightx=1.0;		//가중치
		gbc.weighty=1.0;
		gbl.setConstraints(btn3, gbc);
		
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.gridx=3;
		gbc.gridy=0;
		gbc.weightx=1.0;		//가중치
		gbc.weighty=1.0;
		gbl.setConstraints(btn4, gbc);
		
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.weightx=1.0;		//가중치
		gbc.weighty=1.0;
		gbl.setConstraints(btn5, gbc);
		
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.gridx=4;
		gbc.gridy=0;
		gbc.weightx=1.0;		//가중치	1,0 좌표의 버튼도 grid라서 가중치의 영향을 받아 
		gbc.weighty=1.0;
		gbl.setConstraints(btn6, gbc);
		
		
		main.add(btn1);
		main.add(btn2);
		main.add(btn3);
		main.add(btn4);
		main.add(btn5);
		main.add(btn6);
		
		add(main);
		setBounds(1000, 120, 400, 300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex13();

	}

}
