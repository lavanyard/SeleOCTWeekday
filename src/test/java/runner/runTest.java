package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/java/features/Login.feature","src/test/java/features/invalidLogin.feature"},glue = "steps/Login",
                                  monochrome = true,
                                 plugin= {"pretty","html:reports/Login.html"},
                                      tags = {"~@regression"})

public class runTest extends AbstractTestNGCucumberTests {
	
	

}
