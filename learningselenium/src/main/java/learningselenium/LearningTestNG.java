package learningselenium;

import org.testng.annotations.*;

public class LearningTestNG {
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("Intialize class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Inside Before Method");
	}
	@Test
	public void insideTest1() {
		System.out.println("Inside Test1");
	}
	@Test
	public void insideTest2() {
		System.out.println("Inside Test2");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Inside After Method");
	}
	@AfterClass
	public void afterClass(){
		System.out.println("Destroy class");
	}
	@AfterTest
	public void AfterTest(){
		System.out.println("AfterTest");
	}
}
