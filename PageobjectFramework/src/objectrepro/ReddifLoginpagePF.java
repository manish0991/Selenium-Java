package objectrepro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReddifLoginpagePF {
	
	WebDriver driver;
	public ReddifLoginpagePF(WebDriver driver)
	{
		this.driver=driver;  //this keyword represends local driver 
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath=".//*[@id='login']")
	WebElement username;
	
	@FindBy(xpath=".//*[@id='login']")
	WebElement password;
	
	@FindBy(xpath=".//*[@id='login']")
	WebElement submit;
	
	
	public WebElement Emailid(){
		return username;
		
		
	}
	public WebElement Password(){
		return password;
		
		
	}
	public WebElement Submit(){
		return submit;
		
		
	}
	
}
