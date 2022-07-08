package org.testingbatch.anjali;

import org.testng.annotations.Test;

public class TestingNGtest1 {
	
	@Test(description="open browser",timeOut=5000)
	public void method() 
	{
		System.out.println("launch browser");
	}


}
