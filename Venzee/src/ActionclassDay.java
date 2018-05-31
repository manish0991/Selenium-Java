import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionclassDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\Venzee\\lib\\chromedriver.exe");	
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
         Actions abc=new Actions(driver); // as a arug passing driver object 
         WebElement mouse=driver.findElement(By.xpath(""));
         abc.moveToElement(mouse).build().perform();
         WebElement xyz=driver.findElement(By.xpath(""));
         abc.keyDown(Keys.SHIFT).moveToElement(xyz).sendKeys("mi").build().perform();
         abc.contextClick(xyz).build().perform();
	}

}
