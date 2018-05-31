import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.os.WindowsUtils;

public class HttpHandel {

	public static void main(String[] args) {
		
		
		// https certification only for firefox, no need to for Chrome
		//  as we already set property if using chrome 

		
		FirefoxProfile prof= new FirefoxProfile();
		prof.setAcceptUntrustedCertificates(false);
		WebDriver driver= new FirefoxDriver(prof);
		//driver.get("google.com");
		
		//if you want to kill program after using it 
        //WindowsUtils is a class 
		WindowsUtils.tryToKillByName("Notepad.exe");
		
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\Venzee\\lib\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		//driver.get("https://google.com");
        Set<Cookie>	abc =driver.manage().getCookies();
		System.out.println(abc.size());
		driver.manage().deleteAllCookies(); // for deleteing all cookies
	}

}
