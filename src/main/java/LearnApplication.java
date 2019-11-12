import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnApplication {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",  "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/logout");
		
		WebElement username = driver.findElementByName("username");
		username.sendKeys("demosalesmanager");
		WebElement id = driver.findElementById("password");
		id.sendKeys("crmfa");
		
		WebElement loginButton = driver.findElementByClassName("decorativeSubmit");
		loginButton.click();
		driver.findElementByPartialLinkText("CRM/").click();

	}

}
