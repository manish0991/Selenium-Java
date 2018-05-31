package testNGfiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation2 {
	
	@BeforeSuite
	public void installsoftware ()
	{
		System.out.println("Install Software");
	}

	@AfterSuite
	public void Uninstallsoftware()
	{
		System.out.println("Uninstall Software");
	}
	
	@Test
	public void firstTest()
	{
		System.out.println("I'm the test");
	}
}
