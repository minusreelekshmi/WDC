package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider

{

	Properties pro;
	
	// Constructor to initialize variable and object 
	
	public ConfigDataProvider()

	{
		// To read the file
		File src = new File("./src/test/resources/environment.properties");
	
	
	try
	{ 
	  FileInputStream fis=new FileInputStream(src);
  
  //To load Configuration file 
	  
	  pro=new Properties(); 
	  pro.load(fis); 
	  
	} catch  (Exception e) 
	
	{
  
  System.out.println("Not able to load config file >>" +e.getMessage());
  
  }  
	}
  

	public String getDatafromConfig(String keytosearch) 
	{
		return pro.getProperty(keytosearch);
	}

	public String getBrowser() 
	{
		return pro.getProperty("Browser");
	}

	public String getDEV01URL() 
	{
		return pro.getProperty("WDCDEV2URL");
	}

}
