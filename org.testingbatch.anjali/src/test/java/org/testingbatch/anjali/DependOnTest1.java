package org.testingbatch.anjali;

import org.testng.annotations.Test;

public class DependOnTest1 {
	
	@Test (priority=1)
	public void openbrowser()
	{
		System.out.println("Launch Browser");
	}

	@Test (priority=2, dependsOnMethods={"openbrowser"})
	public void login()
	{
		System.out.println("Do Login");
	}
	
	@Test (priority=3, dependsOnMethods={"login"})
	public void sendmail()
	{
		System.out.println("Send Email");
	}
}
