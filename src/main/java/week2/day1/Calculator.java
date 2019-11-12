package week2.day1;



public class Calculator {
	
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
		xx.multiply(5, 2);
		xx.multiply(2.3, 5.5);
		xx.multiply(2, 5, 7);
		

	}

}
