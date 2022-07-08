package FebMarchBatch;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	// test 3 : objective is to verify whether site is secured link or non secured link
	// usage of currentURL
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.itsecgames.com");
	String x=driver.getCurrentUrl();
	if (x.startsWith("https"))
	{
		System.out.println("Secured Site");
	}
	else
	{
		System.out.println("Not Secured");
	}
	}
}
