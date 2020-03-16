package learningselenium;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class HtmlReport {
	
	
	ExtentReports report;
	ExtentTest testInfo;
	ExtentHtmlReporter htmlReporter;
	
	WebDriver d;
	
	
	public void screenShot(String ImageName) throws IOException{
		
	    TakesScreenshot ts=(TakesScreenshot)d;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("E:\\"+ImageName+".jpeg"));
	
		}
	  
	
	@BeforeTest
	
	public void  configReport() {
		
		htmlReporter=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Automationreport.html"));
		htmlReporter.loadXMLConfig("C:\\Users\\vishal jaiswal\\Desktop\\selenium\\learningselenium\\extent-confif.xml");
		report=new ExtentReports();
		report.setSystemInfo("Environment", "QA");
		String os=System.getProperty("os.name");
		report.setSystemInfo("OS Name", os);
		String us=System.getProperty("user.name");
		report.setSystemInfo("User Name", us);
	    report.attachReporter(htmlReporter);
	}
	
	@BeforeMethod
	public void register(Method method) {
		
		String TestName=method.getName();
		testInfo=report.createTest(TestName);
		
	}

	
	
	@AfterMethod
	public void captureStatus(ITestResult result) throws IOException {
		if (ITestResult.SUCCESS==result.getStatus())
		{
			testInfo.log(Status.PASS,"Method "+result.getName()+ " is passed" );
			
		}
		else if (ITestResult.FAILURE==result.getStatus())
		{
			testInfo.log(Status.FAIL,"Method "+result.getName()+ " is Failed");
			testInfo.log(Status.FAIL,"The Failure Reason is"+ result.getThrowable());
			screenShot(result.getName());
		}
	
		else 
		{
			testInfo.log(Status.SKIP, "Skipped");
		}
	}
	
	@AfterTest
	public void cleanUp() {
		report.flush();
	}
}
