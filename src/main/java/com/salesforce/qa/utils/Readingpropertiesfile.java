package com.salesforce.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Readingpropertiesfile {
	public static Properties prop;
	
public Readingpropertiesfile()
{
	try{
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\configurations\\config.properties");
	prop.load(fis);
	}catch(FileNotFoundException e){
		e.printStackTrace();	
	}catch(IOException e)
	{
		e.printStackTrace();
	}
}

public String getbrowsername()
{
	String browserName= prop.getProperty("browser");
	return browserName;
	
}
public  String getUrlname()
{
	String urlname=prop.getProperty("url");
	return urlname;
}
public  String getusername()
{
	String username=prop.getProperty("username");
	return username;
}
public String getpassword()
{
	String pwd=prop.getProperty("password");
	return pwd;
}
public String getChromepath() {
	// TODO Auto-generated method stub
	String chromepath=prop.getProperty("Chromepath");
	return chromepath;
}
}
