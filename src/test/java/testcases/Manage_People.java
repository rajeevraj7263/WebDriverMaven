package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.TestBase;

public class Manage_People extends TestBase {
	@Test
	public void manage_people(){
	driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div[1]/ul/li[1]/ul/li/ul/li[6]/a")).click();

}
}
