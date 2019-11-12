package steps;

import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectSpecificMethods {
	public static ChromeDriver driver;
	
	public void openApp() {
		System.setProperty("webdriver.chrome.driver", "./drivders.chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	public void closeBrowser() {
		driver.close();
	}
}
