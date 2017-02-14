package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.TestBase;

public class Account_Info extends TestBase {
	@Test
	public void account_info(){
	driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div[1]/ul/li[1]/ul/li/ul/li[3]/a")).click();

}
}
