package learningselenium;

import org.testng.annotations.*;

public class TestNG2 {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test2");
	}
	@Test
	public void test()
	{
		System.out.println("Test2");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest2");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	

}
