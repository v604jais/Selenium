package learningselenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\vishal jaiswal\\Desktop\\selenium\\learningselenium\\Files\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://www.toolsqa.com/automation-practice-form/");
	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//input[@id='photo']")).click();;
	  Thread.sleep(5000);
	  Runtime.getRuntime().exec("C:\\Users\\vishal jaiswal\\Upload.exe");
      
	}

}
