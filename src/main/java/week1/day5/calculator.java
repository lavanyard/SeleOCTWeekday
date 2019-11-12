package week1.day5;

import week1.day1.Calculator;

public class calculator {
	
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	public void multiply(double a, double b) {
		System.out.println(a*b);
	}

	public void multiply(int a, int b,int c) {
		System.out.println(a*b*c);
	}


	public static void main(String[] args) {
		Calculator xx = new Calculator();
		xx.mul(5, 2);
		//xx.mul(2.3, 5.5);
		//xx.mul(2, 5, 7);
		

	}

}
