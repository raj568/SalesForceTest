package com.salesforce.qa.base;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.salesforce.qa.utils.Readingpropertiesfile;
import com.salesforce.qa.utils.Testutil;

public class TestBase {
public static WebDriver driver;
public static Logger logger;
public String url;
public String browser ;
public String un;
public String pwd;
public String chromepath;
public TestBase(){
	

	 Readingpropertiesfile readconfig=new Readingpropertiesfile();
	  url=readconfig.getUrlname();
	   //browser=readconfig.getbrowsername();
	  un=readconfig.getusername();
	  pwd=readconfig.getpassword();
	  chromepath=readconfig.getChromepath();
}
	  
	
	
	@Parameters("browser")
	@BeforeClass
	public  void initialization(String browser)
	{
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",chromepath);
			driver=new ChromeDriver();
		}
		
logger=Logger.getLogger("TestBase");
PropertyConfigurator.configure("Log4j.properties");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUTS,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get(url);
		
	}
	@AfterClass
	public void teardown()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	

}
