package learningselenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class ReportPractise extends HtmlReport{
	
	
	@Test
	public void test1()
	{
		
		testInfo.log(Status.INFO,"This is test1 method" );
		Assert.assertEquals("Ram", "Ram");
	}
	
	@Test
	public void test2()
	{   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal jaiswal\\Desktop\\selenium\\learningselenium\\driver\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		d.get("https://www.google.com");
		Assert.assertEquals("Ram", "Shyam");
		testInfo.log(Status.INFO,"This is test2 method" );
	}
	
	@Test
	public void runReport() throws IOException {
		Assert.assertTrue(true);
		testInfo.log(Status.PASS, "Successfully used in another class");
		
	}

}
