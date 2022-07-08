package FebMarchBatch;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2
{
	public static void main(String[] args) throws InterruptedException
	{
			WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver anjali=new FirefoxDriver(); 
		anjali.get("https://www.amazon.co.uk");
		Thread.sleep(6000);
		System.out.println(anjali.getTitle()); 
		anjali.manage().window().minimize();   
		anjali.close(); 
	}
}
