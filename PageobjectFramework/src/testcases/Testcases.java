package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepro.ReddifLoginpage;
import objectrepro.RediffHomepag;

public class Testcases {
	
	@Test
	public void login()
	{    
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\Venzee\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		ReddifLoginpage rd= new ReddifLoginpage(driver);
		rd.Emailid().sendKeys("Hello");
		rd.Password().sendKeys("password");
		rd.Submit().click();
		rd.Home().click();
		RediffHomepag rh= new RediffHomepag(driver);
		rh.Search().sendKeys("test");
		
		
		
		
		
	}

}
