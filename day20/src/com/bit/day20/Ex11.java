package com.bit.day20;
// ���ڿ���Ʈ��
// Reader -> �⺻�� 2byteü��
// ���� ���ڿ����� ó���ϱ� ���ؼ� �����Ѵ�	
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex11 {
	
	public static void main(String[] args) {
		String path = "test04.txt";
		File file = new File(path);
		
		Reader fr = null;	
		BufferedReader br =null;
		
		char[] cbuf=new char[5];
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while(true){
				String temp = br.readLine();		//readLine() ���پ� �о��
				if(temp==null){break;}
				System.out.println(temp);
			}

//			while(true){
//				int su = fr.read(cbuf);
//				if(su==-1){break;}
////				char ch = (char) su;
//				System.out.print(new String(cbuf,0,su));
//			}
		
//			System.out.println(fr.read());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fr!=null)fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
