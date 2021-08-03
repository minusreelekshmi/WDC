package utils;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	
	public static String captureScreenshot(WebDriver driver)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String screenshotPath=System.getProperty("user.dir")+"/Screenshots/WDC_"+getCurrentDateTime()+".png";
		
		try {
			FileHandler.copy(src, new File(screenshotPath));
			
			System.out.println("Screenshot Captured");
			
			
		} catch (Exception e) {
			System.out.println("Unable to capture screenshot>>" +e.getMessage());
		}
		return screenshotPath;
	}
	
	
	//Static method can be directly add above to get the screenshot in the format of date(unique value)
	public static String getCurrentDateTime()
	{
		DateFormat customformat=new SimpleDateFormat("MM_dd_yyy_HH_mm_ss");		
		Date currentDate=new Date();		
		return customformat.format(currentDate);
	}
}
