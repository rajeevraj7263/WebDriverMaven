package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.TestBase;

public class Blog extends TestBase{
	@Test
	public void blog()
	{
		
		driver.findElement(By.linkText(OR.getProperty("blog"))).click();	    
	      
	    	     
	}

}
