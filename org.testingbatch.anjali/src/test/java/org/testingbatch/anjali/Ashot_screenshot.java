package org.testingbatch.anjali;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Ashot_screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.co.uk");
		Thread.sleep(5000);
		//Get screenshot of the visible page
		AShot as=new AShot();
		ShootingStrategy
		shs=ShootingStrategies.viewportPasting(1000);
		Screenshot
		ss=as.shootingStrategy(shs).takeScreenshot(driver);
		File dest=new File("FullPageScreenShotJune"
				+""
				+".png");
		ImageIO.write(ss.getImage(),"PNG",dest);
		Thread.sleep(5000);

	}

}
