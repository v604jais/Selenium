package learningselenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling extends HtmlReport {

	@Test
	public static void Window() {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vishal jaiswal\\Desktop\\selenium\\learningselenium\\driver\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		d.get("http://demo.guru99.com/popup.php");
		d.manage().window().maximize();
		
		WebElement click=d.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		click.click();
		
		 String MainWindow=d.getWindowHandle();
		 Set<String> s1=d.getWindowHandles();
		 
		 Iterator <String> i1=s1.iterator();
		
		 while (i1.hasNext()) {
			 
			 String ChildWindow=i1.next();
			 
			 if (!MainWindow.equalsIgnoreCase(ChildWindow))
			 {
				 d.switchTo().window(ChildWindow);
				 d.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
				 WebElement emailbox=d.findElement(By.xpath("//input[@name='emailid']"));
				 emailbox.sendKeys("vjaiswal090@gmail.com");
				 d.findElement(By.xpath("//input[@type='submit']"));
				 //closing child window
				 d.close();
			 }
		 }
         d.switchTo().window(MainWindow);
	}

}
