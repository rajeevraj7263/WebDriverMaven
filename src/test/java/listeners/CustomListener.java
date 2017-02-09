package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utility.TestConfig;
import utility.TestUtil;
import utility.monitoringMail;


public class CustomListener implements ITestListener,ISuiteListener{
	public static monitoringMail mail = new monitoringMail();

	public void onFinish(ITestContext arg0) {


		System.out.println("Mail sent");
		
	}

	public void onStart(ITestContext arg0) {

		System.out.println("Beginning");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		
	
		TestUtil.captureScreenshot();
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a target=\"_blank\" href=\""+TestUtil.screenShotName+"\">Screenshot</a>");
		Reporter.log("<br><a  target='_blank' href=\""+TestUtil.screenShotName+"\" ><img height=200, width=200, src=\""+TestUtil.screenShotName+"\" alt=\"\"/></img></a>");
		
		
		System.out.println("Screenshot Captured");
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ISuite arg0) {
		System.out.println("Mail sent: Suite");
		
	}

	public void onStart(ISuite arg0) {
		System.out.println("Beginning: Suite");
		
	}

}
