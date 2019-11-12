package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends ProjectSpecificMethods {
	
	@Given("Open Chrome Browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver =new ChromeDriver();
	
	}

	@Given("Launch Url")
	public void launchUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");

	}
	@Given("Enter username as (.*)")
	public void enter_password_as_Demosalesmanager(String uName) {
		driver.findElementById("username").sendKeys(uName);
		
	}

	@Given("Enter password as (.*)")
	public void enter_password_as_crmsfa(String pass) {
		driver.findElementById("password").sendKeys(pass);
	}

	@When("Click on Login Button")
	public void click_on_Login_Button() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("verify Homepage is displayed")
	public void verify_Homepage_is_displayed() {
	    System.out.println("home page is displayed");
	}
	@When ("Click on crmsfa link")
	public void clickOnCrmsfaLink() {
		driver.findElementByLinkText("CRM/SFA").click();

	}
	@Then ("Verify myhome page")
	public void myHomePage() {
		System.out.println("my home page is displayed");
	}
	
	@But ("verify error message")
	public void verifyError() {
		System.out.println("error message displayed");
	}
}
