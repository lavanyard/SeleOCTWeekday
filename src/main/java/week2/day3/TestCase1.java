package week2.day3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://acme-test.uipath.com/");
		
		String usrName = "kumar.testleaf@gmail.com";
		String pwd = "leaf@12";
			
		driver.findElementById("email").sendKeys(usrName,Keys.TAB);
		driver.findElementById("password").sendKeys(pwd,Keys.TAB);
		driver.findElementById("buttonLogin").click();
		
    	WebDriverWait wait = new WebDriverWait(driver,15);
		WebElement visibleButton = driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[4]");
															 
		wait.until(ExpectedConditions.elementToBeClickable(visibleButton));
		visibleButton.click();
		driver.findElementByPartialLinkText("Search for Vendor").click();			
	}

		

	}

