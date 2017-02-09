package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class RRP_HOME extends TestBase {
	
	//  driver.findElement(By.xpath(OR.getProperty("home"))).click();
	
@Test
public void home()

{
	
	driver.findElement(By.linkText(OR.getProperty("home"))).click();
	
}

@Test
public void showall()

{
	
	driver.findElement(By.xpath("html/body/div[1]/div/div[5]/div[2]/div[1]/div[2]/div[2]/div[2]/a")).click();
	
}


/*@Test
public void icon()
{
	driver.findElement(By.xpath(OR.getProperty("showall"))).click();
}
@Test
public void archievenoti()
{
	
	// driver.findElement(By.id(OR.getProperty("archievenoti"))).click();
	
	int ok_size=driver.findElements(By.id("#archive-notification-tab")).size();

	driver.findElements(By.id("#archive-notification-tab")).get(ok_size-1).click();
	
	
	driver.findElement(By.xpath("//p[3]/a")).click();
	
	
}
@Test
public void closenoti()
{
	driver.findElement(By.cssSelector(OR.getProperty("closenoti"))).click();
}
*/
}