package learningselenium;



import java.io.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception{
		
	    //setting path of driver
		System.setProperty("webdriver.chrome.driver", "\\Users\\vishal jaiswal\\Desktop\\selenium\\learningselenium\\driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		String ConfigPath=System.getProperty("user.dir")+"\\Files\\Config.properties";
		File file=new File(ConfigPath);
		FileInputStream fin=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fin);
		;
		
		
		
	    //Navigating to google
		driver.get((String) prop.get("GoogleURL"));
		
		//maximizing
		driver.manage().window().maximize();
		
		//1.by relative Xpath
		
	    WebElement GoogleSearchBox= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	    GoogleSearchBox.sendKeys("www.facebook.com");
	    List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbtc']"));
	  
	    System.out.println("Total number of suggestion===>"+list.size());
	    
	    for(int i=0;i<list.size();i++) {
	    	
	    	System.out.println(list.get(i).getText());
	    	
	        if(list.get(i).getText().equals(prop.get("Appurl"))) {
	    	
	    	list.get(i).click();
	    	break;
	        }
	    
	   }
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}
}


