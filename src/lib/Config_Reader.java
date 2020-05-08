package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

@SuppressWarnings("unused")
public class Config_Reader 
{
	Properties strProp=new Properties();
	public Config_Reader()
	{
		try {
			File src=new File("./Configuration/Config.property");
			FileInputStream strFile;		
			strFile = new FileInputStream(src);			
			//strProp=new Properties();		
			strProp.load(strFile);
		} 
		catch (Exception e) 
		{
			
			System.out.println("Exception occured is ==== "+e.getMessage());
		} 
	}
	
	public String getDriverPath(String strType)
	{
		String Driver_type = null;
		switch (strType) 
		{
		case "Chrome":
			 Driver_type=strProp.getProperty("ChromeDriver");
			break;
		case "FireFox":
			 Driver_type=strProp.getProperty("GeckoDriver");
			break;
		case "IE":
			 Driver_type=strProp.getProperty("IEDriver");
			break;
		}
		
		return Driver_type;		
		
		
		}
		
	
	
	public String getURL()
	{
		return strProp.getProperty("BaseURL");
		
	}
	public String getUsername()
	{
		return strProp.getProperty("EPW_USERNAME");
		
	}
	public String getPWD()
	{
		return strProp.getProperty("EPW_PWD");
		
	}
	
	public String getClient_Acct()
	{
		return strProp.getProperty("CLIENT_ACCT");
		
	}
    
	public String getPG()
	{
		return strProp.getProperty("PG");
		
	}
	
	public String getREGION()
	{
		return strProp.getProperty("REGION");
		
	}
	
	public String getClient()
	{
		return strProp.getProperty("CLIENT");
		
	}
	
	public String getFund()
	{
		return strProp.getProperty("FUND");
		
	}
}
