import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import lib.Utility;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\Venzee\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		//HOw to take screenshot
		// TakesScreenShot is an interface in selenium( we can not create a object of interface) 
		//typecast the driver for takecreenshot
		
		Utility.screenshot(driver, "google");
		
		driver.get("https://facebook.com");
		
		Utility.screenshot(driver, "facebook");
		driver.quit();
	}

}
