package com.bit.day17;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Ex15 {

   public static void main(String[] args) {
      //1개이상의 io 작업이 힘들다 
      String msg="이렇게 작성할 수 있습니다.1234abcd";
      File file;
      file=new File("test01.bin");
      File file2;
      file2=new File("test02.bin");
      
      InputStream is;
      OutputStream os;
//      byte[] buff=msg.getBytes();
      byte[] by=msg.getBytes();
      byte[] buff= new byte[5];
      try {
         file2.createNewFile();
         is=new FileInputStream(file);
         os=new FileOutputStream(file2);
         while(true){
            int su=is.read(buff);
            if(su==-1){break;}
            os.write(buff,0,su);
         }
//         os.flush();//버퍼비우기
         os.close();
         is.close();
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

}