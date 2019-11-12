package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/sortable.html");
		WebElement a = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement b= driver.findElementByXPath("//li[text()='Item 4']");
		Actions builder=new Actions(driver);
		(builder).dragAndDrop(a, b).perform();



	}

}
