class Exre05{

  public static void main(String[] args){
	Car2 myCar = new Car2();
	
	myCar.max=150;
	for(int i=0; i<20; i++){
		myCar.speedUp();
		System.out.println(myCar.speed+"km");

	}

	for(int i=0; i<20; i++){
		myCar.speedDown();
		System.out.println(myCar.speed+"km");

	}



  }

}
 class Car{

	int speed;
	int Max;
	int accel;

	

	//메서드-행위
	public void speedUp(){
		if(speed+accel<=max){
			speed+=accel;
		}else{
			speed=max;
		}
	}
	
	public void speedDown(){
		if(speed-accel>=0){
			speed-=accel;
		}else{
			speed=0;
		}
	}

}


