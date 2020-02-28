package com.salesforce.qa.testcases;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.salesforce.qa.base.TestBase;

public class SearchTest  {
	WebDriver driver;
	@Test
	public void verifylinks()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\webdriverkit\\workspace2\\SalesforceTest\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		String url;
		HttpURLConnection huc=null;
		driver.findElement(By.xpath("//a[contains( text(), 'Top Deals')]")).click();
		driver.navigate().back();
		List<WebElement>wb=driver.findElements(By.xpath("//a"));
        Iterator<WebElement> w = wb.iterator();	
       while( w.hasNext())
        {
        	System.out.println(w.next());
        	
        }
       for(int i=0;i<wb.size();i++)
       {
    	   System.out.println(wb.get(i).getText());
       }
       for(WebElement ele:wb)
       {
    	   //System.out.println(ele.getAttribute("id"));
    	   url=ele.getAttribute("href");
    	   if(url==null||url.isEmpty())
    	   {
    		   System.out.println("url is not configured for anchor tag");
    		   continue;
    	   }
    	   try{
    		   huc=(HttpURLConnection)(new URL(url).openConnection());
    		   huc.setRequestMethod("HEAD");
    		   huc.connect();
    		   int rescode=huc.getResponseCode();
    		   if(rescode>=400)
    			   System.out.println("Broken links");
    		   else
    			   System.out.println("valid link");
    		   
    	   }catch(Exception e)
    	   {
    		   e.printStackTrace();
    	   }
       }
       
		
	}
	

}
