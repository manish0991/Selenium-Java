import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\Venzee\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		// Count of links in a page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// Count of link in footer
		
		WebElement footer=driver.findElement(By.xpath("//*[@id='glbfooter']"));
		
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		WebElement column =driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());
		
		// To get all links name 
		for(int i=0; i<column.findElements(By.tagName("a")).size(); i++)
		{
			System.out.println(column.findElements(By.tagName("a")).get(i).getText());
			
			if (column.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
				System.out.println(driver.getTitle());
				column.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
