package com.salesforce.qa.testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Bestbuy1 {
	WebDriver driver;
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\webdriverkit\\workspace2\\SalesforceTest\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
	}
	@Test
	public void signintest() throws InterruptedException
	{
		System.out.println("parent Handle"+driver.getWindowHandle());
		WebElement clickelement=driver.findElement(By.xpath("//*[@id='button1']"));
		for(int i=0;i<3;i++)
		{
			clickelement.click();
			Thread.sleep(3000);
		}
		Set<String> wind=driver.getWindowHandles();
		for(String handle:wind)
			System.out.println("windowhandle"+handle);
		driver.quit();
		
		
	
	}
	
		
		
			
		
		
	}


