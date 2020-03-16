package learningselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationStuff {

	public static void main(String[] args) {
		
	 // set path of driver 	
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal jaiswal\\Desktop\\selenium\\learningselenium\\driver\\chromedriver.exe");
	 
      // declare WebDriver 
      WebDriver driver= new ChromeDriver();
      
      //driver object to navigate to URL
      driver.navigate().to("http://www.globalsqa.com/demo-site/sliders/");
      
      // title of the page is 
      driver.manage().window().maximize();
      System.out.println("Tite of the page is : "+driver.getTitle());
      driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
     
      //tab selection
      WebElement tab= driver.findElement(By.xpath("//li[@id='Color Picker']"));
      tab.click();
      //WebElement frame= driver.findElement(By.xpath("//iframe[@class='demo-frame' and @src='../../demoSite/practice/slider/colorpicker.html']"));
      
      //no of i frame on page
      List<WebElement> frame=driver.findElements(By.tagName("iframe"));
      
      //size of list 
      System.out.println("no of frames on page is : "+frame.size());
      
      //switch to frame
      driver.switchTo().frame(3);
      WebElement slider=driver.findElement(By.xpath("//div[@id='red']//span[@tabindex='0']"));
      
     //Action class
      
      Actions action= new Actions(driver);
      action.moveToElement(slider).dragAndDropBy(slider,40,0).build().perform();
	}

}
