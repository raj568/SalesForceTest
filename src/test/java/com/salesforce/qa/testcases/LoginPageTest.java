
package com.salesforce.qa.testcases;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.salesforce.qa.base.TestBase;
import com.salesforce.qa.pages.Loginpage;


public class LoginPageTest extends TestBase {
	Loginpage loginpage;
	LoginPageTest()
	{
		super();
	}
	
	 
	
	@Test(priority=3, groups="Title")
	public void loginPageTitileTest()
	{
		logger.info("testcase1");
		String title=loginpage.validateLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "AdactIn.com - Search Hotel");
		
	}
	@Test(priority=2,groups="Title")
	public void loginPageUrlTest()
	{
		logger.info("testcase2");
		String title1=loginpage.getLoginPageUrl();
		System.out.println(title1);
		//Assert.assertEquals(title1, "https://adactin.com/HotelApp/");
		
	}
	@Test(priority=1)
	public void loginTest()
	{
		loginpage=new Loginpage();
		loginpage.login(un,pwd);
		
	}


}
