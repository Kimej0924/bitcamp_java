package com.bit.day19;

import java.awt.CheckboxMenuItem;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex16 extends Frame{
	static Frame frame;
	static TextArea ta = new TextArea();
	static Dialog dia;
	
	public Ex16(){
		frame = new Frame("제목없음 - Windows 메모장");
		Panel p = new Panel();

		frame.setBounds(1000, 120, 500, 400);
		frame.setVisible(true);
		
		/////////////////////////////////////////////////////////////////////// 메인 파일
		Menu mn1=new Menu();
		mn1.setLabel("파일(F)");
		
		MenuItem[] mn1Item = new MenuItem[4];
		String[] mn1msg = {"새로만들기", "열기", "저장", "끝내기"};
		
		for(int i=0; i<mn1Item.length; i++){
			mn1Item[i]=new MenuItem();
			mn1Item[i].setLabel(mn1msg[i]);
			mn1.add(mn1Item[i]);
		}

		///////////////////////////////////////////////////////////////////////
		
		///////////////////////////////////////////////////////////////////////	메인 편집
		MenuItem exX=new MenuItem("실행 취소(U)"+String.format("%32s","Ctrl+Z"));
		MenuItem textT=new MenuItem("잘라내기(T)"+String.format("%33s","Ctrl+X"));
		MenuItem textC=new MenuItem("복사(C)"+String.format("%40s","Ctrl+C"));
		MenuItem textP=new MenuItem("붙여넣기(P)"+String.format("%33s","Ctrl+V"));
		MenuItem textD=new MenuItem("삭제(L)"+String.format("%43s","Del"));
		MenuItem bingS=new MenuItem("Bing으로 검색(S)..."+String.format("%21s","Ctrl+E"));
		MenuItem textFind=new MenuItem("찾기(F)..."+String.format("%39s","Ctrl+F"));
		MenuItem textNf=new MenuItem("다음 찾기(N)"+String.format("%35s","F3"));
		MenuItem textVf=new MenuItem("이전 찾기(V)"+String.format("%31s","Shift+F3"));
		MenuItem textRe=new MenuItem("바꾸기(R)..."+String.format("%34s","Ctrl+H"));
		MenuItem lineMo=new MenuItem("이동(G)..."+String.format("%39s","Ctrl+G"));
		MenuItem totalS=new MenuItem("모두 선택(A)"+String.format("%34s","Ctrl+A"));
		MenuItem tAndd=new MenuItem("시간/날짜(D)"+String.format("%35s","F5"));
		Menu mn2=new Menu("편집(E)");
		mn2.add(exX);
		mn2.addSeparator();
		mn2.add(textT);
		mn2.add(textC);
		mn2.add(textP);
		mn2.add(textD);
		mn2.addSeparator();
		mn2.add(bingS);
		mn2.add(textFind);
		mn2.add(textNf);
		mn2.add(textVf);
		mn2.add(textRe);
		mn2.add(lineMo);
		mn2.addSeparator();
		mn2.add(totalS);
		mn2.add(tAndd);
		/////////////////////////////////////////////////////////////////////// 완
		
		///////////////////////////////////////////////////////////////////////	메인 서식
		MenuItem autoL=new MenuItem("자동 줄 바꿈(W)");
		MenuItem textF=new MenuItem("글꼴(F)...");
		Menu mn3=new Menu("서식(O)");
		mn3.add(autoL);
		mn3.add(textF);
		///////////////////////////////////////////////////////////////////////	완	
		
		///////////////////////////////////////////////////////////////////////	메인 보기메뉴
		Menu mn4Item1=new Menu("확대하기/축소하기");
			MenuItem viewB = new MenuItem("확대(I)");
			MenuItem viewS = new MenuItem("축소(O)");
			MenuItem viewR = new MenuItem("확대하기/축소하기 기본값 복원");
			mn4Item1.add(viewB);
			mn4Item1.add(viewS);
			mn4Item1.add(viewR);
		MenuItem mn4Item2=new CheckboxMenuItem("상태 표시줄(S)",true);
		Menu mn4=new Menu("보기(V)");
		mn4.add(mn4Item1);
		mn4.add(mn4Item2);
		/////////////////////////////////////////////////////////////////////// 확대축소하위메뉴
		
		/////////////////////////////////////////////////////////////////////// 메인 도움말
		MenuItem helpV=new MenuItem("도움말 보기(H)");
		MenuItem fbS=new MenuItem("피드백 보내기(F)");
		MenuItem memoInf=new MenuItem("메모장 정보(A)");		
		Menu mn5=new Menu("도움말");	
		mn5.add(helpV);
		mn5.add(fbS);
		mn5.addSeparator();
		mn5.add(memoInf);
		///////////////////////////////////////////////////////////////////////	완
		
		///////////////////////////////////////////////////////////////////////		
		MenuBar mb = new MenuBar();
		mb.add(mn1);
		mb.add(mn2);
		mb.add(mn3);
		mb.add(mn4);
		mb.add(mn5);
		
		frame.setMenuBar(mb);
		frame.add(p);
		frame.add(ta);
				

		frame.setLocation(1000, 120);
		frame.setSize(500, 400);
		frame.setVisible(true);

		///////////////////////////////////////////////////////////////////////	
		
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
//				System.out.println("닫기");
				frame.dispose();						
			}			
		});
	
		mn1Item[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();				
			}
		});
		
		
		mn1Item[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(" ");
			}
		});
		
		
		mn1Item[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileDialog dia1 = new FileDialog(frame,"열기",FileDialog.LOAD);
				dia1.setSize(400, 400);
				dia1.setLocation(1100,150);
				dia1.setVisible(true);
				String path = dia1.getDirectory()+dia1.getFile();
				System.out.println(path);
				File file = new File(path);
				InputStream is=null;
				ArrayList<Byte> list = new ArrayList<>();
				try {
					is = new FileInputStream(file);
					while(true){
						int su = is.read();
						if(su==-1){break;}
						list.add((byte)su);
//						System.out.print((char)su);
					}
					is.close();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				Object[] arr1 = list.toArray();
				byte[] arr2=new byte[arr1.length];
				for(int i=0; i<arr1.length; i++){
					arr2[i]=(Byte)arr1[i];
				}
				String content=new String(arr2);
				ta.setText(content);
				
				
//				System.out.println(dia1.getDirectory());
//				System.out.println(dia1.getFile());				
			}
		});
		
		mn1Item[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileDialog dia2 = new FileDialog(frame,"저장",FileDialog.SAVE);
				dia2.setSize(400, 400);
				dia2.setLocation(1100,150);
				dia2.setVisible(true);
				
				String path = dia2.getDirectory()+dia2.getFile();
				System.out.println(path);
				File file = new File(path);
				
				OutputStream os;
				os = null;
				byte[] note=ta.getText().getBytes();

				try {
					os = new FileOutputStream(file);
					for(int i=0; i<note.length; i++){
						os.write(note[i]);
					}
					
					os.close();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			
			}
		});
		
		
		
		memoInf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dia = new Dialog(frame,"메모장 정보",true);
				
				Label diala1 = new Label("ver 0.0.0",Label.CENTER);
//				Label diala2 = new Label("냥냥펀치",Label.LEFT);
				
				
				Toolkit kit=Toolkit.getDefaultToolkit();	
				Dimension dim = kit.getScreenSize();	//해상도 사이즈
				
				File file = new File("cat.jpg");
				InputStream is = null;
				byte[] buf = new byte[(int)file.length()];
				try {
					is=new FileInputStream(file);
					is.read(buf);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				Image img=kit.createImage(buf);
				img.getScaledInstance(50, 50, 30);
				Icon icon = new ImageIcon(img);
				JButton btn = new JButton(icon);
				dia.add(diala1);
				dia.add(btn);
//				dia.add(diala2);

				
				dia.addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent e){
//						System.out.println("닫기");
						dia.dispose();						
					}			
				});
				
				
				
				
				
				dia.setSize(300, 250);
				dia.setLocation(1100,200);
				dia.setVisible(true);
		
		
			}
		});
		
		
	}
	
	public static void main(String[] args){
		new Ex16();
	
	}
	
}
