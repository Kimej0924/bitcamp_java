package com.bit.day17;

import java.io.File;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		File file;
		file=new File("test01.bin");
		
		if(!file.exists()){
			try {
				System.out.println("���ϻ���:"+file.createNewFile());
			} catch (IOException e) {
				e.printStackTrace();
			}
//			file.mkdir();		//���� ���丮�� �������� ������ ���� ���丮�� �������� ����
//			file.mkdirs();		//�����������丮 �ѹ��� ����°�
//			System.out.println("���丮����");
			
		}else{
			System.out.println("������������");
		}

	}

}
