package objectrepro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomepag {
	
	WebDriver driver;
	public RediffHomepag(WebDriver driver)
	{
		this.driver=driver;  //this keyword represends local driver 
	}
	
	By search=By.id("test");
	
	
	public WebElement Search(){
		return driver.findElement(search);
		
	}
	
}
