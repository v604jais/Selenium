package learningselenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class DownloadPractise {

	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		

		//set property of driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal jaiswal\\Desktop\\selenium\\learningselenium\\Files\\chromedriver.exe");
		
		
		//instantiate the driver
		WebDriver driver= new ChromeDriver();
		
		//launch the browser
		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//get link of dowmload
		//WebElement DL=driver.findElement(By.linkText("Test File to Download"));
	    //String sourcePage= DL.getAttribute("href");
		String wget_command="cmd /c C:\\Wget\\wget.exe -P E: --no-check-certificate http://toolsqa.com/wp-content/uploads/2016/09/Test-File-to-Download.xlsx";
		
	    // snippet for the download 
	  try {
		  Process  exec= Runtime.getRuntime().exec(wget_command);
		  int exitVal=exec.waitFor();
		  System.out.println("Exit value: " + exitVal);
		  
	  }
		catch(InterruptedException e) {System.out.println(e);}
		
		
		
	  driver.close();

	}

}
