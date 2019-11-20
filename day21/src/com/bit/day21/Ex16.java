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
	Label la1 = new Label("별을 잡아라");
	Label la2 = new Label("점수판");
	Label la3 = new Label("카운트다운");
	
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
			//설정한그림pic2눌렀을때 액션
			if(i/4==1){
				btn.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						coin+=10;
						System.out.println("별획득 +10");
						la2.setText("획득한점수 :"+coin);
					}
				});
			}
			
			if(i/4!=1){
				btn.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						coin-=10;
						System.out.println("아까워요 -10");
						la2.setText("획득한점수 :"+coin);
					}
				});
			}
			
			
			
			jbtn[i]=btn;
			btn.setEnabled(false);
			p1.add(btn);
		}
		////////////////////////////////////////////////////////////
		Panel p2 = new Panel();
		Button startBtn = new Button("시작");
		Button endBtn = new Button("종료");
		p2.add(startBtn);
		p2.add(endBtn);
		final Ex16 me = this;
		
		//시작버튼 눌렀을때 스타드하는 스레드
		startBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Thread thr = new Thread(me);
				thr.start();
			}
		});
		int count=10;
		//창 위아래 라벨달고 frame배치하기
		
		Panel p3 =new Panel();
		p3.add(la1);
		p3.add(la3);
		add(p3,BorderLayout.NORTH);
		add(la2,BorderLayout.SOUTH);
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.EAST);
		
		//종료랑 X창 눌렀을때 창닫기액션
		addWindowListener(this);
		endBtn.addActionListener((ActionListener) this);
		
		//frame기본설정
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
			la3.setText(limit+"초");
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
		la3.setText(limit+"초");
	
		
	}
///////////////////////////////////////////////////	
//	public void countdown(){
////		System.out.println("시작");
//		for(int i=10; i>=0; i--){
//			la3.setText(i+"초");
//			try {
//				Thread.sleep(1000);		
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
////		System.out.println("종료");
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

