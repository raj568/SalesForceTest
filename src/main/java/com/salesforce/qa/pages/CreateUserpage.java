package com.salesforce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.salesforce.qa.base.TestBase;

public class CreateUserpage extends TestBase {
	@FindBy(xpath="//a[contains(text(),'New User Register Here')]")
	WebElement userlink;
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	@FindBy(id="re_password")
	WebElement cpassword;
	@FindBy(id="full_name")
	WebElement fullname;
	@FindBy(name="email_add")
	WebElement email1;
	@FindBy(xpath="//input[@id='tnc_box']")
	WebElement agreeterms;
	@FindBy(xpath="//input[@type='submit']")
	WebElement register;
	public CreateUserpage()
	{
		
		PageFactory.initElements(driver, this);
	}
	public void clickaddnewuser()
	{
		userlink.click();
	}
	public void setusername(String name)
	{
		username.sendKeys( name);
	}
	public void setpassword(String pwd)
	{
		password.sendKeys( pwd);
	}
	public void setcpassword(String cpwd)
	{
	cpassword.sendKeys(cpwd);
	}
	public void setfullname(String fname)
	{
		fullname.sendKeys(fname);
	}
	public void setemail(String mail){
		email1.sendKeys(mail);
	}
	public void agreeterms()
	{
		agreeterms.click();
	}
	public void register()
	{
		register.click();
	}
	
		
	
}
