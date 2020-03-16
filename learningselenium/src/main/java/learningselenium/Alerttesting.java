package learningselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttesting {

	public static void main(String[] args) {
		
		//https://www.guru99.com/alert-popup-handling-selenium.html
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishal jaiswal\\Desktop\\selenium\\learningselenium\\driver\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		d.navigate().to("http://demo.guru99.com/test/delete_customer.php");
		d.manage().window().maximize();
		
		WebElement cusid=d.findElement(By.cssSelector("input[name='cusid'][type='text']"));
		cusid.sendKeys("12345");
		
		WebElement submit=d.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		
		d.switchTo().alert().accept();
		System.out.println( d.switchTo().alert().getText());
		d.switchTo().alert().accept();
		
		WebElement cusid2=d.findElement(By.cssSelector("input[name='cusid'][type='text']"));
		cusid2.sendKeys("12345");
		
		WebElement submit2=d.findElement(By.xpath("//input[@type='submit']"));
		submit2.click();
		d.switchTo().alert().dismiss();

	}

}
