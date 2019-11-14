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
		Font font = new Font(Font.SERIF,0,22);	//(�۾�ü, ����/���⼳��, �۾�ũ��)
		
		Panel top = new Panel();
		java.awt.TextField tf=new TextField();	//()�ȿ� ���ڴ� ������ ����(�����ǰ����� ����)
//		tf.setText("�̰��� Ű�е��Դϴ�");
//		tf.setEditable(false);		//�ؽ�Ʈ�ʵ忡 ���°��� �����Ҽ� ���� ���ڴ� Ȱ��ȭ ������/true�� ��������
//		tf.setEnabled(false);		//�ؽ�Ʈ�ʵ忡 ���°��� �����Ҽ� ���� ������ü ��Ȱ��ȭ����/true�� ��������
//		tf.setVisible(false);		//add �ص� ȭ�鿡 �ȳ��� / true���¿��� ��µ�
//		tf.setFont(font);			//�۾�ũ�⿡ ���� �������� �����ȴ�
//		tf.setSize(20, 100);		//setSize�� ������ ������ �ȵȴ�(������-��ġ�����ڰ�����)
		tf.setColumns(20);			//������ ������ ����
//		tf.setEchoChar('#');		//�Է°��� �����̵� ǥ�õǴ� ���� �׻�#	
		
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
