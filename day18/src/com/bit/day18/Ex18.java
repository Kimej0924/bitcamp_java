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
		Frame frame = new Frame("제목없음 - Windows 메모장");
		
		Panel p = new Panel();
		
		/////////////////////////////////////////////////////////////////////// 메인 파일
		Menu mn1=new Menu();
		mn1.setLabel("파일(F)");
		MenuItem newM = new MenuItem("새로 만들기(N)"+String.format("%40s","Ctrl+N"));
		MenuItem newW = new MenuItem("새 창(W)"+String.format("%47s","Ctrl+Shift+N"));
		MenuItem open = new MenuItem("열기(O)..."+String.format("%50s","Ctrl+N"));
		MenuItem save = new MenuItem("저장(S)"+String.format("%54s","Ctrl+S"));
		MenuItem saveA = new MenuItem("다른 이름으로 저장(A)..."+String.format("%21s","Ctrl+Shift+S"));
		MenuItem pageOp = new MenuItem("페이지 설정(U)...");
		MenuItem print = new MenuItem("인쇄(P)..."+String.format("%50s","Ctrl+P"));
		MenuItem exit = new MenuItem("끝내기(X)");
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
//		msg[0]= "실행 취소(U)"+String.format("%32s","Ctrl+Z");
//		
//		System.out.println(msg);
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
