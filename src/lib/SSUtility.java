package lib;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class SSUtility {
	
	public static String fnScreenShot(WebDriver driver,String sshotname) throws Exception
	
	{		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		String dateName = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());		
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/ScreenCapture/"+sshotname+"-"+dateName+".png";
		File finalDestination = new File(destination);
		
			FileUtils.copyFile(source, finalDestination);
			return destination;		
		
		
		
	}
	
	@AfterMethod 
	public String takeScreenShotOnFailure(ITestResult testResult,WebDriver driver,String sshotname) throws IOException { 
		String destination = null;
		if (testResult.getStatus() == ITestResult.FAILURE) { 
			String dateName = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
		
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
			 destination = System.getProperty("user.dir") + "/ScreenCapture/"+sshotname+"-"+dateName+".png";
			File finalDestination = new File(destination);
			
				FileUtils.copyFile(source, finalDestination);
					
		}
		return destination;
	
}
}
