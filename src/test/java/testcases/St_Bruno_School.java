package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class St_Bruno_School extends TestBase {
	@Test
	public void st_bruno_school(){
	driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div[1]/ul/li[1]/ul/li/a")).click();
	// Assert.fail();
}
}
