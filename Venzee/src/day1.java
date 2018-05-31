import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class day1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\Venzee\\lib\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://venzee.com");
	System.out.println(driver.getCurrentUrl()); // to print the url to verify open site 
	//System.out.println(driver.getPageSource()); // To get page source 
	System.out.println(driver.getTitle());  // to get page title
	
	// Handel drop down first create select class
	
	WebElement address= driver.findElement(By.xpath("Locator of drop down"));
	Select abc=new Select(address);
	abc.selectByVisibleText("Goa");
	abc.selectByIndex(4);
	abc.selectByValue("Bom");
	
	//You need to swith to alert class
	// POP HANDLING // ALERT Handling  Alert is the method 
	
	Alert al =driver.switchTo().alert();
	al.accept(); // to accept alert 
	al.dismiss(); // to cancel alert 
	Thread.sleep(5000);
	
	
	// Handeling RADIO button
	
    List<WebElement> abcd=driver.findElements(By.xpath(""));
    System.out.println(abcd.size()); //we will get total count 
    abcd.get(1).click();
    
    //Checkbox
    //method:-> IsSelected(); return true or false  checkbox is checked or unchecked 
    if (driver.findElement(By.xpath("")).isDisplayed())
    {
	 System.out.println("is displayed");

	}
    else
    { 
    	System.out.println("is not displayed");
    	abcd.get(0).click();
    	System.out.println(driver.findElement(By.xpath("")).getText());
    
    	}
    
      //Handling iFrame 
      driver.switchTo().frame(1);
      
      // exclip wait 
      
    
    
    }

}
