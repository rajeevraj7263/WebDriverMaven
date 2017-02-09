package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
// import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

// import utility.DbManager;
import utility.ExcelReader;
import utility.monitoringMail;

public class TestBase {
	
	/*
	 * Excel
	 * Logs
	 * Properties
	 * WebDriver
	 * mail
	 * jdbc
	 * 
	 */
	
	public static WebDriver driver;
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\testdata.xlsx");
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static Properties OR = new Properties();
	public static Properties Config = new Properties();
	public static FileInputStream fis;
	public static monitoringMail mail = new monitoringMail();
	public static WebDriverWait wait;
    // public static ExtentReports reports =ExtentReports.get(TestBase.class);
	
	
	
	public static boolean isElementPresent(String key){
		try{
		driver.findElement(By.cssSelector(OR.getProperty(key)));
		return true;
		}catch(Throwable t){
			return false;
		}
	}
	
	@BeforeSuite
	public void setUp(){
		
		
		
		 // reports.init("c:\\report\\report.html", true);
		
		
		
		if(driver==null){
			
			
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				OR.load(fis);
				log.debug("OR file loaded");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Config.load(fis);
				log.debug("Config file loaded");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(Config.getProperty("browser").equals("firefox")){
				
				driver = new FirefoxDriver();
			}else if(Config.getProperty("browser").equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "C:\\jarfiles\\chromedriver.exe");
				driver = new ChromeDriver();
				log.debug("Chrome Launched");
			}else if(Config.getProperty("browser").equals("ie")){
				
				driver = new InternetExplorerDriver();
			}
			
			driver.get(Config.getProperty("testsiteurl"));
			log.debug("Navigated to : "+Config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver,5);
			/*try {
				DbManager.setMysqlDbConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		
		
		
	}
	
	@AfterSuite
	public void tearDown() throws InterruptedException{
		
		//Thread.sleep(4000);
		// driver.quit();
	}

}
