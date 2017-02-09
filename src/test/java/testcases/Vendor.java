package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.TestBase;

public class Vendor extends TestBase{
	@Test
	public void vendor()
	{
		
		driver.findElement(By.linkText(OR.getProperty("vendor"))).click();
	      
	    	     
	}

}
