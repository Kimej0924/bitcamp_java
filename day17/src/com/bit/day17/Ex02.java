package com.bit.day17;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//yyyy-MM-dd a hh:mm
//		java.io.File root=null;

		Scanner sc = new Scanner(System.in);
		String path = "C:\\java\\day17";
		System.out.print("path > ");
		path = sc.nextLine();


		File root = new File(path);
		if(root.exists()){

			String[] list = root.list();

			for(int i=0; i<list.length;i++){
				String fileName=list[i];
				File file = new File(path+"\\"+fileName);
				Date mod=new Date(file.lastModified());
				java.text.SimpleDateFormat sdf;
				sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm");
				String msg=sdf.format(mod);
				System.out.print(msg+"\t");

				if(file.isDirectory()){
					System.out.print("\t<dir>\t\t");
				}else{
					System.out.print("\t\t"+file.length()+"\t");
				}
				System.out.println(fileName);
			}

		}else{
			System.out.println("잘못입력된 경로 다시확인하세요");

		}

	}

}
