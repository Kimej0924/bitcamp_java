package com.bit.day14;

import java.util.HashSet;
import java.util.TreeSet;



class Car implements Comparable{
	int su;
	public Car(int su){
		this.su=su;
	}
	@Override
	public int compareTo(Object obj) {
		return su-((Car)obj).su;
	}
	
}

public class Ex11 {

	public static void main(String[] args) {
		//set - ����x, �ߺ�x
//		java.util.HashSet set = null;
//		set = new HashSet();
		java.util.TreeSet set = null;		//����Ʈ�� ->�ߺ����ŵǰ� ���������� ���ĵǼ� ��µȴ�
		set = new TreeSet();

		Car car1 = new Car(1111);
		Car car2 = new Car(2222);
		Car car3 = new Car(3333);
		Car car4 = new Car(4444);
		set.add(car1);
		set.add(car3);
		set.add(car4);
		set.add(car1);
//		set.add(3333);		//set �� ������ ��� �ߺ����� ������ ������� �ɷ�����
		
		System.out.println("size : "+set.size());

		java.util.Iterator ite = set.iterator();
		while(ite.hasNext()){
			Car car=(Car) ite.next();
			System.out.println(car.su);
		}
	}

}
