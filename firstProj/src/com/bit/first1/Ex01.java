package com.bit.first1;
//����ȭ��
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
		setTitle("�����׸� ���߱� (ver 0.0.0)");
		
//		���׸��ֱ�
		backImage = new ImageIcon("back.png");
		JPanel background = new JPanel(){
			public void paintComponent(Graphics g){
				g.drawImage(backImage.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
	
		
		
//		�гλ���		
		JPanel p1 = new JPanel();	//�г���â,���۹�ư
		JPanel p2 = new JPanel();
		p1.setLayout(glayout);
		
		JButton btn1 = new JButton("START");
//		�г� ������		
		p1.setBackground(Color.LIGHT_GRAY);
		p2.setBackground(Color.LIGHT_GRAY);

//		�г���â �г��� ����	
		
		JLabel id = new JLabel("�г���                       ");
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
