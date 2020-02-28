package com.salesforce.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.salesforce.qa.base.TestBase;
import com.salesforce.qa.pages.Loginpage;
import com.salesforce.qa.utils.Xls_read;

public class LoginPageDatadrivenTest extends TestBase {
	LoginPageDatadrivenTest()
	{
		super();
	}
	Xls_read xlsread=new Xls_read();
	@Test(dataProvider="LoginData")
	public void loginDDT(String username,String password){
		Loginpage loginpage=new Loginpage();
		loginpage.login(un, pwd);
		logger.info("username provided");
		
		logger.info("password provided");
		
		if(isAlertpresent()==true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("login is failed");
		}
		else
			Assert.assertTrue(true);
		logger.info("login is passed");
		
	}
	
	public boolean isAlertpresent()
	{
		try{
		
		driver.switchTo().alert();
		return true;
		}catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}
	
	@DataProvider(name="LoginData")
	String[][]  getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"src\\main\\java\\com\\salesforce\\qa\\utils\\faxl.xlsx";
		int rowcount=xlsread.getRowCount(path, "sheet1");
		int colcount=xlsread.getCellCount(path, "sheet1", 1);
		String logindata[][]=new String[rowcount][colcount];
		for(int i=1;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=xlsread.getCellData(path, "sheet1", i, j);
			}
		}
		return logindata;
	}
	}


