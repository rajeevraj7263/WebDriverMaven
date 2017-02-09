package testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import utility.TestUtil;

public class Logout extends TestBase {

@Test
public void logout()
{
	
     
    	 driver.findElement(By.xpath(OR.getProperty("dropdown"))).click();
    	// Thread.sleep(4000);
    	 driver.findElement(By.xpath(OR.getProperty("logout"))).click();
    	 driver.findElement(By.xpath(OR.getProperty("loginbtn"))).click();
    	 
    	    
      
    	     
}

}
 		
	

