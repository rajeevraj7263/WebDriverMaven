package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import base.TestBase;

public class Employee_discount extends TestBase {
	
	
	@Test
	public void discount()
	{
		
		
		 
		driver.findElement(By.linkText(OR.getProperty("emp_dsct"))).click();
		
	    	 
	    	    
	      
	    	     
	}
	
	

}
