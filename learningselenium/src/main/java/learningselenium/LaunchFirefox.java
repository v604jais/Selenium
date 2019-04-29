package learningselenium;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {


	
	public static void main(String[] args) {
	   
		//interface Declaration
		WebDriver driver;
		// set path of driver
		String path="\\Users\\vishal jaiswal\\Desktop\\selenium\\learningselenium\\driver\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", path);
		driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		
	}

}
