package week1.day1;

public class Car {

	public void applyBrake( ) {
		
		System.out.println("break applied");
		
	}
	
	public void applyAccelarate() {
		System.out.println("acceleration applied");
	}
	public static void main(String args[]) {
		
		Car obj = new Car();
		obj.applyBrake();

		obj.applyAccelarate();
	}
			
}
