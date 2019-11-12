package week2.day1;

public class Desktop implements Software{

	void desktopModel() {
		
	}
	public void hardwareResources() {
	
    	System.out.println("Hardware Resourses");
	}

	public void softwareResources() {
		System.out.println("Software Resourses");
	
		}

	
	public static void main(String[] args) {
		
		Desktop a= new Desktop();
		a.hardwareResources();
		a.softwareResources();
		

	}

	
}
