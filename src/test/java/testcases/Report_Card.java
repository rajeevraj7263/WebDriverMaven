package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.TestBase;

public class Report_Card extends TestBase {
	@Test
	public void report_card(){
	driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div[1]/ul/li[1]/ul/li/ul/li[5]/a")).click();

}
}
