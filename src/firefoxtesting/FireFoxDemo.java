package firefoxtesting;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Public\\Downloads\\Eclipse\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver Driver=new FirefoxDriver();
		Driver.get("https://demosite.center/wordpress/wp-login.php");
		String x=Driver.getTitle();
		
		//List<String> titles=(List<String>) Driver.getWindowHandles();
		LinkedHashSet<String> titles=(LinkedHashSet<String>) Driver.getWindowHandles();
		int a=titles.size();
		System.out.println("window handles size "+a);
		
		Iterator<String> itr=titles.iterator();
		
		while(itr.hasNext())
		{
			String b=(String) itr.next();
			System.out.println("window handles "+b);
		}
		
		System.out.println("the url opened is "+x);

	}

}
