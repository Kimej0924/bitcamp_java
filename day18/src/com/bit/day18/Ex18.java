package com.bit.day18;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.util.Stack;

public class Ex18 {

	public static void main(String[] args) {
		Frame frame = new Frame("������� - Windows �޸���");
		
		Panel p = new Panel();
		
		/////////////////////////////////////////////////////////////////////// ���� ����
		Menu mn1=new Menu();
		mn1.setLabel("����(F)");
		MenuItem newM = new MenuItem("���� �����(N)"+String.format("%40s","Ctrl+N"));
		MenuItem newW = new MenuItem("�� â(W)"+String.format("%47s","Ctrl+Shift+N"));
		MenuItem open = new MenuItem("����(O)..."+String.format("%50s","Ctrl+N"));
		MenuItem save = new MenuItem("����(S)"+String.format("%54s","Ctrl+S"));
		MenuItem saveA = new MenuItem("�ٸ� �̸����� ����(A)..."+String.format("%21s","Ctrl+Shift+S"));
		MenuItem pageOp = new MenuItem("������ ����(U)...");
		MenuItem print = new MenuItem("�μ�(P)..."+String.format("%50s","Ctrl+P"));
		MenuItem exit = new MenuItem("������(X)");
		mn1.add(newM);
		mn1.add(newW);
		mn1.add(open);
		mn1.add(save);
		mn1.add(saveA);
		mn1.addSeparator();
		mn1.add(pageOp);
		mn1.add(print);
		mn1.addSeparator();
		mn1.add(exit);
		///////////////////////////////////////////////////////////////////////
		
		
		
//		String[] msg=new String[1]; 
//		msg[0]= "���� ���(U)"+String.format("%32s","Ctrl+Z");
//		
//		System.out.println(msg);
		///////////////////////////////////////////////////////////////////////	���� ����
		MenuItem exX=new MenuItem("���� ���(U)"+String.format("%32s","Ctrl+Z"));
		MenuItem textT=new MenuItem("�߶󳻱�(T)"+String.format("%33s","Ctrl+X"));
		MenuItem textC=new MenuItem("����(C)"+String.format("%40s","Ctrl+C"));
		MenuItem textP=new MenuItem("�ٿ��ֱ�(P)"+String.format("%33s","Ctrl+V"));
		MenuItem textD=new MenuItem("����(L)"+String.format("%43s","Del"));
		MenuItem bingS=new MenuItem("Bing���� �˻�(S)..."+String.format("%21s","Ctrl+E"));
		MenuItem textFind=new MenuItem("ã��(F)..."+String.format("%39s","Ctrl+F"));
		MenuItem textNf=new MenuItem("���� ã��(N)"+String.format("%35s","F3"));
		MenuItem textVf=new MenuItem("���� ã��(V)"+String.format("%31s","Shift+F3"));
		MenuItem textRe=new MenuItem("�ٲٱ�(R)..."+String.format("%34s","Ctrl+H"));
		MenuItem lineMo=new MenuItem("�̵�(G)..."+String.format("%39s","Ctrl+G"));
		MenuItem totalS=new MenuItem("��� ����(A)"+String.format("%34s","Ctrl+A"));
		MenuItem tAndd=new MenuItem("�ð�/��¥(D)"+String.format("%35s","F5"));
		Menu mn2=new Menu("����(E)");
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
		/////////////////////////////////////////////////////////////////////// ��
		
		///////////////////////////////////////////////////////////////////////	���� ����
		MenuItem autoL=new MenuItem("�ڵ� �� �ٲ�(W)");
		MenuItem textF=new MenuItem("�۲�(F)...");
		Menu mn3=new Menu("����(O)");
		mn3.add(autoL);
		mn3.add(textF);
		///////////////////////////////////////////////////////////////////////	��	
		
		///////////////////////////////////////////////////////////////////////	���� ����޴�
		Menu mn4Item1=new Menu("Ȯ���ϱ�/����ϱ�");
			MenuItem viewB = new MenuItem("Ȯ��(I)");
			MenuItem viewS = new MenuItem("���(O)");
			MenuItem viewR = new MenuItem("Ȯ���ϱ�/����ϱ� �⺻�� ����");
			mn4Item1.add(viewB);
			mn4Item1.add(viewS);
			mn4Item1.add(viewR);
		MenuItem mn4Item2=new CheckboxMenuItem("���� ǥ����(S)",true);
		Menu mn4=new Menu("����(V)");
		mn4.add(mn4Item1);
		mn4.add(mn4Item2);
		/////////////////////////////////////////////////////////////////////// Ȯ����������޴�
		
		/////////////////////////////////////////////////////////////////////// ���� ����
		MenuItem helpV=new MenuItem("���� ����(H)");
		MenuItem fbS=new MenuItem("�ǵ�� ������(F)");
		MenuItem memoInf=new MenuItem("�޸��� ����(A)");		
		Menu mn5=new Menu("����");	
		mn5.add(helpV);
		mn5.add(fbS);
		mn5.addSeparator();
		mn5.add(memoInf);
		///////////////////////////////////////////////////////////////////////	��
		
		TextArea ta = new TextArea();
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
		System.out.println(p.getWidth());
		System.out.println(p.getHeight());

	}

}
