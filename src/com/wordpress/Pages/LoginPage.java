/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author srinipriya
 *
 */
public class LoginPage 

{	
	WebDriver Driver;
	//By Username= By.xpath("//input[cointains(text(),'usernameOrEmail']");
	By User1=By.id("userid");
	By ClickContinue=By.xpath("//button[contains(text(),'Continue')]");
	By Pass1=By.xpath("//input[@id='pass']");
	By ClickLogin=By.xpath("//button[@id='sgnBt']");
	
	public LoginPage(WebDriver Driver)
	{
		this.Driver=Driver;
	}
	
	public void fnEnterUsername(Object object)
	{
		
		Driver.findElement(User1).sendKeys((CharSequence) object);
	}
	
	public void fnClickContinue()
	
	{
		Driver.findElement(ClickContinue).click();
	}
	
	public void fnEnterPassword(Object object)
	{
		Driver.findElement(Pass1).sendKeys((CharSequence) object);
	}
	
	public void fnClickLogin()
	{
		Driver.findElement(ClickLogin).click();
	}
	
	
	

}
