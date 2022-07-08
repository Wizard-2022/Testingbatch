	package org.testingbatch.anjali;

import org.testng.annotations.Test;

public class DependOnTest2 {
	@Test ()
	public void openbrowser()
	{
		System.out.println("Launch Browser");
	    assert(true);
	}

	@Test (dependsOnMethods= {"openbrowser"})
	
	public void login()
	{
		System.out.println("Login");
		assert(false);
	}
}
