package org.testingbatch.anjali;
import org.testng.annotations.Test;

public class PriorityTestcase1 
{
	@Test(priority=3)
	public void openbrowser()
	{
		System.out.println("send a mail");
		}
	
	@Test(priority=2)
	public void login() 
	{
		System.out.println("login");
	}
	
	@Test(priority=1)
	public void launchbrowser()
	{
		System.out.println("launch browser");
	}
	@Test(priority=4)
	public void closebrowser()
	{
		System.out.println("close browser");
	}
	
	}
