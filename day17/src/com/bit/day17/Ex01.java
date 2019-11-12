package com.bit.day17;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
		// file
		// ���(���,����)
		java.io.File file1=null;
//		file1=new File("C:\\java\\day17\\test01.bin");		// ������
//		 . ������丮	..�Ѵܰ�ö󰣵��丮
		file1=new File(".\\..\\day17");		// . ������丮�� �ִ� ����
		
		
		System.out.println("�����ϴ���?"+file1.exists()); // ���� ����,�������� �Է��ϸ� false�� ��������
		System.out.println("���丮����?"+file1.isDirectory());
		System.out.println("��������?"+file1.isFile());
		
		System.out.println("���?"+file1.getPath());
		System.out.println("������?"+file1.getAbsolutePath());
		System.out.println("������?"+file1.getAbsoluteFile());
		
		try {
			System.out.println("������?"+file1.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("�̸�?"+file1.getName());	//������ �̿ܿ��� �����̳� ���丮�� �� �����ν�
		System.out.println("�������?"+file1.getParent());
		System.out.println("r�б����?"+file1.canRead());
		System.out.println("w�������?"+file1.canWrite());
		System.out.println("x�������?"+file1.canExecute());
		System.out.println(file1.length()+"byte");
		System.out.println(new Date(file1.lastModified()));
		String[] msg = file1.list();
		System.out.println(Arrays.toString(msg));
	}

}