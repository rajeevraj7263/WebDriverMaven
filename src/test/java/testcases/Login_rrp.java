package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;
import utility.TestUtil;

public class Login_rrp extends TestBase
{
	
	// (dataProvider="getData")
	
	

	@Test(dataProvider="getData")
	public void login(String Username,String Password){
		
			
		// reports.startTest("Validate Logi Test");
		driver.findElement(By.xpath(OR.getProperty("loginbtn"))).click();
		log.debug("Click on login button");
		driver.findElement(By.xpath(OR.getProperty("Username"))).sendKeys(Username);
		log.debug("Username filled");
		driver.findElement(By.xpath(OR.getProperty("Password"))).sendKeys(Password);
		log.debug("Password filled");
		driver.findElement(By.xpath(OR.getProperty("loginclick"))).click();
		log.debug("Successfully login");
		/*
		 * added new comments
		 */
		
		
		// Assert.assertEquals("Home", driver.getTitle());
		
		
		 
		 

		}
		
	 
		
	// Assert.fail("Login is  successfully");
		
		
		
	
		
	
	
	
	
	
	@DataProvider
	public Object[][] getData(){
		
		return TestUtil.getData("Login_rrp");
		
		
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static WebDriver driver;
	public static monitoringMail mail = new monitoringMail();
	
	
	@Parameters("myBrowser")
	@BeforeClass
	public void LaunchBrowser(String myBrowser){
		
		if(myBrowser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}else if(myBrowser.equalsIgnoreCase("Chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\jarfiles\\chromedriver.exe");
			driver=new ChromeDriver();
		}
	}
	
	public static String decode(String encodedPassword)
	{
		byte[] valueDecoded= Base64.decodeBase64(encodedPassword );
		return new String(valueDecoded);
	
	}
	
	
	@Test
	public void Login() throws IOException, AddressException, MessagingException
	{
		
		
		
 driver.get("http://sandbox.resourcerenewalproject.com/");
 
 
 


 //The below method will save the screen shot in d drive with name "screenshot.png"

    
 
    try{
    		
	     driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30L,TimeUnit.SECONDS);
	     driver.findElement(By.xpath("//div[1]/ul/li[1]/a")).click(); 
	     
	     driver.findElement(By.xpath("//div[1]/div/input")).sendKeys("kmcdermott@stjuliana.org");
	    
	     
	     driver.findElement(By.xpath("//div[2]/div/input")).sendKeys(decode("MTIzNDU2"));
	     
	    
	     driver.findElement(By.xpath("//form/div[4]/button")).click();
	     
	     
    driver.findElement(By.xpath("//div[2]/div/div[1]/ul/li/a")).click();
    
    
   
	      driver.findElement(By.xpath("html/body/nav/div/div/div/div[2]/div/div[1]/ul/li/ul/li[2]/a")).click();
	 
	     driver.findElement(By.xpath("html/body/nav/div/div/div/div[2]/div/div[1]/ul/li/ul/li[4]/a")).click();
    }
    
    catch (Throwable t)
    {
    	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(scrFile, new File("D:\\screenshot333.png"));
    	
    	// mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.password,TestConfig.to, TestConfig.subject, t.getMessage(), TestConfig.attachmentPath, TestConfig.attachmentName);
    
    }
    
    
    
       
	}
*/	
}
	

	
	
