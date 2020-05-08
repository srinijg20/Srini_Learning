/**
 * 
 */
package com.wordpress.TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.wordpress.Pages.LoginPage;

import lib.Config_Reader;
import lib.Read_TestData;
import lib.ReportUtility;
import lib.SSUtility;

/**
 * @author srinipriya
 *
 */
public class WordPressLogin 
{
	WebDriver Driver;
	XSSFWorkbook wb;
	XSSFSheet sh1;
	static Config_Reader config;
	static ExtentReports extent;
	Read_TestData temp1;
	ExtentTest extent1;
	public Read_TestData TD;
	//String ReportPath;
	//public static void main(String[] args) throws Throwable 
	
	@BeforeMethod
	public void setUP() throws Exception	
	{
		config=new Config_Reader();
		WordPressLogin item1=new WordPressLogin();
		String ReportPath=ReportUtility.startReport(item1.getClassName());	
		ReportUtility.fnReport("Step1", "Driver intialized","");
		System.setProperty("webdriver.gecko.driver", config.getDriverPath("FireFox"));
		Driver=new FirefoxDriver();
		ReportUtility.fnReport("Step2", "URL Launched","");
		Driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		TD=new Read_TestData("C:\\Users\\srinipriya\\eclipse-workspace\\JavaLearning\\Test_Data\\Test_Data.xlsx");
	}
	@Test
	public void fnLogin() throws Exception
	{
	Driver.get((String) TD.fnReadData("Test_Data", "TS_TC01", "URL"));
	Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Driver.manage().window().maximize();
	String title=Driver.getTitle();
	System.out.println(title);
	String eTitle="eBay";
	
	if (title.contains(eTitle))
	{
		String S1=SSUtility.fnScreenShot(Driver, "Title Verification");
		ReportUtility.fnReport("Step8", "Title Verification", S1);
	}
		else 
		{
			String S1=SSUtility.fnScreenShot(Driver, "Title Verification");
			ReportUtility.fnReport_Fail("Step8", "Title Verification", S1);
		
		
	}
	String SS1=SSUtility.fnScreenShot(Driver, "Browser Maximized");
	ReportUtility.fnReport("Step3", "Browser Maximized",SS1);
	//logger.info("browser maximized");	
	LoginPage Login=new LoginPage(Driver);
	temp1=new Read_TestData("C:\\Users\\srinipriya\\eclipse-workspace\\JavaLearning\\Test_Data\\Test_Data.xlsx");
	String SS2=SSUtility.fnScreenShot(Driver, "Login credentials entered");
	ReportUtility.fnReport("Step4", "Login credentials entered",SS2);
	//logger.info("Login credentials entered");
	Login.fnEnterUsername( temp1.fnReadData("Test_Data", "TS_TC01","User_Name"));
	//Login.fnClickContinue();
	Login.fnEnterPassword(temp1.fnReadData("Test_Data", "TS_TC01","Pwd"));
	Login.fnClickLogin();
	String SS3=SSUtility.fnScreenShot(Driver, "HomePage");
	ReportUtility.fnReport("Step5", "Login Successful",SS3);
	
	//Driver.get(ReportPath);
	//logger.info("login successfull");
	//Driver.quit();
	
	}
	
	public  String getClassName() 
	  {
	        String className = this.getClass().getSimpleName(); 
	        return className;
	        
	    }
	@AfterMethod
	public void tearDown()
	{
		//Driver.close();
		Driver.quit();
	}
	

}
