package org.testingbatch.anjali;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class DependOnTest3 {
	public void createDriver() {
		WebDriver driver = new ChromeDriver();
		String baseURl = "https://www.toolsqa.com/";
		System.out.println( "Launching Google Chrome browser" ); 
    //driver = new ChromeDriver();
		driver.get(baseURl);
		String testTitle = "Free QA Automation Tools For Everyone";
		String originalTitle = driver.getTitle();
		assert(originalTitle == testTitle);
	}
	
	@BeforeMethod
	public void beforementhod()
	{
		System.out.println("Launch chrome browser");
	}

}
