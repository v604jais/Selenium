package learningselenium;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFact {

	WebDriver driver;
	
	public PageFact(WebDriver ldriver) {
		
		this.driver=ldriver;
	}
	
	
	
	


	@FindBy(how=How.NAME, using="q")
	@CacheLookup
	WebElement SearchBox;
	
	@FindBy(how=How.XPATH, using="//div[@class='aajZCb']/ul[@class='erkvQe']")
	@CacheLookup
	List<WebElement> list;
	
	
}
