package week1.day5;

import week2.day1.Car;

public class Bmw extends Car {
	public void selfDriving() {
		// TODO Auto-generated method stub
 System.out.println("Self Driving"); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Bmw aa = new Bmw();
     aa.applyBrake();
     aa.selfDriving();
     aa.startEngine();
     
     
	}

}
