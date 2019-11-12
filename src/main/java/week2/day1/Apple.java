package week2.day1;

public class Apple implements SmartPhone{
	
	public void fingerPrint() {
		
		System.out.println("Is accessed");
	}

	public void mobileBrowser() {
	
		System.out.println("Browser");
	}

	public void embededMemory() {
		System.out.println("Is embeded");
		
	}

	public static void main(String[] args) {
	
		Apple a= new Apple();
		a.fingerPrint();
		a.mobileBrowser();
		a.embededMemory();
	}

	

}
