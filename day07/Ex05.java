class Ex05{

  public static void main(String[] args){
	Car myCar = new Car();
	myCar.model = "모닝";
	myCar.color = "흰색";	
	myCar.accel = 30;
	myCar.speedMax = 150; 
	
	System.out.println("내차 "+myCar.color+myCar.model+"이 "+myCar.speed+"km로 달린다");
	myCar.speedUp(20);
	System.out.println("내차 "+myCar.color+myCar.model+"이 "+myCar.speed+"km로 달린다");
	myCar.speedUp(35);
	System.out.println("내차 "+myCar.color+myCar.model+"이 "+myCar.speed+"km로 달린다");
	myCar.speedUp();
	System.out.println("내차 "+myCar.color+myCar.model+"이 "+myCar.speed+"km로 달린다");
	myCar.speedUp(55);
	System.out.println("내차 "+myCar.color+myCar.model+"이 "+myCar.speed+"km로 달린다");
	myCar.speedUp(70);
	System.out.println("내차 "+myCar.color+myCar.model+"이 "+myCar.speed+"km로 달린다");
	myCar.speedUp(70);
	System.out.println("내차 "+myCar.color+myCar.model+"이 "+myCar.speed+"km로 달린다");
	myCar.speedDown(70);
	System.out.println("내차 "+myCar.color+myCar.model+"이 "+myCar.speed+"km로 달린다");
	myCar.speedDown(30);
	System.out.println("내차 "+myCar.color+myCar.model+"이 "+myCar.speed+"km로 달린다");
	myCar.speedDown();
	System.out.println("내차 "+myCar.color+myCar.model+"이 "+myCar.speed+"km로 달린다");
	myCar.speedDown(15);
	System.out.println("내차 "+myCar.color+myCar.model+"이 "+myCar.speed+"km로 달린다");
	myCar.speedDown(20);
	System.out.println("내차 "+myCar.color+myCar.model+"이 "+myCar.speed+"km로 달린다");




  }

}
 class Car{

	//변수-속성
	int no;
	String model;
	int speed=0;
	String color="이름없음";
	int accel;
	int speedMin=0;
	int speedMax;
	

	//메서드-행위
	public void speedUp(){
		if(accel<=speedMax-speed){
			speed+=accel;
		}else if(accel>speedMax-speed){
			speed=speedMax;
		}
	}
	public void speedUp(int a){
		if(a<=speedMax-speed){
				speed+=a;
		}else if(a>speedMax-speed){
			speed=speedMax;
		}
	}
	public void speedDown(){
		if(speed-accel>speedMin){
			speed-=accel;
		}else if(speed-accel<=speedMin){
			speed=speedMin;
		}
	}
	public void speedDown(int b){
		if(speed-b>speedMin){
			speed-=b;
		}else if(speed-accel<=speedMin){
			speed=speedMin;
		}
	}

}


