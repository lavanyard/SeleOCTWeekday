package week1.day5;

public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num= 0, num1=1;
		int a=0;
	
		for(int b=0;b<10;b++)
		{
			a=num+num1;
			System.out.println(a);
			num=num1;
			num1=a;
				
	
		}
		
	
		
		
	}

}
