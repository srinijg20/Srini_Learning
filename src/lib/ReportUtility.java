package lib;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportUtility 

{
	static ExtentReports extent;
	static ExtentTest extentTest;
	public static String startReport(String ClassName)
	{
		String dateName = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
		String ReportFile = System.getProperty("user.dir")
		           + "\\Results\\"+ClassName+"\\"+ClassName+"-ReportFile-"+dateName+".html";
			 extent = new ExtentReports(ReportFile, true);
			return ReportFile;
	}
	
	public static void fnReport(String Step,String StepName,String SSPath)
	 {
		 try 
		 {
			extentTest = extent.startTest(Step ,StepName);
			extentTest.log(LogStatus.PASS, StepName);
			extentTest.log(LogStatus.PASS,extentTest.addScreenCapture(SSPath));
			 extent.endTest(extentTest);
			extent.flush();
			
		} catch (Exception e) 
		 {
			// TODO Auto-generated catch block
			extentTest.log(LogStatus.FAIL, e.getMessage());
			extentTest.log(LogStatus.FAIL,extentTest.addScreenCapture(SSPath));
		}
		 
	 }
	public static void fnReport_Fail(String Step,String StepName,String SSPath)
	 {
		 try 
		 {
			extentTest = extent.startTest(Step ,StepName);
			extentTest.log(LogStatus.FAIL, StepName);
			extentTest.log(LogStatus.FAIL,extentTest.addScreenCapture(SSPath));
			 extent.endTest(extentTest);
			extent.flush();
			
		} catch (Exception e) 
		 {
			// TODO Auto-generated catch block
			extentTest.log(LogStatus.FAIL, e.getMessage());
			extentTest.log(LogStatus.FAIL,extentTest.addScreenCapture(SSPath));
		}
		 
	 }
	 
	}


