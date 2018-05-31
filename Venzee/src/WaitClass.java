import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitClass {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\Venzee\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Dellete cookies 
		driver.manage().deleteAllCookies();
		
		//Maximize the windows
		driver.manage().window().maximize();
		
		// Implicitlywait // for overall test 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		
		//Exclipt  wait 
		
		Thread.sleep(5000L);  /// only for particual scenario
		
		
		
		
		 
	}

}
