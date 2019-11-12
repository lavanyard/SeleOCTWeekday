import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

public class BondWithButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//driver.findElementByXPath("//a[@class='wp-categories-link maxheight' and @href='pages/Button.html']").click();
		//String a = driver.findElement(By.id("position")).getText();
		
		WebElement getButtonPosition= (WebElement) driver.findElement(By.id("position"));
		/*Point xyPoint= getButtonPosition().getLocation();
		int xValue= xyPoint.getX();
		int yValue= xyPoint.getY();
		System.out.println("X value is "+ xValue +"Y value is "+ yValue);*/
		
		/*WebElement colorButton = driver.findElementById("color");
		String color= colorButton.getCssValue("background-color");
		System.out.println("Button color is"+ color);*/
		
		WebElement sizeButton = driver.findElementById("size");
		int height= sizeButton.getSize().getHeight();
		int width= sizeButton.getSize().getWidth();
		System.out.println("Height is"+ height + "Width is "+ width );
		
		driver.findElementById("home").click();
		/*getPosition.sendKeys("");
		WebElement appendBox = driver.findElement(By.xpath(""));
		appendBox.sendKeys("");
		WebElement getTextBox = driver.findElement(By.Name(""));*/
	}

}
