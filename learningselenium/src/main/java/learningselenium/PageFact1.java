package learningselenium;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageFact1 {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal jaiswal\\Desktop\\selenium\\learningselenium\\Files\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		
		
		PageFact pf=PageFactory.initElements(driver, PageFact.class);
		//String selectAll = Keys.chord(Keys.CONTROL,"T");
		pf.SearchBox.sendKeys("selenium");
		
		for (WebElement e: pf.list) {
		  
			String data="selenium";
			if(e.getText().equals(data))
		     {
			   e.click();
		     } 
		    else 
		      {
		    	  System.out.println(e.getText());
		      }
		
		}
	}

}
