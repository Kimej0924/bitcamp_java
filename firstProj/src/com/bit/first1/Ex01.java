package com.bit.first1;
//시작화면
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Ex01 extends JFrame implements ActionListener{
	GridLayout glayout = new GridLayout(2,1);
	BorderLayout blayout = new BorderLayout();
	JScrollPane scrollPane;
	ImageIcon backImage;
	public Ex01(){
		setTitle("같은그림 맞추기 (ver 0.0.0)");
		
//		배경그림넣기
		backImage = new ImageIcon("back.png");
		JPanel background = new JPanel(){
			public void paintComponent(Graphics g){
				g.drawImage(backImage.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
	
		
		
//		패널생성		
		JPanel p1 = new JPanel();	//닉네임창,시작버튼
		JPanel p2 = new JPanel();
		p1.setLayout(glayout);
		
		JButton btn1 = new JButton("START");
//		패널 색상설정		
		p1.setBackground(Color.LIGHT_GRAY);
		p2.setBackground(Color.LIGHT_GRAY);

//		닉네임창 닉네임 설정	
		
		JLabel id = new JLabel("닉네임                       ");
		JTextField tf = new JTextField();
		p1.add(id);
		p1.add(tf);
		p2.add(p1);
		p2.add(btn1);
		background.add(p2);
//		add(background);
		scrollPane = new JScrollPane(background);
		setContentPane(scrollPane);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800,120,600,400);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		new Ex01();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
