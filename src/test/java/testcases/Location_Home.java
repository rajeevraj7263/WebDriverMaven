package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.TestBase;

public class Location_Home extends TestBase {
	@Test
	public void location_home(){
	driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div[1]/ul/li[1]/ul/li/ul/li[1]/a")).click();

}
}
