package org.testingbatch.anjali;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;


public class DependOnTest3 {
	
	WebDriver driver;
	String baseURl="https://www.toolsqa.com/";
	System.out.println("Launching Google Chrome browser"); 
    driver = new ChromeDriver();
    driver.get(baseUrl);
    String testTitle = "Free QA Automation Tools For Everyone";
    String originalTitle = driver.getTitle();
    Assert.assertEquals(originalTitle, testTitle);
	
	@BeforeMethod
	public void beforementhod()
	{
		System.out.println("Launch chrome browser");
	}

}
