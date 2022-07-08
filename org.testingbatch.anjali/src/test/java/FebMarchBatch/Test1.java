package FebMarchBatch;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) throws InterruptedException
	{
				//The below code will automatically download chromedriver into local cache folder  whenever you execute
				WebDriverManager.chromedriver().setup();
				//The below code will use downloaded chromedriver and launch new chrome page
				//ChromeDriver driver=new ChromeDriver(); 
				ChromeDriver anjali = new ChromeDriver();
							
				anjali.get("https://www.flipkart.com");
				
				Thread.sleep(6000); // wait for 6 seconds
				 
				anjali.manage().window().fullscreen();//full screenlike maximize, but hide browser window icons;
				
				System.out.println("Hello Anjali, welcome to automation tesing");
				System.out.println(anjali.getCurrentUrl());
							
	}
	}
