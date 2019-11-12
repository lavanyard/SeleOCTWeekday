package week3.day2;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedrivers.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[@id='color']").click();
		Set<String> winSet = driver.getWindowHandles();
		ArrayList<String> winList = new ArrayList<String>(winSet);
		String parentWindow = winList.get(0);
		//String secWindow = winList.get(1);
		//String thirWindow = winList.get(2);
		for(String a : winList) {
			if(a!=parentWindow) {
				driver.switchTo().window(a).close();
			}
		}
		//driver.switchTo().window(secWindow).close();
		//driver.switchTo().window(thirWindow).close();
		
		

	}

}
