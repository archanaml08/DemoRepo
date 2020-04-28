package MavenPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;



public class WebPageTest {
	
	@BeforeClass
	public void setUp()
	{
		System.out.println("Launching the Browser");
	}

	@Test
	public void login()
	{
		System.out.println("login to application");
	}
	
	@Test
	public void payment()
	{
		System.out.println("make the payment");
	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("Logout and close the browser");
	}
}
