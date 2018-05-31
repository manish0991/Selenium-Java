import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\Venzee\\lib\\chromedriver.exe");	
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions a=new Actions(driver);
        driver.get("https://www.hdfcbank.com/");
        driver.findElement(By.xpath("")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("")).click();
        
	}

}
