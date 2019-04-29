package learningselenium;

import org.testng.Assert;

import org.testng.annotations.Test;

public class ListenerExapmle  {
	
	
	@Test
	public void loginFacebook()
	{
		System.out.println("Login Facebook Test ");
		Assert.assertEquals("String11", "String11");
	}
	
	@Test
	public void loginGmail()
	{
		System.out.println("Login Gmail Test ");
		Assert.assertEquals("String1", "String11");
	}


}
