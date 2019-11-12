package week1.day5;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("WebDriver.chrome.drivers", "./drivers.chromedrivers.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://ww25.testleaf.hrokuapp.com/pages/Edit.html");
		
	}

}
