package com.salesforce.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.salesforce.qa.base.TestBase;

public class Loginpage extends TestBase {
	
	
	
	@FindBy(name="username")
	@CacheLookup
	WebElement username;

	@FindBy(name="password")
	@CacheLookup
	WebElement password;
	@FindBy(id="login")
	@CacheLookup
	WebElement login;
	public Loginpage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	
	}
	public String getLoginPageUrl()
	{
		return driver.getCurrentUrl();
		
	}
	public void setusername(String uname){
		username.sendKeys(uname);
	}
	public void setpassword(String pwd)
	{
		password.sendKeys(pwd);
	}

public void clicksubmit(){
	login.click();
}

}
