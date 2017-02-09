package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.TestBase;

public class rrp_emp_reg extends TestBase {
	
	
	@Test(priority=1)
	public void emp_reg()
	{
		
		driver.findElement(By.xpath(OR.getProperty("reg"))).click();
		
	}
	
	@Test(priority=2)
	public void emp_click() 
	{
		
		
		driver.findElement(By.xpath(OR.getProperty("emp"))).click();
		
		
		/*Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.className("lstate")));
	
	
		actions.click();
		
		 actions.sendKeys("Mr.");
		actions.build().perform();*/
		
		 // driver.findElement(By.className("select2-match")).sendKeys("GENERAL");
	}
	

	@Test(priority=3)
	public void emp_click1() 
	{
		
		driver.findElement(By.xpath(OR.getProperty("firstname"))).sendKeys("Rajeev");
		driver.findElement(By.xpath(OR.getProperty("lastname"))).sendKeys("Ranjan");
		driver.findElement(By.xpath(OR.getProperty("email"))).sendKeys("rajeevranjan1@myworkforce.org");
		driver.findElement(By.xpath(OR.getProperty("phonenum"))).sendKeys("9643347559");
		driver.findElement(By.xpath(OR.getProperty("passwd"))).sendKeys("123456");
		driver.findElement(By.xpath(OR.getProperty("cnfrmpasswrd"))).sendKeys("123456");
		driver.findElement(By.xpath(OR.getProperty("next"))).click();
		driver.findElement(By.xpath(OR.getProperty("locname"))).sendKeys("Archdiocese Pastoral Center");
		driver.findElement(By.xpath(OR.getProperty("add"))).sendKeys("gpark");
		driver.findElement(By.xpath(OR.getProperty("city"))).sendKeys("delhi");
		driver.findElement(By.xpath(OR.getProperty("add"))).sendKeys("gpark");
		driver.findElement(By.xpath(OR.getProperty("selectstate"))).sendKeys("Alabama ");
		driver.findElement(By.xpath(OR.getProperty("zip"))).sendKeys("123456");
		//driver.findElement(By.xpath(OR.getProperty("checkbox"))).click();
		// driver.findElement(By.className("term_link")).click();
		((JavascriptExecutor) driver).executeScript("term_link");
		
	}


}