package week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateTestCases {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("wipro");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("karthi");
		driver.findElementById("createLeadForm_lastName").sendKeys("karthi");
		driver.findElementByName("firstNameLocal").sendKeys("karthi");
		driver.findElementByName("lastNameLocal").sendKeys("karthi");
		driver.findElementByName("personalTitle").sendKeys("a");
		driver.findElementById("createLeadForm_dataSourceId").sendKeys("Direct Mail");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("project");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("65000");
		driver.findElementByXPath(" //select[@name='industryEnumId']/option[4]").click();
		driver.findElementByXPath(" //select[@name='ownershipEnumId']/option[4]").click();
		driver.findElementByName("sicCode").sendKeys("1234");
		
		
		
		driver.findElementById("createLeadForm_description").sendKeys("");
		driver.findElementById("createLeadForm_importantNote").sendKeys("");
		
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("21");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("654433");
		driver.findElementById("createLeadForm_departmentName").sendKeys("computer science");
	
		driver.findElementByName("submitButton").click();
		driver.close();
		
		
		
		
		

	}


}
