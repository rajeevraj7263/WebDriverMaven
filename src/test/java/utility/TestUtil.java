package utility;

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.TestBase;

public class TestUtil extends TestBase{
	
	
	
public static String mailscreenshotpath;
public static String screenShotName;
	
	public static void captureScreenshot() {
		
		
		
		 Calendar cal = new GregorianCalendar();
		  int month = cal.get(Calendar.MONTH); //4
		  int year = cal.get(Calendar.YEAR); //2013
		  int sec =cal.get(Calendar.SECOND);
		  int min =cal.get(Calendar.MINUTE);
		  int date = cal.get(Calendar.DATE);
		  int day =cal.get(Calendar.HOUR_OF_DAY);
		  try {
		
			 
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		screenShotName=year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec+".jpeg";
	   mailscreenshotpath = System.getProperty("user.dir")+"\\test-output\\html\\"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec+".jpeg";
			FileUtils.copyFile(scrFile, new File(mailscreenshotpath));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	   
	}

	public static Object[][] getData(String sheetName){
		
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows-1][cols];
		
		for(int rowNum = 2 ; rowNum <= rows ; rowNum++){ //2
			
			for(int colNum=0 ; colNum< cols; colNum++){
				
				
				data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum); //-2
			
			}
		}
			
		
		
		return data;
		
		
		
	}
}
