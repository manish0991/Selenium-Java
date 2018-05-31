package objectrepro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReddifLoginpage {
	
	WebDriver driver;
	public ReddifLoginpage(WebDriver driver)
	{
		this.driver=driver;  //this keyword represents local driver 
	}
	
	By username=By.xpath("");
	By password=By.xpath("");
	By submit=By.xpath("");
	By home=By.xpath("");
	
	public WebElement Emailid(){
		return driver.findElement(username);
		
		
	}
	public WebElement Password(){
		return driver.findElement(password);
		
		
	}
	public WebElement Submit(){
		return driver.findElement(submit);
		
		
	}
	public WebElement Home(){
		return driver.findElement(home);
		
		
	}
	
}
