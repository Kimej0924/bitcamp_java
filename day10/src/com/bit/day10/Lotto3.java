package com.bit.day10;

class Ball{
	int num;
	String color;
	boolean chk;
	public Ball(int num){
		chk=false;
		this.num=num;
		if(num<10){
			color="�����";
		}else if(num<20){
			color="�Ķ���";
		}else if(num<30){
			color="������";
		}else if(num<40){
			color="�ʷϻ�";
		}else{
			color="������";
		}
		
	}
	
}

public class Lotto3 {

	public static void main(String[] args) {
		Ball[] box = new Ball[45];
		for(int i=0; i<45; i++){
			box[i] = new Ball(i+1);
		}
		String[] note=new String[6];
		// box 0~44
		int ran=0;
		for(int i=0; i<6; i++){
			ran=(int)(Math.random()*45);
			Ball ball = box[ran];
			if(ball.chk){
				i--;
			}else{
				ball.chk=true;		//�̾Ҵ��� ǥ��
				note[i]=ball.color+ball.num+"��";
			}
		}	
		for(int i=0; i<note.length; i++){
			System.out.println(note[i]+" ");
		}
	}

}
