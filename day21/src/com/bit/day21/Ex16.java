package com.bit.day21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Ex16 extends Frame implements WindowListener,ActionListener,Runnable{
	JButton[] jbtn = new JButton[16];
	Panel p1 = new Panel();
	Toolkit kit;
	static int coin=0;
	Label la1 = new Label("���� ��ƶ�");
	Label la2 = new Label("������");
	Label la3 = new Label("ī��Ʈ�ٿ�");
	
//////////////////////////////////////////////////////////////////////
	public Ex16(){
		setLayout(new BorderLayout());
		
		p1.setLayout(new GridLayout(4,4));
		kit = Toolkit.getDefaultToolkit();
		
		String[] imgNums={"pic1.png","pic2.png","pic3.png","pic4.png"};
		for(int i=0; i<16; i++){
			Image img = kit.getImage(imgNums[i/4]);
			Icon icon = new ImageIcon(img);
			JButton btn = new JButton(icon);
			//�����ѱ׸�pic2�������� �׼�
			if(i/4==1){
				btn.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						coin+=10;
						System.out.println("��ȹ�� +10");
						la2.setText("ȹ�������� :"+coin);
					}
				});
			}
			
			if(i/4!=1){
				btn.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						coin-=10;
						System.out.println("�Ʊ���� -10");
						la2.setText("ȹ�������� :"+coin);
					}
				});
			}
			
			
			
			jbtn[i]=btn;
			btn.setEnabled(false);
			p1.add(btn);
		}
		////////////////////////////////////////////////////////////
		Panel p2 = new Panel();
		Button startBtn = new Button("����");
		Button endBtn = new Button("����");
		p2.add(startBtn);
		p2.add(endBtn);
		final Ex16 me = this;
		
		//���۹�ư �������� ��Ÿ���ϴ� ������
		startBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Thread thr = new Thread(me);
				thr.start();
			}
		});
		int count=10;
		//â ���Ʒ� �󺧴ް� frame��ġ�ϱ�
		
		Panel p3 =new Panel();
		p3.add(la1);
		p3.add(la3);
		add(p3,BorderLayout.NORTH);
		add(la2,BorderLayout.SOUTH);
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.EAST);
		
		//����� Xâ �������� â�ݱ�׼�
		addWindowListener(this);
		endBtn.addActionListener((ActionListener) this);
		
		//frame�⺻����
		setBounds(1000,120,400,300);
		setVisible(true);
	}
	
	//////////////////////////////////////////////////
	int limit = 10;
	public void play(){
		mix();
		this.revalidate();
		
		for(int i=0; i<jbtn.length; i++){
			jbtn[i].setEnabled(true);
		}
		while(--limit>0){
			la3.setText(limit+"��");
			mix();			
			try {
				Thread.sleep(500);
				this.revalidate();		
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			mix();
			try {
				Thread.sleep(500);
				this.revalidate();		
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
		for(int i=0; i<jbtn.length; i++){
			jbtn[i].setEnabled(false);
		}
		la3.setText(limit+"��");
	
		
	}
///////////////////////////////////////////////////	
//	public void countdown(){
////		System.out.println("����");
//		for(int i=10; i>=0; i--){
//			la3.setText(i+"��");
//			try {
//				Thread.sleep(1000);		
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
////		System.out.println("����");
//		
//	
//	}
//	
//////////////////////////////////////////////////////	
	public void mix(){
		Random random = new Random();
		for(int i=0; i<1000; i++){
			int ran = random.nextInt(16);		//
			JButton temp=jbtn[0];
			jbtn[0]=jbtn[ran];
			jbtn[ran]=temp;
		}
		for(int i=0; i<16; i++){
			p1.add(jbtn[i]);
		}
	}
	public static void main(String[] args) {
		new Ex16();
//		Thread thr1 = new Thread();
//		thr1.start();
	}

	
	@Override
	public void run() {
		play();
		
		
	}
////////////////////////////////////////////////////////////////	
	@Override
	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		this.dispose();
	}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}

	public void actionPerformed(ActionEvent e) {
		this.dispose();
	}
////////////////////////////////////////////////////////////////	


}

