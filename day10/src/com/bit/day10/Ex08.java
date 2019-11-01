package com.bit.day10;

public class Ex08 {

   public static void main(String[] args) {
      
      String[] arr1=null;
      //arr1=new String[]{"java", "web", "framework"}; // 여러개의문자열(String객체) 가진 배열 
      arr1=new String[3]; // 배열을 값으로 갖는 배열이 존재 할 수 있다.
      
      for (int i = 0; i < arr1.length; i++) {
         System.out.println(arr1[i]);
      }
      System.out.println("================================");
      int[] su1= null;
      su1 = new int[]{1,2,3};
      int[] su2=new int[]{4,5};
      int[] su3=new int[]{7,8,9};   
      
      //다중배열 - 2차원배열
      int[][] arr2= null;
      arr2 = new int[3][5];
//      arr2 = new int[][]{null,null,null};
//      arr2 = new int[][]{su1,su2,su3};
//      arr2 = new int[][]{{1,2,3},{4,5},{7,8,9}};
      
//      for(int i=0; i<arr2.length; i++){
//    	  System.out.println(arr2[i]);
//      }

      for(int i=0; i<arr2.length; i++){
//    	  int[] temp=arr2[i];							
    	  for(int j=0; j<arr2[i].length; j++){		//temp.length
    		  System.out.print(arr2[i][j]);		//temp[j]
    	  }
    	  System.out.println();
      }
   }

}