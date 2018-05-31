package lib;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static void screenshot(WebDriver driver, String screenshotName)
	{
		
	       try {
	    	   File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(srcfile, new File("D:\\tmp\\"+screenshotName+".png"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Error is"+e.getMessage());
		}
		
	}

}
