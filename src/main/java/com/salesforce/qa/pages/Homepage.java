package com.salesforce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.salesforce.qa.base.TestBase;

public class Homepage extends TestBase {
	
	@FindBy(xpath="//span[@class='user-display']")
	WebElement username;

	
			@FindBy(xpath="//span[contains(text(), 'Contacts')]")
			WebElement contactslink;
			@FindBy(xpath="//a[contains (text(),'companies')]")
			WebElement companieslink;
			public Homepage()
			{
				PageFactory.initElements(driver,this);
			}
			public String verifyHomepagTitle()
			{
				return driver.getTitle();
			}
				public boolean verifyusername()
				{
					return username.isEnabled();
				}
			
			public ContactsPage clickOnContactslink()
			{
				contactslink.click();
				return  new ContactsPage();
			}
			public CompaniesPage clickonCompanieslink()
			{
				companieslink.click();
				return new CompaniesPage();
			}
			public ContactsPage clicckonnewcontactslink()
			{
				Actions action=new Actions(driver);
				action.moveToElement(contactslink);
				
				contactslink.click();
				return new ContactsPage();
				
			}

}
