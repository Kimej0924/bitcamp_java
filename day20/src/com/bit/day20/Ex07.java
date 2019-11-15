package com.bit.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Vector;
												//Serializable은 메소드 내용은 변경가능하지만 필드는 고대로 데려간다(필드값만저장)
class Car implements java.io.Serializable{		//public변경 불가 같은 사항
	int speed;
//	String color;
	transient String color;		//transient 예외처리(읽어들일때 걸러 ->null로 출력됨)
	public Car(){
		speed=100;
		color="red";
	}
	public void func(){
		System.out.println("달린다");
	}
}


public class Ex07 {
	

	public static void main(String[] args) {
		// Object stream
//		String obj = new String("java Object");
		
//		Vector obj2 = new Vector();
//		obj2.add(1234);
//		obj2.add(3.14);
//		obj2.add('c');
//		obj2.add(false);
//		obj2.add("이상을 출력");
//		
//		ArrayList obj = new ArrayList<>();
//		obj.add(1234);
//		obj.add("잘들어가나");
//		obj.add(obj2);
		
		Car obj = new Car();
		
		
		String path="test03.bin";
		File file = new File(path);
		
		OutputStream os = null;
		ObjectOutputStream oos = null;
		
		try {
			os = new FileOutputStream(file);
			oos = new ObjectOutputStream(os);

			oos.writeObject(obj);	
			
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(oos!=null){oos.close();}
				if(os!=null){os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
