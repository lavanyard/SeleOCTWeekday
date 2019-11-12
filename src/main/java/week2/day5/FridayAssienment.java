package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FridayAssienment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedrivers.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		//driver.findElementByName(using)
		WebDriverWait wait =new WebDriverWait(driver, 15);
		
		
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[5]/button"))).click();
		//find element by xpath
		driver.findElementByXPath("").click();
		//enter vendor name
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		driver.findElementByLinkText("Log Out").click();
		driver.close();
		
		/*driver.findElementsByClassName("navbar-toggle").click();
		driver.findElementByLinkText("Log Out").click();
		driver.close();*/
		
		
		

	}

}
